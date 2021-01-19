package es.capgemini.curso.modelo.entidad;

import java.io.Serializable;

public class Equipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String pais;
	private String ciudad;
	private String estadio;
	private int aforo;
	private int numero_socios;

	public Equipo() {

	}

	public Equipo(String nombre, String pais, String ciudad, String estadio, int aforo, int numero_socios) {

		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.estadio = estadio;
		this.aforo = aforo;
		this.numero_socios = numero_socios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public int getNumero_socios() {
		return numero_socios;
	}

	public void setNumero_socios(int numero_socios) {
		this.numero_socios = numero_socios;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", pais=" + pais + ", ciudad=" + ciudad + ", estadio=" + estadio
				+ ", aforo=" + aforo + ", numero_socios=" + numero_socios + "]";
	}

}
