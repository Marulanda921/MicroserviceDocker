package com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TaskRequest{
    @NotBlank(message = "Title is obligatory")
    @Size(min = 5, max = 100, message = "Title must be between 5 and 100 characters")
    private String title;
    @NotBlank(message = "Description is obligatory")
    @Size(min = 5, max = 200, message = "Description must be between 5 and 200 characters")
    private String description;
    @NotNull(message = "Status is obligatory")
    private String status;
    private Integer userId; // Referencia al ID del usuario asociado
    private Integer projectId; // Referencia al ID del proyecto asociado
}
