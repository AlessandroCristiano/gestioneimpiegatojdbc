package it.prova.gestioneimpiegatojdbc.test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import it.prova.gestioneimpiegatojdbc.compagnia.CompagniaDAO;
import it.prova.gestioneimpiegatojdbc.compagnia.CompagniaDAOImpl;
import it.prova.gestioneimpiegatojdbc.connection.MyConnection;
import it.prova.gestioneimpiegatojdbc.dao.Constants;
import it.prova.gestioneimpiegatojdbc.model.Compagnia;
import it.prova.gestioneimpiegatojdbc.model.Impiegato;

public class TestCompagnia {

	public static void main(String[] args) {
		
		CompagniaDAO compagniaDAOinstance = null;
		try (Connection connection = MyConnection.getConnection(Constants.DRIVER_NAME, Constants.CONNECTION_URL)) {
			
			compagniaDAOinstance = new CompagniaDAOImpl(connection);
			
			Compagnia comp = compagniaDAOinstance.get(1L);
			System.out.println(comp);
			
			testUpdateCompagnia(compagniaDAOinstance);
			
			testFindAllByRagioneSocialeContiene(compagniaDAOinstance);
			
			testFindAllByDataAssunzioneMaggioreDi(compagniaDAOinstance);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void testUpdateCompagnia (CompagniaDAO compagniaDAOinstance) throws Exception {
		Date datafondazione = new SimpleDateFormat("dd-MM-yyyy").parse("03-01-2022");
		Compagnia compagnias = new Compagnia(1L ,"Valuable", 700000, datafondazione);
		 int risult= compagniaDAOinstance.update(compagnias);
		
		System.out.println("righe cambiate:" + risult);
	}
	
	private static void testFindAllByRagioneSocialeContiene(CompagniaDAO compagniaDAOinstance) throws Exception {
		String iniziale="v%";
		List<Compagnia> listaElementi = compagniaDAOinstance.findAllByRagioneSocialeContiene(iniziale);
		for(Compagnia elementi :listaElementi) {
			System.out.println(elementi);
		}
	}
	
	private static void testFindAllByDataAssunzioneMaggioreDi(CompagniaDAO compagniaDAOinstance)throws Exception{
		System.out.println("--- testFindAllByDataAssunzioneMaggioreDi----");
		Date data = new SimpleDateFormat("dd-MM-yyyy").parse("12-10-2008");
		List<Impiegato>listaElementi=compagniaDAOinstance.findAllByDataAssunzioneMaggioreDi(data);
		for(Impiegato elementi : listaElementi) {
			System.out.println(elementi);
		}
	}
}
