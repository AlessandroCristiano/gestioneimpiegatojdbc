package it.prova.gestioneimpiegatojdbc.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Impiegato {
	private Long id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private Date dataNascita;
	private Date dataAssunzione;
	private List<Compagnia> compagnie;
	
	
	public Impiegato() {
		super();
	}

	public Impiegato(Long id, String nome, String cognome, String codiceFiscale, Date dataNascita,
			Date dataAssunzione) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.dataNascita = dataNascita;
		this.dataAssunzione = dataAssunzione;
	}


	public Impiegato(Long id, String nome, String cognome, String codiceFiscale, Date dataNascita, Date dataAssunzione,
			List<Compagnia> compagnie) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.dataNascita = dataNascita;
		this.dataAssunzione = dataAssunzione;
		this.compagnie = compagnie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public List<Compagnia> getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(List<Compagnia> compagnie) {
		this.compagnie = compagnie;
	}

	
	@Override
	public String toString() {
		String dateNascitaString = dataNascita != null ? new SimpleDateFormat("dd/MM/yyyy").format(dataNascita)
				: " N.D.";
		String dateAssunzioneString = dataAssunzione != null ? new SimpleDateFormat("dd/MM/yyyy").format(dataAssunzione)
				: " N.D.";
		return "Impiegato [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale
				+ ", dataNascita=" + dateNascitaString + ", dataAssunzione=" + dateAssunzioneString + ", compagnie=" + compagnie
				+ "]";
	}
}