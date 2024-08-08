package com.portfolio.microservicios.app.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.portfolio.microservicios.app.cursos.models.entity.Curso;

public interface CursoRespository extends JpaRepository<Curso, Long> {

	@Query("select c from Curso c join fetch c.alumnos a where a.id=?1")
	public Curso findCursoByAlumnoId(Long id);
}
