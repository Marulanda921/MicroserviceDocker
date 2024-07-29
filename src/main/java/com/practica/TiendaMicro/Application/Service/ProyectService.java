package com.practica.TiendaMicro.Application.Service;

import com.practica.TiendaMicro.Application.IService.IProjectsService;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.ProjectRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.ProjectResponse;
import org.springframework.data.domain.Page;

public class ProyectService implements IProjectsService {
    @Override
    public ProjectResponse create(ProjectRequest request) {
        return null;
    }

    @Override
    public Page<ProjectResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public ProjectResponse get(Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public ProjectResponse update(ProjectRequest request, Integer integer) {
        return null;
    }
}
