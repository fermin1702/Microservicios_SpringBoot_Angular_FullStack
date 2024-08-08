package com.portfolio.microservicios.app.usuarios.services;

import java.util.List;

import com.portfolio.microservicios.commons.alumnos.models.entity.Alumno;
import com.portfolio.microservicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno> {
	public List<Alumno> findByNombreOrApellido(String term);
}
