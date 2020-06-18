package com.gov.trf.ws.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gov.trf.ws.entity.Empresa;
import com.gov.trf.ws.repo.EmpresasRepository;

@RestController
@RequestMapping("/empresas")
public class Empresas {
	
	@Autowired
	private EmpresasRepository empresas;
	
	//Criar,Alterar,Excluir e Filtrar
	
	@GetMapping("/{id}")
	  public Optional<Empresa> buscar(@PathVariable Integer id) {
	    return empresas.findById(id);
	  }
	   
	  @GetMapping
	  public List<Empresa> pesquisar() {
	    return empresas.findAll();
	  }
	   
	  /*@PostMapping
	  public Empresa salvar(@RequestBody Empresa empresa) {
	    return Empresas.save(empresa);
	  } */
	 
	  @DeleteMapping("/{id}")
	  public void deletar(@PathVariable Integer id) {
	    empresas.deleteById(id);
	  }
	
	
	
	
	
	

}
