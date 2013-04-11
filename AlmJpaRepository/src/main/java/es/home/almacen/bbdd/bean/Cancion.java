package es.home.almacen.bbdd.bean;

// Generated 01-mar-2013 9:51:56 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cancion generated by hbm2java
 */
@Entity
@Table(name = "cancion", catalog = "almacen")
public class Cancion implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ident;
	private String nombre;
	private String duracion;
	private Integer posicion;

	public Cancion() {
	}

	public Cancion(final Integer ident) {
		this.ident = ident;
	}

	public Cancion(final Integer ident, final String nombre, final String duracion,
			final Integer posicion) {
		this.ident = ident;
		this.nombre = nombre;
		this.duracion = duracion;
		this.posicion = posicion;
	}

	@Column(name = "DURACION", length = 8)
	public String getDuracion() {
		return duracion;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDENT", unique = true, nullable = false)
	public Integer getIdent() {
		return ident;
	}

	@Column(name = "NOMBRE", length = 45)
	public String getNombre() {
		return nombre;
	}

	@Column(name = "POSICION", length = 3)
	public Integer getPosicion() {
		return posicion;
	}

	public void setDuracion(final String duracion) {
		this.duracion = duracion;
	}

	public void setIdent(final Integer ident) {
		this.ident = ident;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public void setPosicion(final Integer posicion) {
		this.posicion = posicion;
	}

}