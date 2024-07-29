package com.practica.TiendaMicro.Infraestructure.Persistence.Repository;

import com.practica.TiendaMicro.Domain.Model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Projects, Integer> {
}
