package com.boletim;

public class Aluno {
	private String nome, materia;
	private double nota1, nota2;
	
	public Aluno(String n) {
		this.nome = n;
		//this.materia = materia;
	}
	
	public double getNota() {
		return nota1;
	}
	
	public void setNota(double nota) {
		this.nota1 = nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	//Método que retorna o conceito referente a media (A, B, C, ...)
	public String getConceito() {
		return "";
	}
	
	//Método que calcula e retorna a média
	public double getMedia() {
		return 0;
	}
	
	//TODO
	//criar get e set para nota2
	//Implementar o getConceito
	//Implementar o getMédia
	
	
	
}
