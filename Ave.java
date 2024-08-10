
public class Ave {
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void comer(Alimento a) {
		System.out.println("El ave "+nombre+"se alimento de "+a.getNombre()+" con el valor nutricional de "+a.getValorNutricional());
	}
}
