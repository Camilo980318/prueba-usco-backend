package com.camilodev.pruebactic.backend.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudiante implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstudiante;
	
	@Column(nullable = false)
	private String codigo_estudiante;
	@Column(nullable = false)
	private String nombres;
	@Column(nullable = false)
	private String apellidos;
	@Column(nullable = false)
	private String identificacion;
	@Column(nullable = false)
	private String programa;
	
	
	public Long getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	public String getCodigo() {
		return codigo_estudiante;
	}
	public void setCodigo(String codigo) {
		this.codigo_estudiante = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
