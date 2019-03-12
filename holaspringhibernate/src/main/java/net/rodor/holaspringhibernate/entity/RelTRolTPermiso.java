package net.rodor.holaspringhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REL_T_ROL_T_PERMISO")
public class RelTRolTPermiso {

	@Id
	@Column(name = "ID_REL_T_ROL_T_PERMISO")
	private int id;
	
	@Column(name = "ID_T_ROL")
	private int idRol;
	
	@Column(name = "ID_T_PERMISO")
	private int idPermiso;

	
	@Override
	public String toString() {
		return "RelTRolTPermiso [id=" + id + ", idRol=" + idRol + ", idPermiso=" + idPermiso + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}
	
	
}
