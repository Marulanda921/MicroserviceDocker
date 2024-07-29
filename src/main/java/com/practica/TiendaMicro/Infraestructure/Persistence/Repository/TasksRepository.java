package com.practica.TiendaMicro.Infraestructure.Persistence.Repository;

import com.practica.TiendaMicro.Domain.Model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks, Integer> {
}
