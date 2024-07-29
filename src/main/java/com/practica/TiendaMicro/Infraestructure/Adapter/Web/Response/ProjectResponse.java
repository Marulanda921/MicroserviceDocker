package com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectResponse {
    private int id;
    private String name;
    private String description;
    @JsonManagedReference
    private List<TaskResponse> tasks;
}
