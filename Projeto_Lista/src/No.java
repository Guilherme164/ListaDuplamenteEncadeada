/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class No {
    private String dado;
    private No proximo;
    private No anterior;
	
	public No(String dado){
		this.dado = dado;
                proximo = null;
                anterior = null;
	}
	public void setProx(No n) {
		this.proximo = n;
	}
	public void setAnt(No n){
		this.anterior = n;
	}
	public void setDadoPosicao(String n,  No prox){
		this.dado = n;
		this.proximo = prox;
	}
	public No getAnt(){
		return anterior;
	}
	public No getProx(){
		return proximo;
	}
	public String getDado(){
		return dado; 
	}
}
