package net.rodor.holaspringhibernate.dao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.rodor.holaspringhibernate.dao.TipoPermisoDao;
import net.rodor.holaspringhibernate.entity.TipoPermiso;

@Component("OIXXXService")
public class OIXXXServiceImpl implements OIXXXService {

	@Autowired
	private TipoPermisoDao dao;
	
	@Override
	@Transactional
	public int doService(TipoPermiso entidad,TipoPermiso entidad2) {
		dao.create(entidad);
		dao.update(entidad2);
		return 0;
	}

	@Override
	public List<TipoPermiso> permisosRol(int idRol) {
		return dao.getPermisosRol(idRol);
	}

	

}
