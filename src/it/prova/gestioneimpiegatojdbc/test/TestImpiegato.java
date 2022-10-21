package it.prova.gestioneimpiegatojdbc.test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import it.prova.gestioneimpiegatojdbc.connection.MyConnection;
import it.prova.gestioneimpiegatojdbc.dao.Constants;
import it.prova.gestioneimpiegatojdbc.impiegato.ImpiegatoDAO;
import it.prova.gestioneimpiegatojdbc.impiegato.ImpiegatoDAOImpl;
import it.prova.gestioneimpiegatojdbc.model.Compagnia;
import it.prova.gestioneimpiegatojdbc.model.Impiegato;

public class TestImpiegato {

	public static void main(String[] args) {
		ImpiegatoDAO impiegatoDAOinstance = null;
		try (Connection connection = MyConnection.getConnection(Constants.DRIVER_NAME, Constants.CONNECTION_URL)) {

			impiegatoDAOinstance = new ImpiegatoDAOImpl(connection);

			Impiegato comp = impiegatoDAOinstance.get(1L);
			System.out.println(comp);

			testFindAllByCompagnia(impiegatoDAOinstance);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testFindAllByCompagnia(ImpiegatoDAO impiegatoDAOinstance) throws Exception{
		System.out.println("---INIZIO testFindAllByCompagnia---");
		Date datafondazione = new SimpleDateFormat("dd-MM-yyyy").parse("03-01-2017");
		Compagnia prova = new Compagnia(1L, "grammaturgo", 400000, datafondazione);
		List<Impiegato> listaElementi = impiegatoDAOinstance.findAllByCompagnia(prova);
		for(Impiegato elementi : listaElementi) {
			System.out.println(elementi);
		}
	}

}
