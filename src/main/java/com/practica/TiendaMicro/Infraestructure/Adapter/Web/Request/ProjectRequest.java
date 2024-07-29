package com.practica.TiendaMicro.Infraestructure.Adapter.Web.Request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProjectRequest {
    @NotNull(message = "Name is obligatory")
    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
    private String name;

    @Size(min = 1, max = 500, message = "Description must be between 1 and 500 characters")
    private String description;
}
