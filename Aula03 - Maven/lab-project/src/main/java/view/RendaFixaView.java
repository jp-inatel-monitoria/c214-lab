package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controller.ArquivoController;
import controller.CarteiraController;
import model.arquivos.ArquivoContexto;
import model.arquivos.ArquivoStrategy;
import model.arquivos.CsvStrategy;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RendaFixaView {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfPreco;
	private JTextField tfQuantidade;
	private JTextField tfData;
	private JTextField tfRendimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RendaFixaView window = new RendaFixaView();
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
	public RendaFixaView() {
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

		JMenuItem mntmNewMenuItem = new JMenuItem("Renda Fixa");
		jmMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Renda Variavel");
		jmMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sair");
		jmMenu.add(mntmNewMenuItem_2);

		JMenu jmFile = new JMenu("Arquivo");
		menuBar.add(jmFile);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("JSON");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArquivoController.gerar();
			}
		});
		jmFile.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("CSV");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArquivoController.getArquivo().setArquivoStrategy(new CsvStrategy());
				ArquivoController.gerar();
			}
		});
		jmFile.add(mntmNewMenuItem_4);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Renda Fixa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 112, 20);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 42, 46, 14);
		frame.getContentPane().add(lblNome);

		tfNome = new JTextField();
		tfNome.setBounds(10, 60, 112, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);

		JLabel lblPreco = new JLabel("Pre\u00E7o");
		lblPreco.setBounds(10, 91, 46, 14);
		frame.getContentPane().add(lblPreco);

		tfPreco = new JTextField();
		tfPreco.setBounds(10, 109, 112, 20);
		frame.getContentPane().add(tfPreco);
		tfPreco.setColumns(10);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(10, 140, 70, 14);
		frame.getContentPane().add(lblQuantidade);

		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(10, 163, 112, 20);
		frame.getContentPane().add(tfQuantidade);
		tfQuantidade.setColumns(10);

		JLabel lblData = new JLabel("Data Vencimento");
		lblData.setBounds(177, 42, 91, 14);
		frame.getContentPane().add(lblData);

		tfData = new JTextField();
		tfData.setBounds(177, 60, 112, 20);
		frame.getContentPane().add(tfData);
		tfData.setColumns(10);

		JLabel lblRendimento = new JLabel("Rendimento");
		lblRendimento.setBounds(177, 91, 70, 14);
		frame.getContentPane().add(lblRendimento);

		tfRendimento = new JTextField();
		tfRendimento.setBounds(177, 109, 112, 20);
		frame.getContentPane().add(tfRendimento);
		tfRendimento.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarteiraController.criarRendaFixa(tfNome.getText(), Double.parseDouble(tfPreco.getText()),
						Double.parseDouble(tfQuantidade.getText()), tfData.getText(), Double.parseDouble(tfRendimento.getText()));
				JOptionPane.showMessageDialog(null, "Renda fixa criada com sucesso!");
				limparCampos();
			}
		});
		btnSalvar.setBounds(177, 162, 89, 23);
		frame.getContentPane().add(btnSalvar);
	}
	
	private void limparCampos() {
		tfNome.setText("");
		tfPreco.setText("");
		tfQuantidade.setText("");
		tfData.setText("");
		tfRendimento.setText("");
	}

}
