package aula43.labs.exerc3;

public class Peixe  extends Animal {

	private String Caracteristica;
	
	public Peixe() {
		this.setNumeroDePatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.setCaracteristica("Barbatanas e cauda.");
	}

	public String getCaracteristica() {
		return Caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		Caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return "Peixe [Caracteristica=" + Caracteristica +" "+super.toString()+ "]";
	}
	
	
	
}
