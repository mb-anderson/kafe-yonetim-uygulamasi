package KafeUygulamasi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.Toolkit;

/**
 *
 * @author makaron
 */

public class Masalar extends AbstractFrame {

	private void masaacma(String masaadi) {
		UrunSiparisi frame = new UrunSiparisi(masaadi);
		frame.setVisible(true);
		this.dispose();
	}

	public Masalar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Masalar.class.getResource("/Resimler/gazilogo.png")));
		setTitle("Gazi Kafe");
		initComponents();
		this.setExtendedState(this.MAXIMIZED_BOTH);
	}

	private void initComponents() {

		Btnmasa2 = new JButton();
		jButton43 = new JButton();
		Btnmasa5 = new JButton();
		Btnmasa1 = new JButton();
		Btnmasa3 = new JButton();
		Btnmasa7 = new JButton();
		Btnmasa8 = new JButton();
		Btnmasa4 = new JButton();
		Btnmasa6 = new JButton();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		Btnmasa2.setBackground(new Color(204, 204, 204));
		Btnmasa2.setFont(new Font("Tahoma", 1, 24));
		Btnmasa2.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa2.setText("Masa 2");
		Btnmasa2.setIconTextGap(-135);
		Btnmasa2.setVerifyInputWhenFocusTarget(false);
		Btnmasa2.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa2MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa2MouseExited(evt);
			}
		});
		Btnmasa2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				Btnmasa2ActionPerformed(evt);
			}
		});

		jButton43.setForeground(new Color(255, 0, 0));
		jButton43.setText("Ana Menü");
		jButton43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton43ActionPerformed(evt);
			}
		});

		Btnmasa5.setBackground(new Color(204, 204, 204));
		Btnmasa5.setFont(new Font("Tahoma", 1, 24));
		Btnmasa5.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa5.setText("Masa 5");
		Btnmasa5.setIconTextGap(-135);
		Btnmasa5.setVerifyInputWhenFocusTarget(false);
		Btnmasa5.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa5MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa5MouseExited(evt);
			}
		});
		Btnmasa5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Btnmasa5ActionPerformed(evt);
			}
		});

		Btnmasa1.setBackground(new Color(204, 204, 204));
		Btnmasa1.setFont(new Font("Tahoma", 1, 24));
		Btnmasa1.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa1.setText("Masa 1");
		Btnmasa1.setIconTextGap(-135);
		Btnmasa1.setVerifyInputWhenFocusTarget(false);
		Btnmasa1.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa1MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa1MouseExited(evt);
			}
		});
		Btnmasa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Btnmasa1ActionPerformed(evt);
			}
		});

		Btnmasa3.setBackground(new Color(204, 204, 204));
		Btnmasa3.setFont(new Font("Tahoma", 1, 24));
		Btnmasa3.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa3.setText("Masa 3");
		Btnmasa3.setIconTextGap(-135);
		Btnmasa3.setVerifyInputWhenFocusTarget(false);
		Btnmasa3.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa3MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa3MouseExited(evt);
			}
		});
		Btnmasa3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Btnmasa3ActionPerformed(evt);
			}
		});

		Btnmasa7.setBackground(new Color(204, 204, 204));
		Btnmasa7.setFont(new Font("Tahoma", 1, 24));
		Btnmasa7.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa7.setText("Masa 7");
		Btnmasa7.setIconTextGap(-135);
		Btnmasa7.setVerifyInputWhenFocusTarget(false);
		Btnmasa7.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa7.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa7MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa7MouseExited(evt);
			}
		});
		Btnmasa7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Btnmasa7ActionPerformed(evt);
			}
		});

		Btnmasa8.setBackground(new Color(204, 204, 204));
		Btnmasa8.setFont(new Font("Tahoma", 1, 24));
		Btnmasa8.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa8.setText("Masa 8");
		Btnmasa8.setIconTextGap(-135);
		Btnmasa8.setVerifyInputWhenFocusTarget(false);
		Btnmasa8.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa8.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa8MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa8MouseExited(evt);
			}
		});
		Btnmasa8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Btnmasa8ActionPerformed(evt);
			}
		});

		Btnmasa4.setBackground(new Color(204, 204, 204));
		Btnmasa4.setFont(new Font("Tahoma", 1, 24));
		Btnmasa4.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa4.setText("Masa 4");
		Btnmasa4.setIconTextGap(-135);
		Btnmasa4.setVerifyInputWhenFocusTarget(false);
		Btnmasa4.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa4MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa4MouseExited(evt);
			}
		});
		Btnmasa4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Btnmasa4ActionPerformed(evt);
			}
		});

		Btnmasa6.setBackground(new Color(204, 204, 204));
		Btnmasa6.setFont(new Font("Tahoma", 1, 24));
		Btnmasa6.setIcon(new ImageIcon(getClass().getResource("/Resimler/masalar.png")));
		Btnmasa6.setText("Masa 6");
		Btnmasa6.setIconTextGap(-135);
		Btnmasa6.setVerifyInputWhenFocusTarget(false);
		Btnmasa6.setVerticalTextPosition(SwingConstants.BOTTOM);
		Btnmasa6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				Btnmasa6MouseEntered(evt);
			}

			public void mouseExited(MouseEvent evt) {
				Btnmasa6MouseExited(evt);
			}
		});
		Btnmasa6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Btnmasa6ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jButton43,
						GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
				.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGap(138, 138, 138)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(Btnmasa1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(Btnmasa5, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
						.addGap(54, 54, 54)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(Btnmasa2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(Btnmasa6, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(Btnmasa3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(Btnmasa7, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(Btnmasa4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(Btnmasa8, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(145, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap(38, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(Btnmasa1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Btnmasa2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Btnmasa4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Btnmasa3, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
				.addGap(50, 50, 50)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(Btnmasa5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Btnmasa7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Btnmasa8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Btnmasa6, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
				.addGap(53, 53, 53).addComponent(jButton43, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));

		pack();
	}

	private void Btnmasa2ActionPerformed(ActionEvent evt) {
		masaacma("Masa 2");

	}

	private void Btnmasa2MouseExited(MouseEvent evt) {
		Btnmasa2.setBackground(Color.LIGHT_GRAY);

	}

	private void Btnmasa2MouseEntered(MouseEvent evt) {
		Btnmasa2.setBackground(Color.GREEN);

	}

	private void jButton43ActionPerformed(ActionEvent evt) {
		Anasayfa frame = new Anasayfa();
		frame.setVisible(true);
		this.setVisible(false);
	}

	private void Btnmasa5MouseEntered(MouseEvent evt) {
		Btnmasa5.setBackground(Color.GREEN);
	}

	private void Btnmasa5MouseExited(MouseEvent evt) {
		Btnmasa5.setBackground(Color.LIGHT_GRAY);
	}

	private void Btnmasa5ActionPerformed(ActionEvent evt) {
		masaacma("Masa 5");
	}

	private void Btnmasa1MouseEntered(MouseEvent evt) {
		Btnmasa1.setBackground(Color.GREEN);
	}

	private void Btnmasa1MouseExited(MouseEvent evt) {
		Btnmasa1.setBackground(Color.LIGHT_GRAY);
	}

	private void Btnmasa1ActionPerformed(ActionEvent evt) {
		masaacma("Masa 1");

	}

	private void Btnmasa3MouseEntered(MouseEvent evt) {
		Btnmasa3.setBackground(Color.GREEN);
	}

	private void Btnmasa3MouseExited(MouseEvent evt) {
		Btnmasa3.setBackground(Color.LIGHT_GRAY);
	}

	private void Btnmasa3ActionPerformed(ActionEvent evt) {
		masaacma("Masa 3");
	}

	private void Btnmasa7MouseEntered(MouseEvent evt) {
		Btnmasa7.setBackground(Color.GREEN);
	}

	private void Btnmasa7MouseExited(MouseEvent evt) {
		Btnmasa7.setBackground(Color.LIGHT_GRAY);
	}

	private void Btnmasa7ActionPerformed(ActionEvent evt) {
		masaacma("Masa 7");
	}

	private void Btnmasa8MouseEntered(MouseEvent evt) {
		Btnmasa8.setBackground(Color.GREEN);
	}

	private void Btnmasa8MouseExited(MouseEvent evt) {
		Btnmasa8.setBackground(Color.LIGHT_GRAY);
	}

	private void Btnmasa8ActionPerformed(ActionEvent evt) {
		masaacma("Masa 8");
	}

	private void Btnmasa4MouseEntered(MouseEvent evt) {
		Btnmasa4.setBackground(Color.GREEN);
	}

	private void Btnmasa4MouseExited(MouseEvent evt) {
		Btnmasa4.setBackground(Color.LIGHT_GRAY);
	}

	private void Btnmasa4ActionPerformed(ActionEvent evt) {
		masaacma("Masa 4");
	}

	private void Btnmasa6MouseEntered(MouseEvent evt) {
		Btnmasa6.setBackground(Color.GREEN);
	}

	private void Btnmasa6MouseExited(MouseEvent evt) {
		Btnmasa6.setBackground(Color.LIGHT_GRAY);
	}

	private void Btnmasa6ActionPerformed(ActionEvent evt) {
		masaacma("Masa 6");
	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Masalar().setVisible(true);
			}
		});
	}

	private JButton Btnmasa1;
	private JButton Btnmasa2;
	private JButton Btnmasa3;
	private JButton Btnmasa4;
	private JButton Btnmasa5;
	private JButton Btnmasa6;
	private JButton Btnmasa7;
	private JButton Btnmasa8;
	private JButton jButton43;

}
