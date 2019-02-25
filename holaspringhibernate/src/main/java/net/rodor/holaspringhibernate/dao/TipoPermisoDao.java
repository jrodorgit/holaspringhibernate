package net.rodor.holaspringhibernate.dao;

import net.rodor.holaspringhibernate.entity.TipoPermiso;

public interface TipoPermisoDao {

	TipoPermiso find(int id);

	int create(TipoPermiso entidad);
	
	void update(TipoPermiso entidad);
}
