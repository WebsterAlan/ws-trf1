package com.gov.trf.ws.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {
	
	@Id
    private Integer Id;
	private String Cnpj;
	private String Nome;
	private String TipoEmpresa;
	private String RazaoSocial;
	private String Contato;
	private String Email;
	private String Cep;
	private String Estado;
	private String Bairro;
	private String Cidade;
	private String Logradouro;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCnpj() {
		return Cnpj;
	}
	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTipoEmpresa() {
		return TipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		TipoEmpresa = tipoEmpresa;
	}
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	public String getContato() {
		return Contato;
	}
	public void setContato(String contato) {
		Contato = contato;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCep() {
		return Cep;
	}
	public void setCep(String cep) {
		Cep = cep;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	
	
	
	
}
