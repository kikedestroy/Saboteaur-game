package ar.edu.unlu.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ar.edu.unlu.controlador.Controlador;
import ar.edu.unlu.controlador.Estado;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;

public class Ventana2 extends JFrame implements Observer{

	private JPanel contentPane;
	private JTable table;
	private Controlador controlador;
	private Estado estadoActual;
	
	/**
	 * Create the frame.
	 */
	public Ventana2() {
		controlador = new Controlador();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		//TABLEE 
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));

		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setRowHeight(50); //tamaño de ancho de la celda
		
		contentPane.add(table);
		controlador.mostrarEnTablaMatrizEntera(table);
		
		table.getSelectedRow(); //devuelve valor de la fila
		table.getSelectedColumn();//devuelve valor de la columna
		
		//TABLEE
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		
		JButton card1 = new JButton("");
		card1.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\1.png"));
		panel.add(card1);
		card1.setPreferredSize(new Dimension(35, 50));
		
		JButton card2 = new JButton("");
		card2.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\2.png"));
		panel.add(card2);
		card2.setPreferredSize(new Dimension(35, 50));
		
		JButton card3 = new JButton("");
		card3.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\3.png"));
		panel.add(card3);
		card3.setPreferredSize(new Dimension(35, 50));
		
		JButton card4 = new JButton("");
		card4.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\4.png"));
		panel.add(card4);
		card4.setPreferredSize(new Dimension(35, 50));
		
		JButton card5 = new JButton("");
		card5.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\5.png"));
		panel.add(card5);
		card5.setPreferredSize(new Dimension(35, 50));
		
		
		JButton card6 = new JButton("");
		card6.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\6.png"));
		panel.add(card6);
		card6.setPreferredSize(new Dimension(35, 50));
		
		
		JButton card7 = new JButton("");
		card7.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\7.png"));
		panel.add(card7);
		card7.setPreferredSize(new Dimension(35, 50));
		
		
		JButton card8 = new JButton("");
		card8.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\8.png"));
		panel.add(card8);
		card8.setPreferredSize(new Dimension(35, 50));
		
		
		JButton card9 = new JButton("");
		card9.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\9.png"));
		panel.add(card9);
		card9.setPreferredSize(new Dimension(35, 50));
		
		if (estadoActual == Estado.vistaCardHabilitada )
		controlador.mostrarCartasJugador(card1, card2, card3, card4, card5, card6);
		
	}

	@Override
	public void update(String message) {
		if (message == "obtenerCards") {
			estadoActual = Estado.vistaCardHabilitada;
		}
		
		
	}

}
