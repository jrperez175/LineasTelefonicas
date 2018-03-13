package lineastelefonicas;

public class empresa {
	private lineaTelefonica linea1;
	private lineaTelefonica linea2;
	private lineaTelefonica linea3;

	
	public void inicalizar() {
		
		linea1 = new lineaTelefonica();
		linea1.inicializar();
		
		linea2 = new lineaTelefonica();
		linea2.inicializar();
		
		linea3 = new lineaTelefonica();
		linea3.inicializar();
	}
	public lineaTelefonica darLinea1() {

		return linea1;
	}

	public lineaTelefonica darLinea2() {

		return linea2;
	}

	public lineaTelefonica darLinea3() {

		return linea3;
	}

	public void agregarLlamadaLocalLinea2(int minutos) {
		linea2.agregarLlamadalocal(minutos);
	}
	
	public double darCostoTotalLlamadas() {
		return linea1.darCostoLlamadas()+linea2.darCostoLlamadas()+linea3.darCostoLlamadas();
	}
	
	public int darTotalMinutos() {
		return linea1.darNumeroMinutos()+linea2.darNumeroMinutos()+linea3.darNumeroMinutos();
	}
	
	public double darCostoPromedioMinuto() {
		return darCostoTotalLlamadas()/darTotalMinutos();
	}
}
