package net.rodor.holaspringhibernate.dao.services;

import java.util.List;

import net.rodor.holaspringhibernate.entity.TipoPermiso;

public interface OIXXXService {

	int doService(TipoPermiso entidad, TipoPermiso entidad2);
	
	List<TipoPermiso> permisosRol(int idRol);
	
}
