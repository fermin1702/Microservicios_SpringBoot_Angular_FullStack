package com.portfolio.microservicios.app.respuestas.services;

import com.portfolio.microservicios.app.respuestas.models.entity.Respuesta;

public interface RespuestaService {

	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);

	public Iterable<Respuesta> findRespuestaByAlumnoByExame(Long alumnoId, Long examenId);

	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId);
}
