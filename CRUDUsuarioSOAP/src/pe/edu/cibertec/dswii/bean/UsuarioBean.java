package pe.edu.cibertec.dswii.bean;

import java.io.Serializable;

public class UsuarioBean implements Serializable{
	
	//
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Integer idUsuario;
 private String usuario;
 private String clave;
 
public Integer getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(Integer idUsuario) {
	this.idUsuario = idUsuario;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}
 
 
}
