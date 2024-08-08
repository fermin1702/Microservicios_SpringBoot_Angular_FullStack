package com.portfolio.microservicios.app.examenes.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.microservicios.commons.examenes.models.entity.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {

}
