package pe.edu.cibertec.dswii.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import pe.edu.cibertec.dswii.bean.UsuarioBean;
import pe.edu.cibertec.dswii.util.ConexionDB;

	 public class UsuarioDAO {
	
	 private ConexionDB cnx;
	 
	 public UsuarioDAO() {
		 this.cnx = new ConexionDB();
		 
	 }
	 
	 public UsuarioBean insertarUsuario(UsuarioBean objUsuario) {
		 UsuarioBean result = null;
		 
		 Connection cn = cnx.getConexion();
		 
		 //codigo para  llamar a un SP de mysql: insertar usuario
		 
		 try {
			CallableStatement cs = cn.prepareCall("{call sp_insertar_usuario(?,?)}");
			int i = 1;
			
			cs.setString(i++, objUsuario.getUsuario());
			cs.setString(i++, objUsuario.getClave());
			
			int cant = cs.executeUpdate(); ///devuelve la cantidad de registros afectados
			
			if(cant == 0) {
				result = null;
			}else {
				result = objUsuario;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}finally {
			try {
				cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		 
		 
		 
		 return result;
	 }
	 
	 

	 
	 
}
