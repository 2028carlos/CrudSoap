package pe.edu.cibertec.dswii.services;

import pe.edu.cibertec.dswii.bean.UsuarioBean;
import pe.edu.cibertec.dswii.dao.UsuarioDAO;

public class UsuarioService implements IUsuarioService{

	@Override
	public UsuarioBean insertar(String usuario, String clave) {
		UsuarioBean objUsuario = new UsuarioBean();
				objUsuario.setUsuario(usuario);
				objUsuario.setClave(clave);
				
			UsuarioDAO daoUsuario = new UsuarioDAO();
			return daoUsuario.insertarUsuario(objUsuario);
	}

	@Override
	public UsuarioBean actualizar(Integer idUsuario, String usuario, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminar(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	

}
