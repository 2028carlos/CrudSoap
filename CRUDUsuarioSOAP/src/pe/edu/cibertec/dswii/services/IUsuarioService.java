package pe.edu.cibertec.dswii.services;

import pe.edu.cibertec.dswii.bean.UsuarioBean;

public interface IUsuarioService {
	UsuarioBean insertar(String usuario, String clave);
	UsuarioBean actualizar(Integer idUsuario, String usuario, String clave);
	int eliminar(Integer id);

}