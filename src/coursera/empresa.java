	package coursera;

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

	public void agregarLlamadaLocalLinea1(int minutos) {
		linea1.agregarLlamadalocal(minutos);
	}
	
	public void agregarLlamadaLocalLinea2(int minutos) {
		linea2.agregarLlamadalocal(minutos);
	}
	
	public void agregarLlamadaLocalLinea3(int minutos) {
		linea3.agregarLlamadalocal(minutos);
	}
	
	public void agregarLlamadaLargaDistanciaLinea1(int minutos) {
		linea1.agregarLlamadaLargaDistancia(minutos);
	}
	
	public void agregarLlamadaLargaDistanciaLinea2(int minutos) {
		linea2.agregarLlamadaLargaDistancia(minutos);
	}
	
	public void agregarLlamadaLargaDistanciaLinea3(int minutos) {
		linea3.agregarLlamadaLargaDistancia(minutos);
	}
	
	public void agregarLlamadaCelularLinea1(int minutos) {
		linea1.agregarLlamadaCelular(minutos);
	}
	
	public void agregarLlamadaCelularLinea2(int minutos) {
		linea2.agregarLlamadaCelular(minutos);
	}
	
	public void agregarLlamadaCelularLinea3(int minutos) {
		linea3.agregarLlamadaCelular(minutos);
	}
	
	public int darTotalNumeroLlamadas() {
		return linea1.darNumeroLlamadas()+linea2.darNumeroLlamadas()+linea3.darNumeroLlamadas();
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
	
	public void reiniciar() {
		linea1.reiniciard();
		linea2.reiniciard();
		linea3.reiniciard();
	}
}
