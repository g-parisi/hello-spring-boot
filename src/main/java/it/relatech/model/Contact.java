package it.relatech.model;

public class Contact {
	
	private int id;
	private String nome;
	private String cognome;
	private String tel;
	
	// poi destro - source - getterAndSetter - e to string
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", tel=" + tel + ", mail=" + mail
				+ "]";
	}

	private String mail;
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setId(int id) {
		this.id = id;
	}

}
