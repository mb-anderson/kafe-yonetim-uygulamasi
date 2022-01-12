package KafeUygulamasi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class GunIslemleri extends AbstractFrame {

	public GunIslemleri() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GunIslemleri.class.getResource("/Resimler/gazilogo.png")));
		setTitle("Gazi Kafe");
		initComponents();
		Date simdikiZaman = new Date();
		jLabel1.setText(simdikiZaman.toString());
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy kk:mm");
		jLabel1.setText(dateFormat.format(simdikiZaman));
		jLabel2.setVisible(false);

		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from gun_basi where gun_basi_tarih='" + 1 + "'");

			DefaultListModel model1 = new DefaultListModel();
			while (resultSet.next()) {
				model1.addElement(resultSet.getString("gunBasi"));
			}
			jList2.setModel(model1);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

		try {

			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from gun_sonu where gun_sonu_tarih='" + 1 + "'");

			DefaultListModel model1 = new DefaultListModel();
			while (resultSet.next()) {
				model1.addElement(resultSet.getString("Gunsonu"));
			}
			jList1.setModel(model1);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from gun_basi");

			DefaultListModel model1 = new DefaultListModel();
			while (resultSet.next()) {
				model1.addElement("Gün Baþý Saati: " + resultSet.getString("gun_basi_tarih"));
			}
			jList2.setModel(model1);

			resultSet = statement.executeQuery("select * from gun_sonu");

			model1 = new DefaultListModel();
			while (resultSet.next()) {
				model1.addElement("Gün Sonu Saati: " + resultSet.getString("gun_sonu_tarih"));
			}
			jList1.setModel(model1);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

	}

	private void initComponents() {

		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jPanel1 = new JPanel();
		jButton2 = new JButton();
		jScrollPane1 = new JScrollPane();
		jList1 = new JList<>();
		jPanel2 = new JPanel();
		jScrollPane2 = new JScrollPane();
		jList2 = new JList<>();
		jButton1 = new JButton();
		jButton3 = new JButton();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jLabel1.setFont(new Font("Tahoma", 1, 12));

		jLabel2.setFont(new Font("Tahoma", 1, 12));
		jLabel2.setForeground(new Color(255, 0, 0));
		jLabel2.setText("GÜN SONU YAPMAYI UNUTMAYINIZ!");

		jPanel1.setBackground(new Color(102, 102, 102));

		jButton2.setBackground(new Color(0, 102, 204));
		jButton2.setFont(new Font("Tahoma", 1, 13));
		jButton2.setForeground(new Color(255, 255, 255));
		jButton2.setText("Gün Sonu Yap");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jScrollPane1.setViewportView(jList1);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(24, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel2.setBackground(new Color(102, 102, 102));

		jScrollPane2.setViewportView(jList2);

		jButton1.setBackground(new Color(0, 102, 204));
		jButton1.setFont(new Font("Tahoma", 1, 13));
		jButton1.setForeground(new Color(255, 255, 255));
		jButton1.setText("Gün Baþý Yap");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel2Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
						.addGap(34, 34, 34)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel2Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 509, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addGap(58, 58, 58)));

		jButton3.setForeground(new Color(255, 0, 0));
		jButton3.setText("Ana Menü");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addGap(134, 134, 134)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addGap(0, 706, Short.MAX_VALUE).addComponent(
										jButton3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 366,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 16, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		setSize(new Dimension(850, 696));
		setLocationRelativeTo(null);
	}

	private void gunsonu(String gun_sonu) {

		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();

			String sql = "INSERT INTO gun_sonu (gun_sonu_tarih)" + " VALUES ('" + gun_sonu + "' )";
			statement.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Kayýt Ýþleminiz Gerçekleþmiþtir.");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Veritabanýna baðlantý saðlanamadý! " + e);
		}
	}

	private void gunbasi(String gun_basi) {

		try {

			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();

			String sql = "INSERT INTO gun_basi (gun_basi_tarih)" + " VALUES ('" + gun_basi + "' )";
			statement.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Kayýt Ýþleminiz Gerçekleþmiþtir.");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Veritabanýna baðlantý saðlanamadý! " + e);
		}
	}

	DefaultListModel gunsonu = new DefaultListModel();

	private void jButton2ActionPerformed(ActionEvent evt) {

		Date simdikiZaman = new Date();
		jLabel1.setText(simdikiZaman.toString());
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy kk:mm");
		jLabel1.setText(df.format(simdikiZaman));
		gunsonu(df.format(simdikiZaman).toString());
		gunsonu.addElement("Gün Sonu saati: " + jLabel1.getText());
		jList1.setModel(gunsonu);
		jLabel2.setVisible(false);
	}

	private void jButton3ActionPerformed(ActionEvent evt) {
		Anasayfa frame = new Anasayfa();
		frame.setVisible(true);
		this.setVisible(false);

	}

	private void jButton1ActionPerformed(ActionEvent evt) {

		Date simdikiZaman = new Date();

		jLabel1.setText(simdikiZaman.toString());
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy kk:mm");
		jLabel1.setText(df.format(simdikiZaman));

		gunbasi(df.format(simdikiZaman).toString());
		gunbasi.addElement("Gün Baþý saati: " + jLabel1.getText());
		jList2.setModel(gunbasi);
		jLabel2.setVisible(true);

	}

	DefaultListModel gunbasi = new DefaultListModel();

	public static void main(String args[]) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GunIslemleri().setVisible(true);
			}
		});
	}

	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JList<String> jList1;
	private JList<String> jList2;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;

}
