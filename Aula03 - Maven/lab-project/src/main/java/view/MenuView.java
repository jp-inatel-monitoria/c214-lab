package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;

import controller.CarteiraController;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MenuView {

	private JFrame frame;
	private JTextField tfNomeCorretora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView window = new MenuView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu jmMenu = new JMenu("Menu");
		menuBar.add(jmMenu);

		JMenuItem jmiRendaFixa = new JMenuItem("Renda Fixa");
		jmiRendaFixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CarteiraController.getCarteira() != null) {
					frame.dispose();
					RendaFixaView rendaFixaView = new RendaFixaView();
					rendaFixaView.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "Carteira não criada");
				}
			}
		});
		jmMenu.add(jmiRendaFixa);

		JMenuItem jmiRendaVariavel = new JMenuItem("Renda Variavel");
		jmMenu.add(jmiRendaVariavel);

		JMenuItem jmiSair = new JMenuItem("Sair");
		jmMenu.add(jmiSair);

		JMenu jmFile = new JMenu("Arquivo");
		menuBar.add(jmFile);

		JMenuItem jmiJSON = new JMenuItem("JSON");
		jmFile.add(jmiJSON);

		JMenuItem jmiCSV = new JMenuItem("CSV");
		jmFile.add(jmiCSV);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Carteira de Investimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 181, 24);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblCorretora = new JLabel("Nome da Corretora");
		lblCorretora.setBounds(10, 46, 169, 14);
		frame.getContentPane().add(lblCorretora);

		tfNomeCorretora = new JTextField();
		tfNomeCorretora.setBounds(10, 64, 181, 20);
		frame.getContentPane().add(tfNomeCorretora);
		tfNomeCorretora.setColumns(10);

		JButton btnNewButton = new JButton("Criar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarteiraController.criarCarteira(tfNomeCorretora.getText());
				JOptionPane.showMessageDialog(null, "Carteira da " + tfNomeCorretora.getText() + " criada");
				limparCampos();
			}
		});

		btnNewButton.setBounds(10, 115, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	private void limparCampos() {
		tfNomeCorretora.setText("");
	}

}
