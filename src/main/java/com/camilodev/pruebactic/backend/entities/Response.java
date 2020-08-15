package com.camilodev.pruebactic.backend.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Response implements Serializable {
	
	@Id
	private String codigoEstudiante;
	
	private String nombreAsignatura;
	private String codigoAsignatura;
	private int creditos;
	private float nota; 
	private int numSemestre;
	private float ponderado;
	
	
	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setCodigoEstudiante(String codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsigantura) {
		this.nombreAsignatura = nombreAsigantura;
	}
	public String getCodigoAsignatura() {
		return codigoAsignatura;
	}
	public void setCodigoAsignatura(String codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public int getNumSemestre() {
		return numSemestre;
	}
	public void setNumSemestre(int numSemestre) {
		this.numSemestre = numSemestre;
	}
	
	public float getPonderado() {
		return ponderado;
	}
	public void setPonderado(float ponderado) {
		this.ponderado = ponderado;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
