package com.practica.TiendaMicro.Infraestructure.Adapter.Web.Response;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentResponse {
    private int id;
    private String content;
    private LocalDateTime timestamp;
    @JsonBackReference
    private TaskResponse task;
}
