//RA21709716 Fagner Fernandes Douetts
public class Principal {

	public static void main(String[] args) {

		BDSimulado bd = new BDSimulado();

		System.out.println(bd.getInfoCliente("Evandro da Silva"));

		System.out.println(bd.ligacoesPorCliente("João dos Montes"));

		System.out.println(bd.ligacoesPorUF("RJ"));
		System.out.println(bd.ligacoesUFDiferente());
	}

}