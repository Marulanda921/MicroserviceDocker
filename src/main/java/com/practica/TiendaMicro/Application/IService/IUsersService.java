package com.practica.TiendaMicro.Application.IService;

import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.UserRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.UserResponse;
import com.practica.TiendaMicro.Infraestructure.Persistence.Helpers.CrudService;

public interface IUsersService extends CrudService<UserRequest, UserResponse, Integer> {
}
