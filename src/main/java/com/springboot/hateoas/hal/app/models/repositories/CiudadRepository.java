package com.springboot.hateoas.hal.app.models.repositories;

import com.springboot.hateoas.hal.app.models.entities.Ciudad;
import com.springboot.hateoas.hal.app.models.projections.CiudadConCoordinadasProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

// RepositoryRestResource // permite exponer el repositorio como un servicio rest tipo Hal Browsing
// excerptProjection // Define la proyeccion que usara el recurso
@RepositoryRestResource(path = "ciudades", collectionResourceRel = "ciudades", excerptProjection = CiudadConCoordinadasProjection.class)
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    // /api/ciudades/search/buscar-por-nombre?nombre=Madrid&size=3   // Ejemplo consumo
    // Se disponibiliza el endpoint de consulta
    @RestResource(path = "buscar-por-nombre", rel = "buscar-por-nombre")
    Page<Ciudad> findByNombreStartsWith(@Param("nombre") String nombre,  Pageable pageable);
}
