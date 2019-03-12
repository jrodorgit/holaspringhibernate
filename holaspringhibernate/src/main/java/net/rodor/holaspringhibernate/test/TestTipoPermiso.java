package net.rodor.holaspringhibernate.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.rodor.holaspringhibernate.dao.TipoPermisoDao;
import net.rodor.holaspringhibernate.dao.services.OIXXXService;
import net.rodor.holaspringhibernate.entity.TipoPermiso;

public class TestTipoPermiso {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"net/rodor/holaspringhibernate/test/config.xml");
		
		OIXXXService service = (OIXXXService) context.getBean("OIXXXService");
		List<TipoPermiso> permisos = service.permisosRol(3);
		System.out.println(permisos);
		
		/**
		 TipoPermisoDao dao = (TipoPermisoDao) context.getBean("TipoPermisoDao"); 
		 
		TipoPermiso entidad = dao.find(2);

		System.out.println(entidad);
		**/
		
		/**
		TipoPermiso permiso = new TipoPermiso();
		permiso.setNombre("macarrones9");
		permiso.setDescripcion("con tomate9");
		//dao.create(permiso);
		
		TipoPermiso permisoUpdate = new TipoPermiso();
		permisoUpdate.setId(15);
		permisoUpdate.setNombre("macarronesyyy");
		permisoUpdate.setDescripcion("con tomateyyy");
		//dao.update(permisoUpdate);
		
		OIXXXService service = (OIXXXService) context.getBean("OIXXXService");
		service.doService(permiso, permisoUpdate);
		***/
		
	}

}
