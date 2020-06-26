package br.com.pontoEletronico.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tbl_funcionario") 
public class Funcionario implements Serializable {
	
    private static final long serialVersionUID = 1L;

	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome", length=50, nullable=false)
	private String nome;
	
	@Column(name="cpf", length=11, nullable=false)
	private String cpf;
	
	@Column(name="email", length=50, nullable=false)
	private String email;
	
	@Column(name="data_cadastro", updatable=false)
	@CreationTimestamp
	private LocalDateTime datacadastro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(LocalDateTime datacadastro) {
		this.datacadastro = datacadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Funcionario(int id, String nome, String cpf, String email, LocalDateTime datacadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.datacadastro = datacadastro;
	}

	public Funcionario() {
		super();
	}
	
	
	
}
