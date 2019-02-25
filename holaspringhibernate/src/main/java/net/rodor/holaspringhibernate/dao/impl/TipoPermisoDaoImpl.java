package net.rodor.holaspringhibernate.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import net.rodor.holaspringhibernate.dao.TipoPermisoDao;
import net.rodor.holaspringhibernate.entity.TipoPermiso;

@Component("TipoPermisoDao")
public class TipoPermisoDaoImpl implements TipoPermisoDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public TipoPermiso find(int id) {
		TipoPermiso entidad = hibernateTemplate.get(TipoPermiso.class, id);
		return entidad;
	}

	//@Transactional
	@Override
	public int create(TipoPermiso entidad) {
		int result =  (int) hibernateTemplate.save(entidad);
		return result;
	}

	//@Transactional
	@Override
	public void update(TipoPermiso entidad) {
		hibernateTemplate.update(entidad);

	}


}
