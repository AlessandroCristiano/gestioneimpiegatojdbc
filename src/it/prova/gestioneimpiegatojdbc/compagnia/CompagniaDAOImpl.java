package it.prova.gestioneimpiegatojdbc.compagnia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.prova.gestioneimpiegatojdbc.dao.*;
import it.prova.gestioneimpiegatojdbc.model.Compagnia;
import it.prova.model.User;


public class CompagniaDAOImpl extends AbstractMySQLDAO implements CompagniaDAO{
	
	public CompagniaDAO(Connection connection) {
		super(connection);
		
	} 

	@Override
	public List<Compagnia> list() throws Exception {
		if (isNotActive())
			throw new Exception("Connessione non attiva. Impossibile effettuare operazioni DAO.");

		ArrayList<Compagnia> result = new ArrayList<Compagnia>();
		Compagnia compagniaTemp = null;

		try (Statement ps = connection.createStatement(); ResultSet rs = ps.executeQuery("select * from user")) {

			while (rs.next()) {
				compagniaTemp = new Compagnia();
				compagniaTemp.setId(rs.getLong("id"));
				compagniaTemp.setRagioneSociale(rs.getString("nome"));
				compagniaTemp.setFatturatoAnnuo(rs.getInt("fatturatoannuo"));
				compagniaTemp.setDatafondazione(rs.getDate("datafondazione"));
				result.add(compagniaTemp);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

	@Override
	public Compagnia get(Long idInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Compagnia input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Compagnia input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Compagnia input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Compagnia> findByExample(Compagnia input) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compagnia> findAllByDataAssunzioneMaggioreDi(Date dateInput) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compagnia> findAllByRagioneSocialeContiene(String elemento) {
		// TODO Auto-generated method stub
		return null;
	}


}
