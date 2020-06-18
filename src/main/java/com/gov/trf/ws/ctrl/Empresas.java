package com.gov.trf.ws.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gov.trf.ws.entity.Empresa;
import com.gov.trf.ws.repo.EmpresasRepository;

@RestController
@RequestMapping("/empresas")
public class Empresas {
	
	@Autowired
	private EmpresasRepository empresas;
	
	  @RequestMapping(value = "/filtrarEmpresaId/{id}", method = RequestMethod.GET,produces = { "application/json"})
	  public Empresa filtrarEmpresaPorId(@PathVariable Integer id) {
		  Optional<Empresa> optionalEmpresa = empresas.findById(id);
		  Empresa empresa = optionalEmpresa.get();
	      return empresa;
	  }
	   
	  @RequestMapping(value = "/listarEmpresas", method = RequestMethod.GET,produces = { "application/json"})
	  public List<Empresa> filtrarEmpresas() {
	    List<Empresa> listEmpresas =  empresas.findAll();
	    return listEmpresas;
	  }
	  
	  @RequestMapping(value = "/alterarEmpresaId/{id}", method = RequestMethod.PUT)
	  public void alterarEmpresa(@PathVariable Integer id) {
		  Optional<Empresa> optionalEmpresa = empresas.findById(id);
		  Empresa empresa = optionalEmpresa.get();
		  empresas.save(empresa);
	  }
	   
	  @RequestMapping(value = "/cadastrarEmpresa", method = RequestMethod.POST)
	  public Empresa cadastrarEmpresa(@RequestParam(name = "cnpj") String cnpj, @RequestParam(name = "nome") String nome, @RequestParam(name = "tipoEmpresa") String tipoEmpresa, @RequestParam(name = "razaoSocial") String razaoSocial, @RequestParam(name = "contato") String contato, @RequestParam(name = "email") String email, @RequestParam(name = "cep") String cep, @RequestParam(name = "estado") String estado, @RequestParam(name = "bairro") String bairro, @RequestParam(name = "cidade") String cidade, @RequestParam(name = "logradouro") String logradouro) {
	      Empresa empresa = new Empresa();
	      empresa.setCnpj(cnpj);
	      empresa.setNome(nome);
	      empresa.setTipoEmpresa(tipoEmpresa);
	      empresa.setRazaoSocial(razaoSocial);
	      empresa.setContato(contato);
	      empresa.setEmail(email);
	      empresa.setCep(cep);
	      empresa.setEstado(estado);
	      empresa.setBairro(bairro);
	      empresa.setCidade(cidade);
	      empresa.setLogradouro(logradouro);
		  return empresas.save(empresa);
	  }
	 
	  @RequestMapping(value = "/deletarEmpresa/{id}", method = RequestMethod.DELETE)
	  public void deletarEmpresa(@PathVariable Integer id) {
	    empresas.deleteById(id);
	  }
	  
	
	
	
	
	
	

}
