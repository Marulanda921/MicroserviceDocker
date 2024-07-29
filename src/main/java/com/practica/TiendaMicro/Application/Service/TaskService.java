package com.practica.TiendaMicro.Application.Service;

import com.practica.TiendaMicro.Application.IService.ITaskService;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request.TaskRequest;
import com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response.TaskResponse;
import org.springframework.data.domain.Page;

public class TaskService implements ITaskService {
    @Override
    public TaskResponse create(TaskRequest request) {
        return null;
    }

    @Override
    public Page<TaskResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public TaskResponse get(Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public TaskResponse update(TaskRequest request, Integer integer) {
        return null;
    }
}
