package classes;
//Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
public class Aviao {
	String modelo,marca;
	int assentos, ano, viagens;
	boolean estacionado = false;
	
	public void decolar() {
		if(estacionado == true)
		System.out.println("O avião decolou");
	}
	public void pousar() {
		if(estacionado == false)
		System.out.println("O avião pousou");
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getViagens() {
		return viagens;
	}
	public void setViagens(int viagens) {
		this.viagens = viagens;
	}
	public boolean isEstacionado() {
		return estacionado;
	}
	public void setEstacionado(boolean estacionado) {
		this.estacionado = estacionado;
	}
	
}
