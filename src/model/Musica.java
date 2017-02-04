package model;

// Generated 18/01/2015 11:29:36 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Musica generated by hbm2java
 */
public class Musica implements java.io.Serializable {

	private Long id;
	private String nome;
	private String cifra;
	private String apresentacao;
	private String link;
	private Set momentos = new HashSet(0);

	public Musica() {
	}

	public Musica(String nome, String cifra, String apresentacao, String link) {
		this.nome = nome;
		this.cifra = cifra;
		this.apresentacao = apresentacao;
		this.link = link;
	}

	public Musica(String nome, String cifra, String apresentacao, String link, Set momentos) {
		this.nome = nome;
		this.cifra = cifra;
		this.apresentacao = apresentacao;
		this.link = link;
		this.momentos = momentos;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCifra() {
		return this.cifra;
	}

	public void setCifra(String cifra) {
		this.cifra = cifra;
	}

	public String getApresentacao() {
		return this.apresentacao;
	}

	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Set getMomentos() {
		return this.momentos;
	}

	public void setMomentos(Set momentos) {
		this.momentos = momentos;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		return this.getId() == this.getId();
//	}

}
