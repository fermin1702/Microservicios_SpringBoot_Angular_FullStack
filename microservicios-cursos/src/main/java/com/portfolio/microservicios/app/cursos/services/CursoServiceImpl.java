package com.portfolio.microservicios.app.cursos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.microservicios.app.cursos.clients.RespuestaFeignClient;
import com.portfolio.microservicios.app.cursos.models.entity.Curso;
import com.portfolio.microservicios.app.cursos.repository.CursoRespository;
import com.portfolio.microservicios.commons.services.CommonServiceImpl;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRespository> implements CursoService {

	@Autowired
	private RespuestaFeignClient client;

	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByAlumnoId(Long id) {
		return repository.findCursoByAlumnoId(id);
	}

	@Override
	public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(Long alumnoId) {
		return client.obtenerExamenesIdConRespuestasAlumno(alumnoId);
	}

}
