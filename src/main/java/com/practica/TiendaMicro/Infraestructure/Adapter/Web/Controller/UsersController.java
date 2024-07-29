package com.practica.TiendaMicro.Infraestructure.Adapter.Web.Controller;

import com.practica.TiendaMicro.Application.IService.IUsersService;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.UserRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.UserResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

    @Autowired
    private final IUsersService iUsersService;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest userRequest) {
        UserResponse userResponse = iUsersService.create(userRequest);
        return ResponseEntity.ok(userResponse);
    }

    @GetMapping
    public Page<UserResponse> getAllUsers(@RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "10") int size) {
        return iUsersService.getAll(page, size);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable Integer id) {
        UserResponse userResponse = iUsersService.get(id);
        return ResponseEntity.ok(userResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@Valid @RequestBody UserRequest userRequest, @PathVariable Integer id) {
        UserResponse userResponse = iUsersService.update(userRequest, id);
        return ResponseEntity.ok(userResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        iUsersService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
