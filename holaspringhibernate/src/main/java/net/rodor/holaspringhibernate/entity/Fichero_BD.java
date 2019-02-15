package net.rodor.holaspringhibernate.entity;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "FICHERO_BD")
public class Fichero_BD {

	@Id
	@Column(name = "id_fichero_bd")
	private long id;
	
	@Column(name = "id_t_fichero")
	private long idTFichero;
	
	@Column(name = "nombre_fichero")
	private String nombreFichero;
	
	@Lob
	@Column(name = "contenido", columnDefinition="BLOB")
	private byte[] contenido;
	
	@Column(name = "csv")
	private String csv;
	
	@Column(name = "fecha_creacion")
	private Timestamp fecha;
	
	@Column(name = "descripcion")
	private String descripcion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdTFichero() {
		return idTFichero;
	}

	public void setIdTFichero(long idTFichero) {
		this.idTFichero = idTFichero;
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

	

	public byte[] getContenido() {
		return contenido;
	}

	public void setContenido(byte[] contenido) {
		this.contenido = contenido;
	}

	public String getCsv() {
		return csv;
	}

	public void setCsv(String csv) {
		this.csv = csv;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		try {
			return "Fichero_BD [id=" + id + ", idTFichero=" + idTFichero + ", nombreFichero=" + nombreFichero
					+ ", contenido=" + (new String(contenido, "UTF8")).toString() + ", csv=" + csv + ", fecha=" + fecha + ", descripcion="
					+ descripcion + "]";
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error el mostrar cadena";
	}

	
	
	
}
