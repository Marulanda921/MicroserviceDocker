package com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request;

import jakarta.validation.constraints.NotBlank;

public class CommentRequest {
    @NotBlank(message = "Content is obligatory")
    private String content;
    private Integer taskId; // Referencia al ID de la tarea asociada
}
