/*
 * 
 */
package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

// TODO: Auto-generated Javadoc
/**
 * The Class DbAccess.
 */
public class DbAccess {
	//Driver manager  che gestisce dinamicamente tutti gli oggetti driver 
	/** The driver class name. */
	//di cui hanno bisogno le interrogazioni a database di MySql
	String DRIVER_CLASS_NAME = "org.gjt.mm.mysql.Driver"; 
	
	/** The dbms. */
	final String DBMS = "jdbc:mysql"; 
	
	/** The server. */
	final String SERVER="localhost";//contiene l'identificativo del server su cui risiede la base di dati(per esempio localhost)
	
	/** The database. */
	final String DATABASE = "mapDB";//contine il nome della base di dati
	
	/** The port. */
	final int PORT=3306;// La porta su cui il DBMS MySQL accetta le connessioni 
	
	/** The user id. */
	final String USER_ID = "MapUser";// contiene il nome dell’utente per l’accesso alla base di dati
	
	/** The password. */
	final String PASSWORD = "map";// contiene la password di autenticazione per l’utente identificato da  USER_ID 
	
	/** The conn. */
	Connection conn;//gestisce una connessione
	
	/**
	 * Impartisce al class loader l’ordine di caricare il driver mysql, 
	 * inizializza la connessione riferita da conn. Il metodo solleva e propaga
	 * una eccezione di tipo DatabaseConnectionException in caso di fallimento 
	 * nella connessione al database. 
	 *
	 * @throws DatabaseConnectionException the database connection exception
	 */
	private void initConnection() throws DatabaseConnectionException {
		try {
			
			Class.forName(DRIVER_CLASS_NAME);//impartisce al class loader l'ordine di caricare il driver mysql per la gestione di oggetti driver
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			//inizializzo la connessione riferita da conn
			conn=(Connection)DriverManager.getConnection(DBMS + "://" + SERVER + ":" + PORT + "/" + DATABASE,USER_ID,PASSWORD);
		}catch(SQLException ex) {
			throw new DatabaseConnectionException();
		}
	}
	
	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 * @throws DatabaseConnectionException the database connection exception
	 */
	Connection getConnection() throws DatabaseConnectionException{
		this.initConnection();	
		return conn;
	}
	
	/**
	 * Chiude la connessione.
	 *
	 * @throws SQLException the SQL exception
	 */
	void closeConnection() throws SQLException {
		conn.close();
	}
}

