//RA21709716 Fagner Fernandes Douetts
public class Principal {

	public static void main(String[] args) {

		BDSimulado bd = new BDSimulado();

		System.out.println(bd.getInfoEmpresa("FNDE"));
		System.out.println(bd.ligacoesPorEmpresa("FNDE"));
	}

}