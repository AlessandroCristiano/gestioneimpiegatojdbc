package it.prova.gestioneimpiegatojdbc.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Compagnia {
	private Long id;
	private String ragioneSociale;
	private int fatturatoAnnuo;
	private Date datafondazione;
	private Impiegato impiegato;

	public Compagnia() {
		super();
	}

	public Compagnia(Long id, String ragioneSociale, int fatturatoAnnuo, Date datafondazione) {
		super();
		this.id = id;
		this.ragioneSociale = ragioneSociale;
		this.fatturatoAnnuo = fatturatoAnnuo;
		this.datafondazione = datafondazione;
	}

	public Compagnia(Long id, String ragioneSociale, int fatturatoAnnuo, Date datafondazione, Impiegato impiegato) {
		super();
		this.id = id;
		this.ragioneSociale = ragioneSociale;
		this.fatturatoAnnuo = fatturatoAnnuo;
		this.datafondazione = datafondazione;
		this.impiegato = impiegato;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getFatturatoAnnuo() {
		return fatturatoAnnuo;
	}

	public void setFatturatoAnnuo(int fatturatoAnnuo) {
		this.fatturatoAnnuo = fatturatoAnnuo;
	}

	public Date getDatafondazione() {
		return datafondazione;
	}

	public void setDatafondazione(Date datafondazione) {
		this.datafondazione = datafondazione;
	}

	public Impiegato getImpiegato() {
		return impiegato;
	}

	public void setImpiegato(Impiegato impiegato) {
		this.impiegato = impiegato;
	}

	@Override
	public String toString() {
		String dateFondazioneString = datafondazione != null ? new SimpleDateFormat("dd/MM/yyyy").format(datafondazione)
				: " N.D.";
		return "Compagnia [ragioneSociale=" + ragioneSociale + ", fatturatoAnnuo=" + fatturatoAnnuo
				+ ", datafondazione=" + dateFondazioneString + ", impiegato=" + impiegato + "]";
	}
}
