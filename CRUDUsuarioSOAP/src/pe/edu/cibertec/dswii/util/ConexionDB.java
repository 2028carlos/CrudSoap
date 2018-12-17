package pe.edu.cibertec.dswii.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexionDB {
	public Connection getConexion() {
		Connection cn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/semana08", "root", "lacom98");
			return cn;
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
		
		
	}
}
