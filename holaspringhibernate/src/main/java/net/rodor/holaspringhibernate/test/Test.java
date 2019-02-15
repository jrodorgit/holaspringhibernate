package net.rodor.holaspringhibernate.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.rodor.holaspringhibernate.dao.FicheroBDDao;
import net.rodor.holaspringhibernate.entity.Fichero_BD;

public class Test {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"net/rodor/holaspringhibernate/test/config.xml");
		FicheroBDDao ficheroBDDao = (FicheroBDDao) context.getBean("FicheroBDDao");
		
		Fichero_BD fich = ficheroBDDao.find(102);

		System.out.println(fich);

	}
}
