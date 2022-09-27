package aula43.labs.exerc3;

public class Animal {
	
	private String nome;
	private int comprimento;
	private int numeroDePatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
		this.numeroDePatas = 4;
	}
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getComprimento() {
		return comprimento;
	}


	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}


	public int getNumeroDePatas() {
		return numeroDePatas;
	}


	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getAmbiente() {
		return ambiente;
	}


	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}


	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", numeroDePatas=" + numeroDePatas + ", cor="
				+ cor + ", ambiente=" + ambiente + ", velocidade=" + velocidade + "]";
	}

	
}
