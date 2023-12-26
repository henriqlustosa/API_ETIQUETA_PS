package censo.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import censo.model.EtiquetaEmergencia;

import censo.persistence.Conexao;


public class EtiquetaEmergenciaDto {

	public static EtiquetaEmergencia etiqueta(Long _consulta) {
		EtiquetaEmergencia etiqueta = new EtiquetaEmergencia();
		PreparedStatement preparedStatement;
		try {
			
			String sqlString = "SELECT * FROM agh.v_aac_pac_checkin WHERE \"Numero Consulta\" = " + _consulta.toString();
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
			
				etiqueta.setNm_consulta(resultSet.getLong("Numero Consulta"));
				etiqueta.setCheck_in(resultSet.getString("Data Consulta"));
				etiqueta.setNm_paciente(resultSet.getString("Nome"));
				etiqueta.setData_nascimento(resultSet.getString("Data Nascimento"));
				etiqueta.setSexo(resultSet.getString("Sexo"));
				etiqueta.setNm_mae_paciente(resultSet.getString("Nome Mae"));
				etiqueta.setNm_social(resultSet.getString("Nome Social"));
				
						
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return etiqueta;
	}
}
