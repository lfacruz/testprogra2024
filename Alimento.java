
public class Alimento implements Comer {
	private String nombre;
	private int valor;

	@Override
	public int getValorNutricional() {
		// TODO Auto-generated method stub
		return valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
