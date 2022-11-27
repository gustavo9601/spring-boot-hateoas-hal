package com.springboot.hateoas.hal.app.models.projections;

import com.springboot.hateoas.hal.app.models.entities.Ciudad;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

// /api/ciudades/{idCiudad}?projection=ciudadConCoordinadas
@Projection(name = "ciudadConCoordinadas", types = {Ciudad.class})
public interface CiudadConCoordinadasProjection {
    Long getId();
    String getNombre();

    // Concatena las columnas del query
    @Value("#{target.lat}#{','}#{target.lng}")
    String getCoordenadas();

    @Value("#{target.getPais().getNombre()}")
    String getPais();
}
