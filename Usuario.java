package Exemplo17;

import java.util.HashSet;
import java.util.Set;

import Ex_15_Orientacao_Objetos.Fisica;

public class Usuario {
	
	private String login;
	private String senha;
	
	private Set<Pessoa> pessoas = new HashSet<>();
}