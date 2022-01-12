package KafeUygulamasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author makaron
 */

public class ConnectDatabase {
	private Connection connection;

	public ConnectDatabase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/kafe?useUnicode=true&characterEncoding=UTF-8", "root", "");
		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}
	}

	public Connection getConnection() {
		return this.connection;
	}
}
