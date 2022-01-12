package KafeUygulamasi;

import com.mysql.jdbc.Statement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class Urunler extends AbstractFrame {

	private void urunSectir(String belirtec) {
		DefaultTableModel tableModel = new DefaultTableModel();
		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			try (ResultSet resultSet = statement
					.executeQuery("Select * from urunler where cesitleri='" + belirtec + "'")) {
				int sutunSayisi = resultSet.getMetaData().getColumnCount();

				for (int i = 1; i <= sutunSayisi; i++)
					tableModel.addColumn(resultSet.getMetaData().getColumnName(i));
				while (resultSet.next()) {
					Object[] row = new Object[sutunSayisi];
					for (int i = 1; i <= sutunSayisi; i++)
						row[i - 1] = resultSet.getObject(i);
					tableModel.addRow(row);
				}
				jTable1.removeAll();
				jTable1.setModel(tableModel);
			}
			connection.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
		}
	}

	public Urunler() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Urunler.class.getResource("/Resimler/gazilogo.png")));
		setTitle("Gazi Kafe");
		initComponents();

	}

	private void initComponents() {

		jLabel4 = new JLabel();
		jPanel1 = new JPanel();
		jScrollPane3 = new JScrollPane();
		jTable1 = new JTable();
		jScrollPane2 = new JScrollPane();
		jList1 = new JList<>();
		jButton1 = new JButton();
		jLabel3 = new JLabel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jTxtUrunAdi = new JTextField();
		jTxtUrunCesidi = new JTextField();
		jTxtfiyati = new JTextField();
		jButton2 = new JButton();
		jButton3 = new JButton();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jLabel4.setText("jLabel4");

		jPanel1.setBackground(new Color(102, 102, 102));

		jTable1.setFont(new Font("Tahoma", 1, 12));
		jTable1.setModel(new DefaultTableModel(new Object[][] { {}, {}, {}, {} }, new String[] {

		}));
		jTable1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane3.setViewportView(jTable1);

		jList1.setFont(new Font("Tahoma", 1, 12));
		jList1.setModel(new AbstractListModel<String>() {
			String[] strings = { "Çorbalar", "Dönerler", "Pideler", "Et Yemekleri", "Kebaplar", "Salatalar",
					"Ýçecekler", "Tatlýlar" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		jList1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				jList1MouseClicked(evt);
			}
		});
		jScrollPane2.setViewportView(jList1);

		jButton1.setFont(new Font("Tahoma", 1, 14));
		jButton1.setText("Deðiþtir");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new Font("Tahoma", 1, 12));
		jLabel3.setForeground(new Color(255, 255, 255));
		jLabel3.setText("Fiyatý:");

		jLabel1.setFont(new Font("Tahoma", 1, 12));
		jLabel1.setForeground(new Color(255, 255, 255));
		jLabel1.setText("\u00DCr\u00FCn \u00C7e\u015Fidi:");

		jLabel2.setFont(new Font("Tahoma", 1, 12));
		jLabel2.setForeground(new Color(255, 255, 255));
		jLabel2.setText("Ürün Adý:");

		jButton2.setFont(new Font("Tahoma", 1, 14));
		jButton2.setText("Sil");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new Font("Tahoma", 1, 14));
		jButton3.setText("Ekle");
		jButton3.setToolTipText("");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jButton19 = new JButton();

		jButton19.setForeground(new Color(255, 0, 0));
		jButton19.setText("Ana Menü");
		jButton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 91,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 613,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 46,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1)
												.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE))
										.addGap(30)
										.addGroup(jPanel1Layout
												.createParallelGroup(Alignment.TRAILING)
												.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jButton2)
														.addPreferredGap(ComponentPlacement.RELATED, 31,
																Short.MAX_VALUE)
														.addComponent(jButton3))
												.addComponent(jTxtUrunCesidi, GroupLayout.DEFAULT_SIZE, 139,
														Short.MAX_VALUE)
												.addComponent(jTxtUrunAdi, 139, 139, 139).addComponent(jTxtfiyati,
														GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
										.addGap(26))
								.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
										.addComponent(jButton19).addContainerGap()))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(Alignment.LEADING,
										false)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jTxtUrunAdi, GroupLayout.PREFERRED_SIZE, 30,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jTxtUrunCesidi, GroupLayout.PREFERRED_SIZE, 29,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jTxtfiyati, GroupLayout.PREFERRED_SIZE, 28,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 34,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 32,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 32,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 32,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(11)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 0,
														Short.MAX_VALUE)
												.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(18).addComponent(jButton19).addContainerGap(24, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(593)
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(429, Short.MAX_VALUE))
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE).addGap(7)));
		getContentPane().setLayout(layout);

		setSize(new Dimension(1038, 267));
		setLocationRelativeTo(null);
	}

	private void jButton1ActionPerformed(ActionEvent evt) {
		try {
			String Urunadi = jTxtUrunAdi.getText();
			String Uruncesidi = jTxtUrunCesidi.getText();
			String fiyati = jTxtfiyati.getText();

			if (Urunadi.equals("") || Uruncesidi.equals("") || fiyati.equals("")) {

				JOptionPane.showMessageDialog(this, "Lütfen Boþ Alanlarý Doldurunuz!");

			} else {
				ConnectDatabase connectDatabase = new ConnectDatabase();
				Connection connection = connectDatabase.getConnection();
				Statement statement = (Statement) connection.createStatement();
				String sql = "Update urunler set urun_adi='" + jTxtUrunAdi.getText() + "', cesitleri='"
						+ jTxtUrunCesidi.getText() + "', fiyat='" + jTxtfiyati.getText() + "' where id='"
						+ jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "'";

				statement.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Kayýt güncelleme iþlemi baþarýlý bir þekilde gerçekleþtirildi");

			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		} finally {
			urunSectir(jList1.getSelectedValue());
		}
	}

	private void jButton2ActionPerformed(ActionEvent evt) {

		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			String sql = " Delete from urunler where id='" + jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "'";
			statement.executeUpdate(sql);
			urunSectir(jList1.getSelectedValue());
			JOptionPane.showMessageDialog(null, "Kayýt silme iþlemi baþarýlý bir þekilde gerçekleþtirildi");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		} finally {
			urunSectir(jList1.getSelectedValue());
		}
	}

	private void jButton3ActionPerformed(ActionEvent evt) {

		try {
			String Urunadi = jTxtUrunAdi.getText();
			String Uruncesidi = jTxtUrunCesidi.getText();
			String fiyati = jTxtfiyati.getText();

			if (Urunadi.equals("") || Uruncesidi.equals("") || fiyati.equals("")) {

				JOptionPane.showMessageDialog(this, "Lütfen Boþ Alanlarý Doldurunuz!");

			} else {

				ConnectDatabase connectDatabase = new ConnectDatabase();
				Connection connection = connectDatabase.getConnection();
				Statement statement = (Statement) connection.createStatement();

				String sql = "INSERT INTO urunler (urun_adi,cesitleri,	fiyat)" + " VALUES ('" + jTxtUrunAdi.getText()
						+ "', '" + jTxtUrunCesidi.getText() + "', '" + jTxtfiyati.getText() + "')";

				statement.executeUpdate(sql);

				JOptionPane.showMessageDialog(null, "Kayýt iþlemi baþarýlý bir þekilde gerçekleþtirildi");

			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());

		} finally {
			urunSectir(jList1.getSelectedValue());
		}

	}

	private void jList1MouseClicked(MouseEvent evt) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		jTxtUrunCesidi.setText(String.valueOf(jList1.getSelectedValue()));
		while (model.getRowCount() > 0) {
			for (int i = 0; i < model.getRowCount(); i++) {
				model.removeRow(i);
			}
		}
		try {
			urunSectir(jList1.getSelectedValue());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Böyle Bir Ürün Yok!");
		}

	}

	private void jTable1MouseClicked(MouseEvent evt) {

		jTxtUrunAdi.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
		jTxtUrunCesidi.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)));
		jTxtfiyati.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)));

	}

	private void jButton19ActionPerformed(ActionEvent evt) {
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
			Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Urunler().setVisible(true);
			}
		});
	}

	private JButton jButton1;
	private JButton jButton19;
	private JButton jButton2;
	private JButton jButton3;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JList<String> jList1;
	private JPanel jPanel1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JTable jTable1;
	private JTextField jTxtUrunAdi;
	private JTextField jTxtUrunCesidi;
	private JTextField jTxtfiyati;

}
