package com.gov.trf.ws.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gov.trf.ws.entity.Empresa;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresa, Integer> {}
