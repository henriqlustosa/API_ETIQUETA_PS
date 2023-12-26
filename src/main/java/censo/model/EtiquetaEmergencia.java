package censo.model;

import java.util.Objects;

public class EtiquetaEmergencia {
	private Long nm_consulta;
	private String check_in;
	private String nm_paciente;
	private String data_nascimento;
	private String sexo;
	private String nm_mae_paciente;
	private String nm_social;
	
	
	public Long getNm_consulta() {
		return nm_consulta;
	}
	public void setNm_consulta(Long nm_consulta) {
		this.nm_consulta = nm_consulta;
	}
	public String getCheck_in() {
		return check_in;
	}
	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}
	public String getNm_paciente() {
		return nm_paciente;
	}
	public void setNm_paciente(String nm_paciente) {
		this.nm_paciente = nm_paciente;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNm_mae_paciente() {
		return nm_mae_paciente;
	}
	public void setNm_mae_paciente(String nm_mae_paciente) {
		this.nm_mae_paciente = nm_mae_paciente;
	}
	public String getNm_social() {
		return nm_social;
	}
	public void setNm_social(String nm_social) {
		this.nm_social = nm_social;
	}
	@Override
	public int hashCode() {
		return Objects.hash(check_in, data_nascimento, nm_consulta, nm_mae_paciente, nm_paciente, sexo, nm_social);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EtiquetaEmergencia other = (EtiquetaEmergencia) obj;
		return Objects.equals(check_in, other.check_in) && Objects.equals(data_nascimento, other.data_nascimento)
				&& Objects.equals(nm_consulta, other.nm_consulta)
				&& Objects.equals(nm_mae_paciente, other.nm_mae_paciente)
				&& Objects.equals(nm_paciente, other.nm_paciente) && Objects.equals(sexo, other.sexo) && Objects.equals(nm_social, other.nm_social);
	}


}
