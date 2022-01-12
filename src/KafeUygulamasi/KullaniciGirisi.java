package KafeUygulamasi;

import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class KullaniciGirisi extends AbstractFrame {

	public KullaniciGirisi() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(KullaniciGirisi.class.getResource("/Resimler/gazilogo.png")));
		initComponents();
	}

	private void initComponents() {

		buttonGroup1 = new ButtonGroup();
		jPasswordField1 = new JPasswordField();
		jScrollPane1 = new JScrollPane();
		jEditorPane1 = new JEditorPane();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jButton12 = new JButton();
		jButton14 = new JButton();
		jLabel2 = new JLabel();
		jLabel4 = new JLabel();
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		txt_kullanici_adi = new JTextField();
		txt_sifre = new JPasswordField();

		jPasswordField1.setText("jPasswordField1");

		jScrollPane1.setViewportView(jEditorPane1);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Gazi Kafe");
		setBackground(new Color(0, 51, 51));
		setFocusable(false);
		setLocation(new Point(500, 200));
		setName("kullaniciGirisi");
		setResizable(false);
		setSize(new Dimension(642, 331));

		jPanel1.setBackground(new Color(0, 51, 51));

		jLabel1.setFont(new Font("Tahoma", 0, 14));
		jLabel1.setForeground(new Color(255, 255, 255));
		jLabel1.setText("Şifre Gir :");

		jButton12.setText("Çıkış");
		jButton12.setMaximumSize(new Dimension(43, 23));
		jButton12.setMinimumSize(new Dimension(43, 23));
		jButton12.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				jButton12MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				jButton12MouseExited(evt);
			}
		});
		jButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton14.setText("Giriş");
		jButton14.setIconTextGap(3);
		jButton14.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				jButton14MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				jButton14MouseExited(evt);
			}
		});
		jButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new Font("Tahoma", 0, 14));
		jLabel2.setForeground(new Color(255, 255, 255));
		jLabel2.setText("Kullanıcı Adı :");

		jLabel4.setIcon(new ImageIcon(KullaniciGirisi.class.getResource("/Resimler/users-solid.png"))); // NOI18N
		jLabel4.setText("jLabel4");

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
								.addGap(27, 27, 27)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 79,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
										GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 65,
																GroupLayout.PREFERRED_SIZE)
														.addGap(43, 43, 43).addComponent(jButton14,
																GroupLayout.PREFERRED_SIZE, 60,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(txt_sifre))
										.addComponent(txt_kullanici_adi, GroupLayout.Alignment.TRAILING,
												GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(66, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(64, 64, 64)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(txt_kullanici_adi, GroupLayout.PREFERRED_SIZE, 30,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGap(14, 14, 14)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(txt_sifre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(63, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE).addContainerGap()));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void jButton14ActionPerformed(ActionEvent evt) {
		try {

			String kullanici_adi = txt_kullanici_adi.getText();
			String sifre = txt_sifre.getText();

			if (kullanici_adi.equals("") || sifre.equals("")) {

				JOptionPane.showMessageDialog(this, "Lütfen Boş Alanları Doldurunuz!");

			} else {

				ConnectDatabase connectDatabase = new ConnectDatabase();
				Connection connection = connectDatabase.getConnection();
				Statement statement = (Statement) connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from personeller where kullaniciAdi='"
						+ kullanici_adi + "' and sifre='" + sifre + "'");
				resultSet.next();

				Integer satirSayi = resultSet.getRow();

				if (satirSayi < 1) {
					JOptionPane.showMessageDialog(null, "Böyle Bir Kullanıcı Kayıtlı Değil!");
					connection.close();
				} else {

					Anasayfa frame = new Anasayfa();
					frame.setVisible(true);
					this.dispose();
				}

			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
		}

	}

	private void jButton12ActionPerformed(ActionEvent evt) {
		dispose();
	}

	private void jButton12MouseEntered(MouseEvent evt) {
		jButton12.setBackground(Color.red);
	}

	private void jButton12MouseExited(MouseEvent evt) {
		jButton12.setBackground(Color.LIGHT_GRAY);
	}

	private void jButton14MouseEntered(MouseEvent evt) {
		jButton14.setBackground(Color.yellow);
	}

	private void jButton14MouseExited(MouseEvent evt) {
		jButton14.setBackground(Color.LIGHT_GRAY);
	}

	public static void main(String args[]) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new KullaniciGirisi().setVisible(true);
			}
		});
	}

	private ButtonGroup buttonGroup1;
	private JButton jButton12;
	private JButton jButton14;
	private JEditorPane jEditorPane1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel4;
	private JPanel jPanel1;
	private JPasswordField jPasswordField1;
	private JScrollPane jScrollPane1;
	private JTextField txt_kullanici_adi;
	private JPasswordField txt_sifre;

}