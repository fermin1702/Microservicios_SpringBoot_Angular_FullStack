package com.portfolio.microservicios.app.respuestas.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.portfolio.microservicios.app.respuestas.models.entity.Respuesta;

public interface RespuestaRepository extends MongoRepository<Respuesta, String> {

	@Query("{'alumnoId': ?0, 'preguntaId': { $in: ?1}}")
	public Iterable<Respuesta> findRespuestaByAlumnoByPreguntaIds(Long alumnoId, Iterable<Long> preguntaIds);

	@Query("{'alumnoId': ?0}")
	public Iterable<Respuesta> findByAlumnoId(Long alumnoId);

	// public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId);

}
