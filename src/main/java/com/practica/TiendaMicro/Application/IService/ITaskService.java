package com.practica.TiendaMicro.Application.IService;

import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.TaskRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.TaskResponse;
import com.practica.TiendaMicro.Infraestructure.Persistence.Helpers.CrudService;

public interface ITaskService extends CrudService<TaskRequest, TaskResponse, Integer> {
}
