
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ave a = new Ave();
		a.setNombre("Pato");
		Ave b = new Ave();
		b.setNombre("Avestruz");
		Alimento x = new Alimento();
		x.setNombre("Maiz");
		x.setValor(5);
		Alimento y = new Alimento();
		y.setNombre("Pasto");
		y.setValor(2)0;
		a.comer(x);
		b.comer(y);
	}

}
