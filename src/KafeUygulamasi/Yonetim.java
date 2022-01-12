package KafeUygulamasi;

import com.mysql.jdbc.Statement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class Yonetim extends AbstractFrame {

	DefaultTableModel tableModel = new DefaultTableModel();

	public Yonetim() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Yonetim.class.getResource("/Resimler/gazilogo.png")));
		setTitle("Gazi Kafe");
		initComponents();
		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();

			try (ResultSet resultSet = statement.executeQuery("Select * from personeller")) {
				int colcount = resultSet.getMetaData().getColumnCount();

				for (int i = 1; i <= colcount; i++)
					tableModel.addColumn(resultSet.getMetaData().getColumnName(i));
				while (resultSet.next()) {
					Object[] row = new Object[colcount];
					for (int i = 1; i <= colcount; i++)
						row[i - 1] = resultSet.getObject(i);
					tableModel.addRow(row);
				}
				jTable1.setModel(tableModel);
			}
			connection.close();
		} catch (Exception hata) {
			JOptionPane.showMessageDialog(null, "Hata!!" + hata);
		}
	}

	private void initComponents() {

		jLabel5 = new JLabel();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		TxtkAdi = new JTextField();
		TxtSoyadi = new JTextField();
		TxtAdi = new JTextField();
		TxtSifre = new JTextField();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jScrollPane3 = new JScrollPane();
		jTable1 = new JTable();
		jButton4 = new JButton();

		jLabel5.setText("jLabel5");

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jPanel1.setBackground(new Color(102, 102, 102));
		jPanel1.setForeground(new Color(255, 255, 255));

		jLabel1.setFont(new Font("Tahoma", 1, 14));
		jLabel1.setForeground(new Color(255, 255, 255));
		jLabel1.setText("Adý:");

		jLabel2.setFont(new Font("Tahoma", 1, 14));
		jLabel2.setForeground(new Color(255, 255, 255));
		jLabel2.setText("Soyadý:");

		jLabel3.setFont(new Font("Tahoma", 1, 14));
		jLabel3.setForeground(new Color(255, 255, 255));
		jLabel3.setText("Parola");

		jLabel4.setFont(new Font("Tahoma", 1, 14));
		jLabel4.setForeground(new Color(255, 255, 255));
		jLabel4.setText("Kullanýcý Adý:");

		jButton1.setFont(new Font("Tahoma", 1, 13));
		jButton1.setText("Kullanýcý Ekle");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Deðiþtir");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Sil");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jTable1.setFont(new Font("Tahoma", 1, 12));
		jTable1.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null } },
				new String[] { "id", "kullaniciAdi", "adi", "soyadi" }));
		jTable1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane3.setViewportView(jTable1);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(jLabel3,
										GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
								.addGap(36, 36, 36)
								.addGroup(jPanel1Layout
										.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(TxtSoyadi, GroupLayout.PREFERRED_SIZE, 138,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(
												TxtSifre, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
										.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 138,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel4).addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE))
								.addGap(34, 34, 34)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(TxtkAdi, GroupLayout.PREFERRED_SIZE, 138,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(TxtAdi, GroupLayout.PREFERRED_SIZE, 138,
												GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(68, 68, 68)
										.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 94,
												GroupLayout.PREFERRED_SIZE)
										.addGap(46, 46, 46).addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 105,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(34, 34, 34).addComponent(
										jScrollPane3, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(36, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(36, 36, 36)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(TxtkAdi, GroupLayout.PREFERRED_SIZE, 29,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 28,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(TxtAdi, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
										.addGap(20, 20, 20)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(TxtSoyadi, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
												.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE))
										.addGap(20, 20, 20)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 24,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(TxtSifre, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 35,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(35, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 154,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 38,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 38,
														GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, Short.MAX_VALUE)))));

		jButton4.setForeground(new Color(255, 0, 0));
		jButton4.setText("Ana Menü");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(31, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 95,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(23, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(22, 22, 22)
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)));

		setSize(new Dimension(897, 403));
		setLocationRelativeTo(null);
	}

	private void jButton1ActionPerformed(ActionEvent evt) {

		try {

			String uye_kadi = TxtkAdi.getText();
			String adi = TxtAdi.getText();
			String Soyadi = TxtSoyadi.getText();
			String Sifre = TxtSifre.getText();

			if (uye_kadi.equals("") || adi.equals("") || Soyadi.equals("") || Sifre.equals("")) {

				JOptionPane.showMessageDialog(this, "Lutfen Boþ Alanlarý Doldurunuz!");

			} else {
				ConnectDatabase connectDatabase = new ConnectDatabase();
				Connection connection = connectDatabase.getConnection();
				Statement statement = (Statement) connection.createStatement();
				String sql = "INSERT INTO personeller (adi,soyadi,sifre,kullaniciAdi)" + " VALUES ('" + TxtAdi.getText()
						+ "', '" + TxtSoyadi.getText() + "', '" + TxtSifre.getText() + "','" + TxtkAdi.getText() + "')";

				statement.executeUpdate(sql);
				tableModel.insertRow(tableModel.getRowCount(), new Object[] { "", TxtAdi.getText(), TxtAdi.getText(),
						TxtSoyadi.getText(), TxtSifre.getText() });
				JOptionPane.showMessageDialog(null, "Kayýt iþlemi baþarýlý bir þekilde gerçekleþtirildi");

			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabana baðlantý saðlanamadý! " + ex.toString());
		}
	}

	private void jButton2ActionPerformed(ActionEvent evt) {

		try {
			String uye_kadi = TxtkAdi.getText();
			String adi = TxtAdi.getText();
			String Soyadi = TxtSoyadi.getText();
			String Sifre = TxtSifre.getText();

			if (uye_kadi.equals("") || adi.equals("") || Soyadi.equals("") || Sifre.equals("")) {

				JOptionPane.showMessageDialog(this, "Lütfen Boþ Alanlarý Doldurunuz!");

			} else {
				ConnectDatabase connectDatabase = new ConnectDatabase();
				Connection connection = connectDatabase.getConnection();
				Statement statement = (Statement) connection.createStatement();
				String sql = "Update personeller set kullaniciAdi='" + TxtkAdi.getText() + "', adi='" + TxtAdi.getText()
						+ "', soyadi='" + TxtSoyadi.getText() + "', sifre='" + TxtSifre.getText() + "' where ID='"
						+ jLabel5.getText() + "'";

				statement.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Kayýt güncelleme iþlemi baþarýlý bir þekilde gerçekleþtirildi");

			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

	}

	private void jTable1MouseClicked(MouseEvent evt) {
		TxtkAdi.setText(String.valueOf(tableModel.getValueAt(jTable1.getSelectedRow(), 1)));
		TxtAdi.setText(String.valueOf(tableModel.getValueAt(jTable1.getSelectedRow(), 2)));
		TxtSoyadi.setText(String.valueOf(tableModel.getValueAt(jTable1.getSelectedRow(), 3)));
		TxtSifre.setText(String.valueOf(tableModel.getValueAt(jTable1.getSelectedRow(), 4)));
		jLabel5.setText(String.valueOf(tableModel.getValueAt(jTable1.getSelectedRow(), 0)));
	}

	private void jButton3ActionPerformed(ActionEvent evt) {

		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();

			String sql = " Delete from personeller where ID='" + jLabel5.getText() + "'";
			statement.executeUpdate(sql);
			tableModel.removeRow(jTable1.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Kayýt silme iþlemi baþarýlý bir þekilde gerçekleþtirildi");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabana baðlantý saðlanamadý! " + ex.toString());
		}
	}

	private void jButton4ActionPerformed(ActionEvent evt) {

		Anasayfa frame = new Anasayfa();
		frame.setVisible(true);
		this.dispose();
	}

	public static void main(String args[]) {

		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Yonetim().setVisible(true);
			}
		});
	}

	private JTextField TxtAdi;
	private JTextField TxtSifre;
	private JTextField TxtSoyadi;
	private JTextField TxtkAdi;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JPanel jPanel1;
	private JScrollPane jScrollPane3;
	private JTable jTable1;

}
