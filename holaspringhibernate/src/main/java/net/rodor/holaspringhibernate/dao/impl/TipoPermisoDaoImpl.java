package net.rodor.holaspringhibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import net.rodor.holaspringhibernate.dao.TipoPermisoDao;
import net.rodor.holaspringhibernate.entity.TipoPermiso;

@Component("TipoPermisoDao")
public class TipoPermisoDaoImpl implements TipoPermisoDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
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

	@Override
	public List<TipoPermiso> getPermisosRol(int idRol) {
		
		String sql = "select per.id_T_PERMISO, per.nombre, per.descripcion from REL_T_ROL_T_PERMISO rolper, T_PERMISO per where rolper.ID_T_ROL = ? and per.ID_T_PERMISO = rolper.ID_T_PERMISO";
		TipoPermisoRowMapper rowmapper = new TipoPermisoRowMapper();
		
		Object[] args={3};
		List<TipoPermiso> result =jdbcTemplate.query(sql, args, rowmapper);
		return result;
	}


}
