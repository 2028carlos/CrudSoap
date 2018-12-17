package pe.edu.cibertec.dswii.test;

import pe.edu.cibertec.dswii.services.UsuarioService;

public class MainTest {
	
	public static void main(String[] args) {
		UsuarioService objService = new UsuarioService();
		//objService.insertar("admin", "admin");
		
		objService.eliminar(1);
		
	}
}
