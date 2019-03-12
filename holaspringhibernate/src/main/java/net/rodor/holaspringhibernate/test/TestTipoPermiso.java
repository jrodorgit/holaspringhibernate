package net.rodor.holaspringhibernate.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.rodor.holaspringhibernate.dao.services.OIXXXService;
import net.rodor.holaspringhibernate.entity.TipoPermiso;

public class TestTipoPermiso {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"net/rodor/holaspringhibernate/test/config.xml");
		
		// servicio que utiliza jdbcTempate para extraer resultado a traves de un sql standar.
		OIXXXService service = (OIXXXService) context.getBean("OIXXXService");
		List<TipoPermiso> permisos = service.permisosRol(3);
		System.out.println(permisos);
		
		// servicio que utiliza hibernateTemplate para crear una entidad y  actualizar otra
		// la transaccionalidad reside en el servicio no en el dao.
		TipoPermiso permiso = new TipoPermiso();
		permiso.setNombre("macarrones999");
		permiso.setDescripcion("con tomate999");
		
		TipoPermiso permisoUpdate = new TipoPermiso();
		permisoUpdate.setId(15);
		permisoUpdate.setNombre("macarronesyyy");
		permisoUpdate.setDescripcion("con tomateyyy");
		service.doService(permiso, permisoUpdate);
		
		
		
	}

}
