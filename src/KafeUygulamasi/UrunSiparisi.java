
package KafeUygulamasi;

import com.mysql.jdbc.Statement;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class UrunSiparisi extends AbstractFrame {
	String masaAdi, masaAdiVeritabani;

	public UrunSiparisi(String masaAdi) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UrunSiparisi.class.getResource("/Resimler/gazilogo.png")));
		setTitle("Gazi Kafe");
		this.masaAdi = masaAdi;
		this.masaAdiVeritabani = masaAdi.replace(" ", "").toLowerCase();
		initComponents();
		this.setExtendedState(UrunSiparisi.MAXIMIZED_BOTH);
		jLabel1.setText(masaAdi);
		masasiparisleri(masaAdi);

	}
	private void initComponents() {

		jPanel1 = new JPanel();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton4 = new JButton();
		jButton5 = new JButton();
		jButton6 = new JButton();
		jButton7 = new JButton();
		jButton8 = new JButton();
		jButton9 = new JButton();
		jScrollPane3 = new JScrollPane();
		jTable1 = new JTable();
		jPanel3 = new JPanel();
		jScrollPane2 = new JScrollPane();
		jList1 = new JList<>();
		jPanel2 = new JPanel();
		jButton3 = new JButton();
		jButton10 = new JButton();
		jButton11 = new JButton();
		jButton12 = new JButton();
		jButton13 = new JButton();
		jButton14 = new JButton();
		jButton15 = new JButton();
		jButton16 = new JButton();
		jButton17 = new JButton();
		jTextField1 = new JTextField();
		jButton22 = new JButton();
		jButton23 = new JButton();
		jButton20 = new JButton();
		jButton21 = new JButton();
		jLabel1 = new JLabel();
		jButton24 = new JButton();
		jButton25 = new JButton();
		jLabel2 = new JLabel();
		jButton19 = new JButton();
		lblid = new JLabel();
		lbluruncesidi = new JLabel();
		lblfiyat = new JLabel();
		jLabel3 = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jPanel1.setBackground(new Color(102, 102, 102));

		jButton1.setFont(new Font("Tahoma", 1, 14)); 
		jButton1.setText("Çorbalar");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new Font("Tahoma", 1, 14)); 
		jButton2.setText("Dönerler");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton4.setFont(new Font("Tahoma", 1, 14)); 
		jButton4.setText("Pideler");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setFont(new Font("Tahoma", 1, 14)); 
		jButton5.setText("Et Yemekleri");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setFont(new Font("Tahoma", 1, 14)); 
		jButton6.setText("Kebaplar");
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setFont(new Font("Tahoma", 1, 14)); 
		jButton7.setText("Salatalar");
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setFont(new Font("Tahoma", 1, 14)); 
		jButton8.setText("Tatlýlar");
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setFont(new Font("Tahoma", 1, 14)); 
		jButton9.setText("Ýçecekler");
		jButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jTable1.setBackground(new Color(204, 204, 204));
		jTable1.setFont(new Font("Tahoma", 1, 12)); 
		jTable1.setModel(new DefaultTableModel(new Object[][] { {}, {}, {}, {} }, new String[] {

		}));
		jTable1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane3.setViewportView(jTable1);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addComponent(jButton2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(jButton6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(GroupLayout.Alignment.LEADING,
												jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
														.addComponent(jButton9, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButton5, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButton7, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(jButton8, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(4, 4, 4)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(12, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(26, 26, 26).addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(16, 16, 16)
								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel3.setBackground(new Color(102, 102, 102));

		jList1.setFont(new Font("Tahoma", 1, 16)); 
		jScrollPane2.setViewportView(jList1);

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(29, 29, 29)
						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(35, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(27, Short.MAX_VALUE)));

		jPanel2.setBackground(new Color(102, 102, 102));

		jButton3.setBackground(new Color(255, 255, 51));
		jButton3.setFont(new Font("Tahoma", 1, 12)); 
		jButton3.setText("1");
		jButton3.setToolTipText("");
		jButton3.setMargin(new Insets(9, 15, 9, 15));
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new Color(255, 255, 51));
		jButton10.setFont(new Font("Tahoma", 1, 12)); 
		jButton10.setText("2");
		jButton10.setMargin(new Insets(9, 15, 9, 15));
		jButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setBackground(new Color(255, 255, 51));
		jButton11.setFont(new Font("Tahoma", 1, 12)); 
		jButton11.setText("4");
		jButton11.setMargin(new Insets(9, 15, 9, 15));
		jButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setBackground(new Color(255, 255, 51));
		jButton12.setFont(new Font("Tahoma", 1, 12)); 
		jButton12.setText("5");
		jButton12.setMargin(new Insets(9, 15, 9, 15));
		jButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton13.setBackground(new Color(255, 255, 51));
		jButton13.setFont(new Font("Tahoma", 1, 14)); 
		jButton13.setText("7");
		jButton13.setMargin(new Insets(9, 15, 9, 15));
		jButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton14.setBackground(new Color(255, 255, 51));
		jButton14.setFont(new Font("Tahoma", 1, 12)); 
		jButton14.setText("3");
		jButton14.setMargin(new Insets(9, 15, 9, 15));
		jButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setBackground(new Color(255, 255, 51));
		jButton15.setFont(new Font("Tahoma", 1, 12)); 
		jButton15.setText("6");
		jButton15.setMargin(new Insets(9, 15, 9, 15));
		jButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setBackground(new Color(255, 255, 51));
		jButton16.setFont(new Font("Tahoma", 1, 12)); 
		jButton16.setText("9");
		jButton16.setMargin(new Insets(9, 15, 9, 15));
		jButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton17.setBackground(new Color(255, 255, 51));
		jButton17.setFont(new Font("Tahoma", 1, 12)); 
		jButton17.setText("8");
		jButton17.setMargin(new Insets(9, 15, 9, 15));
		jButton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		jTextField1.setFont(new Font("Tahoma", 1, 14)); 
		jTextField1.setToolTipText("");

		jButton22.setBackground(new Color(255, 255, 51));
		jButton22.setFont(new Font("Tahoma", 1, 12)); 
		jButton22.setText("C");
		jButton22.setMargin(new Insets(9, 15, 9, 15));
		jButton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});

		jButton23.setBackground(new Color(255, 255, 51));
		jButton23.setFont(new Font("Tahoma", 1, 12)); 
		jButton23.setText("0");
		jButton23.setMargin(new Insets(9, 15, 9, 15));
		jButton23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});

		jButton20.setFont(new Font("Tahoma", 1, 12)); 
		jButton20.setText("Ekle");
		jButton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton20ActionPerformed(evt);
			}
		});

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel2Layout.createSequentialGroup().addContainerGap(27, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(
								jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(
										jTextField1).addGroup(
												jPanel2Layout
														.createSequentialGroup().addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.TRAILING,
																		false)
																.addComponent(jButton13, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(jButton11, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(
																		jButton3, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGap(18, 18, 18)
														.addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.TRAILING,
																		false)
																.addComponent(jButton10, GroupLayout.Alignment.LEADING)
																.addComponent(jButton12, GroupLayout.Alignment.LEADING)
																.addComponent(jButton17))
														.addGap(18, 18, 18)
														.addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(jButton14, GroupLayout.Alignment.TRAILING)
																.addComponent(jButton15, GroupLayout.Alignment.TRAILING)
																.addComponent(jButton16,
																		GroupLayout.Alignment.TRAILING))))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 104,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jButton23)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton20)
						.addGap(16, 16, 16)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGap(17, 17, 17)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jButton3).addComponent(jButton10).addComponent(jButton14))
						.addGap(10, 10, 10)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jButton11).addComponent(jButton12).addComponent(jButton15))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jButton13).addComponent(jButton16).addComponent(jButton17))
						.addGap(10, 10, 10)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jButton23).addComponent(jButton22))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jButton21.setFont(new Font("Tahoma", 1, 12)); 
		jButton21.setText("Kapat");
		jButton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton21ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new Font("Tahoma", 1, 18)); 

		jButton24.setFont(new Font("Tahoma", 1, 14)); 
		jButton24.setText("Ýptal");
		jButton24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton24ActionPerformed(evt);
			}
		});

		jButton25.setFont(new Font("Tahoma", 1, 12)); 
		jButton25.setText("Ödeme");
		jButton25.setMargin(new Insets(6, 20, 6, 20));
		jButton25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton25ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new Font("Tahoma", 1, 18)); 

		jButton19.setForeground(new Color(255, 0, 0));
		jButton19.setText("Ana Menü");
		jButton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new Font("Tahoma", 1, 18)); 
		jLabel3.setText("Toplam:");

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(
												jLabel1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout
																.createParallelGroup(GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(
																		jPanel2, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addGroup(layout.createSequentialGroup()
																		.addComponent(jButton21,
																				GroupLayout.PREFERRED_SIZE, 101,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(jButton25,
																				GroupLayout.PREFERRED_SIZE, 130,
																				GroupLayout.PREFERRED_SIZE))))
												.addGroup(layout.createSequentialGroup().addGap(89, 89, 89)
														.addGroup(layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(lblid, GroupLayout.PREFERRED_SIZE, 0,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(lbluruncesidi, GroupLayout.PREFERRED_SIZE,
																		0, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblfiyat, GroupLayout.PREFERRED_SIZE, 0,
																		GroupLayout.PREFERRED_SIZE))))
										.addGap(18, 18, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 75,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 82,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 88,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButton19)))))
						.addGap(32, 32, 32)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(36, 36, 36)
				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(32, 32, 32)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
								.addGroup(
										layout.createSequentialGroup().addGap(16, 16, 16).addComponent(lblid)
												.addGap(18, 18, 18)
												.addComponent(lbluruncesidi, GroupLayout.PREFERRED_SIZE, 0,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(lblfiyat, GroupLayout.PREFERRED_SIZE, 0,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)
												.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
														.addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 42,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 42,
																GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(36, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jButton19).addGap(22, 22, 22)))));

		jPanel3.getAccessibleContext().setAccessibleName("");

		pack();
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
				model1.addElement(resultSet.getString("id") + "  " + resultSet.getString("adet") + " Adet "
						+ resultSet.getString("siparis") + "  " + resultSet.getString("tutar"));
			}
			jList1.setModel(model1);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

		jLabel2.setText(String.valueOf(toplam + " TL"));

	}

	public void siparissil(String masa_adi, String silinecek) {

		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			String sql = " Delete from " + masa_adi + " where id='" + silinecek + "'";
			statement.executeUpdate(sql);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

	}

	public void veritabani(String isim) {

		try {
			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			if(jTextField1.getText() == null || jTextField1.getText().equals("")) {
				jTextField1.setText("1");
			}
			String sql = "INSERT INTO " + isim + " (adet,siparis,tutar)" + " VALUES ('" + jTextField1.getText() + "', '"
					+ lbluruncesidi.getText() + "', '" + lblfiyat.getText() + "')";
			statement.executeUpdate(sql);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanýna baðlantý saðlanamadý! " + ex.toString());
		}

	}

	private void YemekSectir(String belirtec) {
		DefaultTableModel tm = new DefaultTableModel();

		try {

			ConnectDatabase connectDatabase = new ConnectDatabase();
			Connection connection = connectDatabase.getConnection();
			Statement statement = (Statement) connection.createStatement();
			try (ResultSet resultSet = statement
					.executeQuery("Select * from urunler where cesitleri='" + belirtec + "'")) {
				int colcount = resultSet.getMetaData().getColumnCount();

				for (int i = 1; i <= colcount; i++)
					tm.addColumn(resultSet.getMetaData().getColumnName(i));
				while (resultSet.next()) {
					Object[] row = new Object[colcount];
					for (int i = 1; i <= colcount; i++)
						row[i - 1] = resultSet.getObject(i);
					tm.addRow(row);
				}
				jTable1.removeAll();
				jTable1.setModel(tm);
			}
			connection.close();
		} catch (Exception hata) {
			JOptionPane.showMessageDialog(null, "Hata!!" + hata);
		}
	}

	private void jButton3ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "1");
	}

	private void jButton10ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "2");
	}

	private void jButton14ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "3");
	}

	private void jButton11ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "4");
	}

	private void jButton12ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "5");
	}

	private void jButton15ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "6");
	}

	private void jButton13ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "7");
	}

	private void jButton17ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "8");
	}

	private void jButton16ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "9");
	}

	private void jButton23ActionPerformed(ActionEvent evt) {
		jTextField1.setText(jTextField1.getText() + "0");
	}

	private void jButton22ActionPerformed(ActionEvent evt) {
		jTextField1.setText(null);

	}

	DefaultListModel listmodel = new DefaultListModel();

	private void jButton20ActionPerformed(ActionEvent evt) {
		lblid.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
		lbluruncesidi.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)));
		lblfiyat.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)));

		veritabani(this.masaAdiVeritabani);
		listmodel.addElement(jTextField1.getText() + " Adet " + lbluruncesidi.getText() + "  " + lblfiyat.getText());
		jList1.setModel(listmodel);
		masasiparisleri("Masa 1");
	}

	private void jButton9ActionPerformed(ActionEvent evt) {
		YemekSectir("Icecekler");
	}
	private void jButton8ActionPerformed(ActionEvent evt) {
		YemekSectir("Tatlilar");
	}

	private void jButton7ActionPerformed(ActionEvent evt) {
		YemekSectir("Salatalar");
	}

	private void jButton6ActionPerformed(ActionEvent evt) {
		YemekSectir("Kebaplar");
	}

	private void jButton5ActionPerformed(ActionEvent evt) {
		YemekSectir("Et Yemekleri");
	}

	private void jButton4ActionPerformed(ActionEvent evt) {
		YemekSectir("Pideler");
	}

	private void jButton2ActionPerformed(ActionEvent evt) {
		YemekSectir("Dönerler");
	}

	private void jButton1ActionPerformed(ActionEvent evt) {

		YemekSectir("Çorbalar");
	}

	private void jButton24ActionPerformed(ActionEvent evt) {

		String isim = jList1.getSelectedValue().toString();
		String a = isim.substring(0, 2);
		siparissil(this.masaAdiVeritabani, a);
		JOptionPane.showMessageDialog(this, "Seçtiðiniz ürün baþarýyla iptal edildi");
		masasiparisleri(this.masaAdi);
	}

	private void jButton21ActionPerformed(ActionEvent evt) {
		Masalar frame = new Masalar();
		frame.setVisible(true);
		this.dispose();
	}

	private void jButton25ActionPerformed(ActionEvent evt) {

		Odeme frame = new Odeme(this.masaAdi, this.masaAdiVeritabani);
		frame.setVisible(true);
		this.dispose();
	}

	private void jButton19ActionPerformed(ActionEvent evt) {
		Anasayfa frame = new Anasayfa();
		frame.setVisible(true);
		this.dispose();
	}

	private void jTable1MouseClicked(MouseEvent evt) {

	}

	public static void main(String args[]) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UrunSiparisi("masa").setVisible(true);

			}
		});
	}

	
	private JButton jButton1;
	private JButton jButton10;
	private JButton jButton11;
	private JButton jButton12;
	private JButton jButton13;
	private JButton jButton14;
	private JButton jButton15;
	private JButton jButton16;
	private JButton jButton17;
	private JButton jButton19;
	private JButton jButton2;
	private JButton jButton20;
	private JButton jButton21;
	private JButton jButton22;
	private JButton jButton23;
	private JButton jButton24;
	private JButton jButton25;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JButton jButton6;
	private JButton jButton7;
	private JButton jButton8;
	private JButton jButton9;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JList<String> jList1;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JTable jTable1;
	private JTextField jTextField1;
	private JLabel lblfiyat;
	private JLabel lblid;
	private JLabel lbluruncesidi;
	
}
