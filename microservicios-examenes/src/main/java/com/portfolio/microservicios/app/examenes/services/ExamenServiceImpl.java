package com.portfolio.microservicios.app.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.microservicios.app.examenes.models.repository.AsignaturaRepository;
import com.portfolio.microservicios.app.examenes.models.repository.ExamenRepository;
import com.portfolio.microservicios.commons.examenes.models.entity.Asignatura;
import com.portfolio.microservicios.commons.examenes.models.entity.Examen;
import com.portfolio.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Asignatura> findAllAsigntauras() {
		return asignaturaRepository.findAll();
	}

}
