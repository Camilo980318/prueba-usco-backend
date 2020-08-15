package com.camilodev.pruebactic.backend.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asignatura")
public class Asignatura implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_asignatura;
	@Column(nullable = false)
	public String nombre_asignatura;
	@Column(nullable = false)
	public String codigo_asignatura;
	@Column(nullable = false)
	public int creditos;
	@Column(nullable = false)
	public int num_semestre;
	
	
	public Long getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public String getNombre_asignatura() {
		return nombre_asignatura;
	}
	public void setNombre_asignatura(String nombre_asignatura) {
		this.nombre_asignatura = nombre_asignatura;
	}
	public String getCodigo_asignatura() {
		return codigo_asignatura;
	}
	public void setCodigo_asignatura(String codigo_asignatura) {
		this.codigo_asignatura = codigo_asignatura;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public int getNum_semestre() {
		return num_semestre;
	}
	public void setNum_semestre(int num_semestre) {
		this.num_semestre = num_semestre;
	}

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
