package it.prova.gestioneimpiegatojdbc.compagnia;

import java.util.Date;
import java.util.List;

import it.prova.gestioneimpiegatojdbc.dao.*;
import it.prova.gestioneimpiegatojdbc.model.Compagnia;
import it.prova.gestioneimpiegatojdbc.model.Impiegato;

public interface CompagniaDAO extends IBaseDAO<Compagnia>{

	public List<Impiegato> findAllByDataAssunzioneMaggioreDi(Date dateInput ) throws Exception;
	public List<Compagnia> findAllByRagioneSocialeContiene(String elemento) throws Exception;
	

}
