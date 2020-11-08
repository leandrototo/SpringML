package com.mirtaLuque.EP;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EP {
	@Id
	private int id;
	private String nombre;
	private String apellido;
	private int partido;
	private int partida;
	private String circunscripcion;
	private String seccion;
	private String chacra;
	private String quinta;
	private String fraccion;
	private String manzana;
	private String parcela;
	private String subparcela;
	private Boolean recibido;
	private Boolean medido;
	private Boolean confeccionado;
	private Boolean enviado;

	// Constructor
	public EP() {
		
	}
	
	public EP(int id, String nombre, String apellido, int partido, int partida, String circunscripcion,
			String seccion, String chacra, String quinta, String fraccion, String manzana, String parcela,
			String subparcela, Boolean recibido, Boolean medido, Boolean confeccionado, Boolean enviado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.partido = partido;
		this.partida = partida;
		this.circunscripcion = circunscripcion;
		this.seccion = seccion;
		this.chacra = chacra;
		this.quinta = quinta;
		this.fraccion = fraccion;
		this.manzana = manzana;
		this.parcela = parcela;
		this.subparcela = subparcela;
		this.recibido = recibido;
		this.medido = medido;
		this.confeccionado = confeccionado;
		this.enviado = enviado;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPartido() {
		return partido;
	}
	public void setPartido(int partido) {
		this.partido = partido;
	}
	public int getPartida() {
		return partida;
	}
	public void setPartida(int partida) {
		this.partida = partida;
	}
	public String getCircunscripcion() {
		return circunscripcion;
	}
	public void setCircunscripcion(String circunscripcion) {
		this.circunscripcion = circunscripcion;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getChacra() {
		return chacra;
	}
	public void setChacra(String chacra) {
		this.chacra = chacra;
	}
	public String getQuinta() {
		return quinta;
	}
	public void setQuinta(String quinta) {
		this.quinta = quinta;
	}
	public String getFraccion() {
		return fraccion;
	}
	public void setFraccion(String fraccion) {
		this.fraccion = fraccion;
	}
	public String getManzana() {
		return manzana;
	}
	public void setManzana(String manzana) {
		this.manzana = manzana;
	}
	public String getParcela() {
		return parcela;
	}
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
	public String getSubparcela() {
		return subparcela;
	}
	public void setSubparcela(String subparcela) {
		this.subparcela = subparcela;
	}
	public Boolean getRecibido() {
		return recibido;
	}
	public void setRecibido(Boolean recibido) {
		this.recibido = recibido;
	}
	public Boolean getMedido() {
		return medido;
	}
	public void setMedido(Boolean medido) {
		this.medido = medido;
	}
	public Boolean getConfeccionado() {
		return confeccionado;
	}
	public void setConfeccionado(Boolean confeccionado) {
		this.confeccionado = confeccionado;
	}
	public Boolean getEnviado() {
		return enviado;
	}
	public void setEnviado(Boolean enviado) {
		this.enviado = enviado;
	}

}
