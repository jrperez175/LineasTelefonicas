package coursera;

public class lineaTelefonica {
	// Atribudos
	private double costoLlamadas;
	private int numeroLlamadas;
	private int numeroMinutos;

	// Metodos

	public void inicializar() {
		costoLlamadas = 0.0;
		numeroLlamadas = 0;
		numeroMinutos = 0;
	}

	public void reiniciard() {
		inicializar();
	}

	public double darCostoLlamadas() {

		return costoLlamadas;
	}

	public int darNumeroLlamadas() {

		return numeroLlamadas;
	}

	public int darNumeroMinutos() {

		return numeroMinutos;
	}

	public void agregarLlamadaLargaDistancia(int minutos) {
		numeroLlamadas++;
		numeroMinutos += minutos;
		costoLlamadas += (numeroMinutos * 380);
	}

	public void agregarLlamadaCelular(int minutos) {
		numeroLlamadas++;
		numeroMinutos += minutos;
		costoLlamadas += (numeroMinutos * 999);
	}

	public void agregarLlamadalocal(int minutos) {
		numeroLlamadas++;
		numeroMinutos += minutos;
		costoLlamadas += (numeroMinutos * 35);

	}

}
