package com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

public class TaskResponse {
    private int id;
    private String title;
    private String description;
    private String status;
    private UserResponse user;
    private ProjectResponse project;
    @JsonManagedReference
    private List<CommentResponse> comments;
}
