package it.prova.gestioneimpiegatojdbc.impiegato;

import java.util.Date;
import java.util.List;

import it.prova.gestioneimpiegatojdbc.dao.*;
import it.prova.gestioneimpiegatojdbc.model.Compagnia;
import it.prova.gestioneimpiegatojdbc.model.Impiegato;

public interface ImpiegatoDAO extends IBaseDAO<Impiegato>{
	public List<Impiegato> findAllByCompagnia(Compagnia input) throws Exception;
	public int countByDataFondazioneCompagniaGreaterThan(Date dateInput) throws Exception;
	public List<Impiegato> findAllErroriAssunzione() throws Exception;
}


