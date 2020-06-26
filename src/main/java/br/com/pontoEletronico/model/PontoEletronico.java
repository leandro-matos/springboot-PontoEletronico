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
@Table(name="tbl_ponto")
public class PontoEletronico implements Serializable {

	 private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
    @Column(name = "usuario_id", nullable=false)
	private int idfunc;
	
	@CreationTimestamp
	private LocalDateTime dataHora;
	
	@Column(name="tipo", length=30, nullable=false)
	private String tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdfunc() {
		return idfunc;
	}

	public void setIdfunc(int idfunc) {
		this.idfunc = idfunc;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PontoEletronico(int id, int idfunc, LocalDateTime dataHora, String tipo) {
		super();
		this.id = id;
		this.idfunc = idfunc;
		this.dataHora = dataHora;
		this.tipo = tipo;
	}

	public PontoEletronico() {
		super();
	}


}
