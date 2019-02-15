package net.rodor.holaspringhibernate.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import net.rodor.holaspringhibernate.dao.FicheroBDDao;
import net.rodor.holaspringhibernate.entity.Fichero_BD;

@Component("FicheroBDDao")
public class FicheroBDDaoImpl implements FicheroBDDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	
	public Fichero_BD find(long id) {
		
		Fichero_BD ficheroBD = hibernateTemplate.get(Fichero_BD.class, id);
		return ficheroBD;
	}

}
