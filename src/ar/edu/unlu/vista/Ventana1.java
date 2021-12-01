	package ar.edu.unlu.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.Text;

import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import ar.edu.unlu.controlador.Controlador;
import ar.edu.unlu.controlador.Estado;
import ar.edu.unlu.controlador.Observable;
import net.miginfocom.swing.MigLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Ventana1 extends JFrame implements Observer{

	private JPanel contentPane;
	private Controlador controlador;

	// atributos Jframe para mostrar jugadores
	private JTextPane textPane;
	private JButton btn_verpj;
	
	



	public Ventana1() {
		
		controlador = new Controlador();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\icons\\Title (1).jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JButton btn_agregarpj = new JButton("Agregar Jugadores");
		
		textPane = new JTextPane();
		
		btn_verpj = new JButton("Ver Jugadores");
		

		
		
		JButton btn_jugar = new JButton("¡ JUGAR !");
		btn_jugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2 ventanaJuego = new Ventana2();
				ventanaJuego.setVisible(true);
			}
		});
		JLabel lbl_nombrePJ1 = new JLabel("Nombre de jugador 1 :");
		JTextField txt_in_PJ1 = new JTextField();
		JLabel lbl_nombrePJ2 = new JLabel("Nombre de jugador 2 :");
		JTextField txt_in_PJ2 = new JTextField();
		JLabel lbl_nombrePJ3 = new JLabel("Nombre de jugador 3 :");
		JTextField txt_in_PJ3 = new JTextField();
		JButton btnOK = new JButton("OK");
		JLabel lbl_LISTO = new JLabel("LISTO !");
		JButton btn_volverAtras = new JButton("Volver atras");
		
		
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.agregarJugador(txt_in_PJ1,txt_in_PJ2,txt_in_PJ3,lbl_LISTO);	
				
			}
		});
		
		
		btn_agregarpj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_agregarpj.setVisible(false);
				btn_verpj.setVisible(false);
				btn_jugar.setVisible(false);
				
				lbl_nombrePJ1.setVisible(true);
				txt_in_PJ1.setVisible(true);
				
				lbl_nombrePJ2.setVisible(true);
				txt_in_PJ2.setVisible(true);
				
				lbl_nombrePJ3.setVisible(true);
				txt_in_PJ3.setVisible(true);
				
				btnOK.setVisible(true);
				btn_volverAtras.setVisible(true);
			}
		});
		btn_agregarpj.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btn_agregarpj);
		
		
		btn_verpj.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btn_verpj);
		
		
		btn_jugar.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btn_jugar);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		panel_2.add(lbl_nombrePJ1);
		lbl_nombrePJ1.setVisible(false);
		
		
		panel_2.add(txt_in_PJ1);
		txt_in_PJ1.setColumns(10);
		txt_in_PJ1.setVisible(false);
		
		
		panel_2.add(lbl_nombrePJ2);
		lbl_nombrePJ2.setVisible(false);
		
		panel_2.add(txt_in_PJ2);
		txt_in_PJ2.setColumns(10);
		txt_in_PJ2.setVisible(false);
		
		
		panel_2.add(lbl_nombrePJ3);
		lbl_nombrePJ3.setVisible(false);
		
		panel_2.add(txt_in_PJ3);
		txt_in_PJ3.setColumns(10);
		txt_in_PJ3.setVisible(false);
		
		
		panel_2.add(btnOK);
		
		
		btn_volverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_agregarpj.setVisible(true);
				btn_verpj.setVisible(true);
				btn_jugar.setVisible(true);
				lbl_nombrePJ1.setVisible(false);
				lbl_nombrePJ2.setVisible(false);
				lbl_nombrePJ3.setVisible(false);
				txt_in_PJ1.setVisible(false);
				txt_in_PJ2.setVisible(false);
				txt_in_PJ3.setVisible(false);
				btnOK.setVisible(false);
				btn_volverAtras.setVisible(false);
				lbl_LISTO.setVisible(false);
				
			}
		});
		panel_2.add(btn_volverAtras);
		
		
		panel_2.add(lbl_LISTO);
		lbl_LISTO.setVisible(false);
		
		
		contentPane.add(textPane, BorderLayout.SOUTH);
	}

	@Override
	public void update(String message) {
		
		if (message == "addPJs") {
			btn_verpj.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					controlador.mostrarJugadores(textPane);
					
				}
			});
			
		}
		
	}





	
	}
		


