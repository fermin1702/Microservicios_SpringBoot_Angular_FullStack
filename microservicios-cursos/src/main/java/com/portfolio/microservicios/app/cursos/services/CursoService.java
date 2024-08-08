package com.portfolio.microservicios.app.cursos.services;

import com.portfolio.microservicios.app.cursos.models.entity.Curso;
import com.portfolio.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);

	public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(Long alumnoId);

}
