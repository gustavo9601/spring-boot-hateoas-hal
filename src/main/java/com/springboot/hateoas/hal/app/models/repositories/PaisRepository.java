package com.springboot.hateoas.hal.app.models.repositories;

import com.springboot.hateoas.hal.app.models.entities.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Deshabiitamos para que no se exponga como servicio rest
@RepositoryRestResource(exported = false)
public interface PaisRepository extends JpaRepository<Pais, Long> {
}
