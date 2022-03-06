package com.dio.classe;

class Carro extends Veiculo{

	String cor;
	String modelo;
	int capacidadeTanque;

	public Carro() {
	}

	public Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public double valorEncherTanque(double valorLitroCombustivel) {
		return valorLitroCombustivel * capacidadeTanque;
	}

}
