package com.practica.TiendaMicro.Infraestructure.Persistence.Repository;

import com.practica.TiendaMicro.Domain.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
