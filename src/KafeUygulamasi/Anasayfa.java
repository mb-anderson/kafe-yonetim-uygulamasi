package KafeUygulamasi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class Anasayfa extends AbstractFrame {
	public Anasayfa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Anasayfa.class.getResource("/Resimler/gazilogo.png")));
		initComponents();
		this.setExtendedState(this.MAXIMIZED_BOTH);

	}

	private void initComponents() {

		jButton1 = new JButton();
		jButton6 = new JButton();
		jButton7 = new JButton();
		jButton8 = new JButton();
		jButton2 = new JButton();
		jLabel1 = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Gazi Kafe");
		setBackground(new Color(0, 0, 204));
		setForeground(Color.red);
		setLocationByPlatform(true);
		setResizable(false);

		jButton1.setBackground(new Color(51, 102, 255));
		jButton1.setFont(new Font("Tahoma", 0, 35));
		jButton1.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.jpg")));
		jButton1.setText("Post");
		jButton1.setMaximumSize(new Dimension(400, 400));
		jButton1.setMinimumSize(new Dimension(300, 300));
		jButton1.setPreferredSize(new Dimension(100, 90));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new Color(51, 102, 255));
		jButton6.setFont(new Font("Tahoma", 0, 35));
		jButton6.setIcon(new ImageIcon(getClass().getResource("/Resimler/urunler1.jpg")));
		jButton6.setText("Raporlar");
		jButton6.setMaximumSize(new Dimension(400, 400));
		jButton6.setMinimumSize(new Dimension(300, 300));
		jButton6.setPreferredSize(new Dimension(93, 100));
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setBackground(new Color(51, 102, 255));
		jButton7.setFont(new Font("Tahoma", 0, 35));
		jButton7.setIcon(new ImageIcon(getClass().getResource("/Resimler/yonetim.jpg")));
		jButton7.setText("Yönetim");
		jButton7.setHorizontalTextPosition(SwingConstants.LEFT);
		jButton7.setIconTextGap(-4);
		jButton7.setMaximumSize(new Dimension(400, 400));
		jButton7.setMinimumSize(new Dimension(300, 300));
		jButton7.setPreferredSize(new Dimension(93, 100));
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new Color(51, 102, 255));
		jButton8.setFont(new Font("Tahoma", 0, 35));
		jButton8.setIcon(new ImageIcon(getClass().getResource("/Resimler/gun_islemleri.jpg")));
		jButton8.setText("Gün Ýþlemleri");
		jButton8.setMaximumSize(new Dimension(400, 400));
		jButton8.setMinimumSize(new Dimension(300, 300));
		jButton8.setPreferredSize(new Dimension(93, 100));
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton2.setFont(new Font("Tahoma", 0, 35));
		jButton2.setIcon(new ImageIcon(Anasayfa.class.getResource("/Resimler/cikis.png")));
		jButton2.setMaximumSize(new Dimension(400, 400));
		jButton2.setMinimumSize(new Dimension(300, 300));
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel1.setBackground(new Color(255, 255, 255));
		jLabel1.setIcon(new ImageIcon(Anasayfa.class.getResource("/Resimler/utensils-solid.png")));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Anasayfa.class.getResource("/Resimler/gazilogo.png")));

		JLabel lblMustafaBurak = new JLabel("201816705 Musatafa Burak Y\u00FCcel");

		JLabel lblMehmetAli = new JLabel("201817004 Mehmet Ali Tahtac\u0131");

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(75)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
				.addGroup(layout.createSequentialGroup()
					.addGap(150)
					.addComponent(lblMustafaBurak)
					.addGap(107)
					.addComponent(lblNewLabel)
					.addGap(115)
					.addComponent(lblMehmetAli)
					.addContainerGap(641, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(88, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMehmetAli)
						.addComponent(lblNewLabel)
						.addComponent(lblMustafaBurak))
					.addGap(109))
		);
		getContentPane().setLayout(layout);

		pack();
	}

	private void jButton7ActionPerformed(ActionEvent evt) {
		Yonetim frame = new Yonetim();
		frame.setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(ActionEvent evt) {
		Masalar frame = new Masalar();
		frame.setVisible(true);
		this.setVisible(false);

	}

	private void jButton2ActionPerformed(ActionEvent evt) {
		KullaniciGirisi frame = new KullaniciGirisi();
		frame.setVisible(true);
		this.setVisible(false);

	}

	private void jButton6ActionPerformed(ActionEvent evt) {
		Urunler frame = new Urunler();
		frame.setVisible(true);
		this.setVisible(false);

	}

	private void jButton8ActionPerformed(ActionEvent evt) {
		GunIslemleri frame = new GunIslemleri();
		frame.setVisible(true);
		this.setVisible(false);

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
			Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Anasayfa().setVisible(true);

			}
		});
	}

	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton6;
	private JButton jButton7;
	private JButton jButton8;
	private JLabel jLabel1;
}
