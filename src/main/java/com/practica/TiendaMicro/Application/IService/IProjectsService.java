package com.practica.TiendaMicro.Application.IService;

import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.ProjectRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.ProjectResponse;
import com.practica.TiendaMicro.Infraestructure.Persistence.Helpers.CrudService;

public interface IProjectsService extends CrudService<ProjectRequest, ProjectResponse, Integer> {
}
