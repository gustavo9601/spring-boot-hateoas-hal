package com.springboot.hateoas.hal.app.models.projections;

import com.springboot.hateoas.hal.app.models.entities.Ciudad;
import org.springframework.data.rest.core.config.Projection;

// /api/ciudades/{idCiudad}?projection=ciudadSinCoordinadas
@Projection(name = "ciudadSinCoordinadas", types = {Ciudad.class})
public interface CiudadProjection {
    Long getId();
    String getNombre();
}
