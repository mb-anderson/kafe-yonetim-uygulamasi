package KafeUygulamasi;

import com.mysql.jdbc.Statement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class Odeme extends AbstractFrame {
	String masaAdi, masaAdiVeritabani;

	public Odeme(String masaAdi, String masaAdiVeritabani) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Odeme.class.getResource("/Resimler/gazilogo.png")));
		setTitle("Gazi Kafe");
		this.masaAdi = masaAdi;
		this.masaAdiVeritabani = masaAdiVeritabani;
		initComponents();
		jLabel2.setText(masaAdi);
		masasiparisleri(masaAdi);
	}
	private void initComponents() {

		jButton37 = new JButton();
		jPanel1 = new JPanel();
		jScrollPane1 = new JScrollPane();
		jList1 = new JList<>();
		jPanel2 = new JPanel();
		jLabel1 = new JLabel();
		Odeme1 = new JButton();
		jLabel3 = new JLabel();
		jButton4 = new JButton();
		jLabel2 = new JLabel();

		jButton37.setBackground(new Color(255, 255, 102));
		jButton37.setFont(new Font("Tahoma", 1, 12));
		jButton37.setText("Nakit");
		jButton37.setMargin(new Insets(6, 20, 6, 20));

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jPanel1.setBackground(new Color(102, 102, 102));

		jScrollPane1.setViewportView(jList1);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1).addContainerGap()));

		jPanel2.setBackground(new Color(102, 102, 102));

		jLabel1.setFont(new Font("Tahoma", 1, 18));
		jLabel1.setForeground(new Color(255, 255, 255));

		Odeme1.setFont(new Font("Tahoma", 1, 12));
		Odeme1.setText("Hesabý Kapat");
		Odeme1.setMargin(new Insets(6, 20, 6, 20));
		Odeme1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Odeme1ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new Font("Tahoma", 1, 18));
		jLabel3.setText("Toplam:");

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(34, 34, 34)
								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addGap(71, 71, 71)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(52, 52, 52).addComponent(Odeme1,
								GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(55, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(51, 51, 51)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE).addComponent(
										jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addComponent(Odeme1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));

		jButton4.setForeground(new Color(255, 0, 0));
		jButton4.setText("Masa Deðiþtir");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new Font("Tahoma", 1, 18));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
														.addComponent(jButton4))
												.addGroup(layout.createSequentialGroup()
														.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(7, 7, 7)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(245, 245, 245)
								.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap()));

		setSize(new Dimension(568, 540));
		setLocationRelativeTo(null);
	}

	public void masasiparisleri(String masaad) {

		int toplam = 0;
		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from " + this.masaAdiVeritabani);

			DefaultListModel model1 = new DefaultListModel();
			while (resultSet.next()) {
				toplam += (Integer.parseInt(resultSet.getString("adet")))
						* (Integer.parseInt(resultSet.getString("tutar")));
				model1.addElement(resultSet.getString("adet") + " Adet " + resultSet.getString("siparis") + "  "
						+ resultSet.getString("tutar"));
			}
			jList1.setModel(model1);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

		jLabel1.setText(String.valueOf(toplam + " TL"));

	}

	private void jButton4ActionPerformed(ActionEvent evt) {
		Masalar frame = new Masalar();
		frame.setVisible(true);
		this.dispose();
	}

	private void Odeme1ActionPerformed(ActionEvent evt) {

		try {

			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			String sql = " Delete from " + this.masaAdiVeritabani;
			statement.executeUpdate(sql);
			masasiparisleri(this.masaAdi);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

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
			Logger.getLogger(Odeme.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Odeme.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Odeme.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Odeme.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {

			}
		});
	}

	
	private JButton Odeme1;
	private JButton jButton37;
	private JButton jButton4;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JList<String> jList1;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	
}
