package com.practica.TiendaMicro.Application.Service;

import com.practica.TiendaMicro.Application.IService.ICommentsService;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.UserRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.UserResponse;
import org.springframework.data.domain.Page;

public class CommentService implements ICommentsService {
    @Override
    public UserResponse create(UserRequest request) {
        return null;
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public UserResponse get(Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public UserResponse update(UserRequest request, Integer integer) {
        return null;
    }
}
