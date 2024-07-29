package com.practica.TiendaMicro.Application.Service;

import com.practica.TiendaMicro.Application.IService.IUsersService;
import com.practica.TiendaMicro.Domain.Exception.ResourceNotFoundException;
import com.practica.TiendaMicro.Domain.Model.Users;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.UserRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.UserResponse;
import com.practica.TiendaMicro.Infraestructure.Persistence.Repository.UsersRepository;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService implements IUsersService {

    @Autowired
    private final UsersRepository usersRepository;
    @Autowired
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public UserResponse create(UserRequest request) {
        Users user = modelMapper.map(request, Users.class);
        Users savedUser = usersRepository.save(user);
        return modelMapper.map(savedUser, UserResponse.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<UserResponse> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Users> usersPage = usersRepository.findAll(pageable);
        return usersPage.map(user -> modelMapper.map(user, UserResponse.class));
    }

    @Override
    @Transactional(readOnly = true)
    public UserResponse get(Integer id) {
        Optional<Users> userOptional = usersRepository.findById(id);
        return userOptional.map(user -> modelMapper.map(user, UserResponse.class))
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
        usersRepository.delete(user);
    }

    @Override
    @Transactional
    public UserResponse update(UserRequest request, Integer id) {
        Users existingUser = usersRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));

        modelMapper.map(request, existingUser);
        Users updatedUser = usersRepository.save(existingUser);
        return modelMapper.map(updatedUser, UserResponse.class);
    }
}
