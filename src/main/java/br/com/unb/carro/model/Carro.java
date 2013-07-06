package br.com.unb.carro.model;

import java.util.ArrayList;
import java.util.Random;


public class Carro {

	String chassi;
	String modelo;
	ArrayList<Roda> rodas;
	Motor motor;
	Cambio transmissao;

	
	
	
	public Carro(String modelo, ArrayList<Roda> rodas, Motor motor,
			Cambio transmissao) {
		super();
		this.chassi = String.valueOf(Long.toHexString(new Random().nextLong()));
		this.modelo = modelo;
		this.rodas = rodas;
		this.motor = motor;
		this.transmissao = transmissao;
	}
	
	
public ArrayList<Roda> getRodas() {
	return rodas;
}

public Motor getMotor() {
	return motor;
}

public Cambio getTransmissao() {
	return transmissao;
}

public String getModelo() {
	return modelo;
}

public String getChassi() {
	return chassi;
}

}
