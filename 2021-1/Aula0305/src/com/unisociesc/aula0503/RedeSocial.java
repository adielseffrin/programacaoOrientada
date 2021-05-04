package com.unisociesc.aula0503;

public class RedeSocial {
	private String login;
	private String password;
	private String email;
	private String nick;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public void logar(String senhaInserida) {
		if(this.password.equals(senhaInserida)) {
			System.out.println("Redirecionando...");
		}else {
			System.out.println("Cai fora zé mané!");
		}
	}
	
	
	
}
