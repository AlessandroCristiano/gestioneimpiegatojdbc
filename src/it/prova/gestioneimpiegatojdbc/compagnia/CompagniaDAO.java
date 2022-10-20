package it.prova.gestioneimpiegatojdbc.compagnia;

import java.util.Date;
import java.util.List;

import it.prova.gestioneimpiegatojdbc.dao.*;
import it.prova.gestioneimpiegatojdbc.model.Compagnia;

public interface CompagniaDAO extends IBaseDAO<Compagnia>{

	public List<Compagnia> findAllByDataAssunzioneMaggioreDi(Date dateInput );
	public List<Compagnia> findAllByRagioneSocialeContiene(String elemento);
	

}
