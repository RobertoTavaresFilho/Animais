package aula43.labs.exerc3;

public class Mamifero extends Animal {
	
	private String alimento;

	public Mamifero() {
		super();
		this.setNumeroDePatas(0);
		this.setCor("Castanho");
		this.alimento = "mel";
		this.setAmbiente("Terra");
	}
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Mamifero [alimento=" + alimento +" "+super.toString()+ "]";
	}
	

}
