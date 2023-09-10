package controller;

import java.util.Iterator;

public class ThreadSoma extends Thread{
	
	private int vet[] = new int[5];
	
	public ThreadSoma (int vet[]) {
		this.vet = vet;
	}
	
	public void run () {
		calc();
	}
	
	private void calc () {
		int soma = 0;
		for (int i : vet) {
			soma = soma + i;
		}
		System.out.println("Soma: " + soma);
		
	}
}
