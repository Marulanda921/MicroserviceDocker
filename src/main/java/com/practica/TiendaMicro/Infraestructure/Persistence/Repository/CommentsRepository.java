package com.practica.TiendaMicro.Infraestructure.Persistence.Repository;

import com.practica.TiendaMicro.Domain.Model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
}
