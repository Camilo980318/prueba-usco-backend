package com.camilodev.pruebactic.backend.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "semestre")
public class Semestre implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSemestre;
	
	@Column(nullable = false)
	private int num_semestre;
	@Column(nullable = true)
	private float ponderado;
	@Column(nullable = false)
	private int estudiante;
	@Column(nullable = false)
	private int asignatura;
	@Column(nullable = false)
	private float nota_asignatura;
	

	
	public Long getIdSemestre() {
		return idSemestre;
	}
	public void setIdSemestre(Long idSemestre) {
		this.idSemestre = idSemestre;
	}
	public int getNum_semestre() {
		return num_semestre;
	}
	public void setNum_semestre(int num_semestre) {
		this.num_semestre = num_semestre;
	}
	public float getPonderado() {
		return ponderado;
	}
	public void setPonderado(float ponderado) {
		this.ponderado = ponderado;
	}
	
	public int getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(int estudiante) {
		this.estudiante = estudiante;
	}
	public int getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(int asignatura) {
		this.asignatura = asignatura;
	}
	
	public float getNota_asignatura() {
		return nota_asignatura;
	}
	public void setNota_asignatura(float nota_asignatura) {
		this.nota_asignatura = nota_asignatura;
	}
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
