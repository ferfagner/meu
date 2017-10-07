import java.time.LocalDate;

public class Empresa {
	private String nomeEmpresa;
	private String cnpj;
	private String telefone;
	private LocalDate dataDeInicio;
	private String cidade;
	private String UF;

	@Override
	public String toString() {
		return "Empresa [nomeEmpresa=" + nomeEmpresa + ", cnpj=" + cnpj + ", telefone=" + telefone + ", dataDeInicio="
				+ dataDeInicio + ", cidade=" + cidade + ", UF=" + UF + "]";
	}

	public Empresa(String nomeEmpresa, String cnpj, String telefone, LocalDate dataDeInicio, String cidade, String uF) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.dataDeInicio = dataDeInicio;
		this.cidade = cidade;
		UF = uF;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(LocalDate dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

}
