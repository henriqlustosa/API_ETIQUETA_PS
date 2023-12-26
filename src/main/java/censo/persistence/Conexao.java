package censo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection getConnection() {
		
		//Homologação
		//String url = "jdbc:postgresql://pg017dbsrv.prodam:5432/hm0615_hspm";
        //String usuario = "hspm_acesso";
        //String senha = "pwd_hspm_acesso";
		
		//Desenvolvimento
        String url = "jdbc:postgresql://pg019dbsrv.prodam:5432/hm0615_hspm";
		String usuario = "hm0615_hspm";
		String senha = "pwd_hm0615_hspm";

		//Producao
		//String url = "jdbc:postgresql://pg022dbsrv.prodam:5432/hm0615_hspm";
		//String usuario = "hspm_acesso";
      // String senha = "pwd_hspm_acesso";
        
      //Producao Atual
      //String url = "jdbc:postgresql://pg023dbsrv.prodam:5432/hm0615_hspm";
      //String usuario = "hspm_acesso";
      //String senha = "pwd_hspm_acesso";

		Connection result = null;
		try {
			Class.forName("org.postgresql.Driver");
			result = DriverManager.getConnection(url, usuario, senha);
			return result;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
