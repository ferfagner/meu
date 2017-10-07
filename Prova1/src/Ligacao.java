import java.time.LocalDateTime;

public class Ligacao {
	private int codigo;
	private String nDeTelefoneDestino;
	private LocalDateTime dehDeInicio;
	private LocalDateTime dehDeFim;
	private String cidadeDeDestino;
	private String UFDeDestino;
	private Cliente cliente;
	private Empresa empresa;

	@Override
	public String toString() {
		return "Ligacao [codigo=" + codigo + ", nDeTelefoneDestino=" + nDeTelefoneDestino + ", dehDeInicio="
				+ dehDeInicio + ", dehDeFim=" + dehDeFim + ", cidadeDeDestino=" + cidadeDeDestino + ", UFDeDestino="
				+ UFDeDestino + "]";
	}

	public Ligacao(int codigo, String nDeTelefoneDestino, LocalDateTime dehDeInicio, LocalDateTime dehDeFim,
			String cidadeDeDestino, String uFDeDestino, Cliente cliente, Empresa empresa) {
		super();
		this.codigo = codigo;
		this.nDeTelefoneDestino = nDeTelefoneDestino;
		this.dehDeInicio = dehDeInicio;
		this.dehDeFim = dehDeFim;
		this.cidadeDeDestino = cidadeDeDestino;
		UFDeDestino = uFDeDestino;
		this.cliente = cliente;
		this.empresa = empresa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getnDeTelefoneDestino() {
		return nDeTelefoneDestino;
	}

	public void setnDeTelefoneDestino(String nDeTelefoneDestino) {
		this.nDeTelefoneDestino = nDeTelefoneDestino;
	}

	public LocalDateTime getDehDeInicio() {
		return dehDeInicio;
	}

	public void setDehDeInicio(LocalDateTime dehDeInicio) {
		this.dehDeInicio = dehDeInicio;
	}

	public LocalDateTime getDehDeFim() {
		return dehDeFim;
	}

	public void setDehDeFim(LocalDateTime dehDeFim) {
		this.dehDeFim = dehDeFim;
	}

	public String getCidadeDeDestino() {
		return cidadeDeDestino;
	}

	public void setCidadeDeDestino(String cidadeDeDestino) {
		this.cidadeDeDestino = cidadeDeDestino;
	}

	public String getUFDeDestino() {
		return UFDeDestino;
	}

	public void setUFDeDestino(String uFDeDestino) {
		UFDeDestino = uFDeDestino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
