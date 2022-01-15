package Formulario;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ventana extends JFrame{

	private JPanel panelBotones;
	private JButton btNuevo, btGuardar, btEliminar;

	private JPanel panelIzquierdo, panelDerecho;
    private String archivoNombre;
    private JMenuBar nivel;
	private JCheckBox activo;
	private JTextField id, alias, nombres, email, costoxHora;
	private JPasswordField clave, confirmacionClave;

    public Ventana(){
        init();
    }

    private void init(){

        panelIzquierdo = new JPanel();
		add(panelIzquierdo, BorderLayout.WEST);

		panelDerecho = new JPanel();
		add(panelDerecho, BorderLayout.EAST);
		
		
		JLabel id_ = new JLabel("ID ");
		panelIzquierdo.add(id_);
		id = new JTextField("", 10);
		panelIzquierdo.add(id);

		activo = new JCheckBox("Activo");
		panelDerecho.add(activo);

		JLabel alias_ = new JLabel("Alias ");
		panelIzquierdo.add(alias_);
		alias = new JTextField("", 10);
		panelIzquierdo.add(alias);





		panelBotones = new JPanel();
		add(panelBotones, BorderLayout.SOUTH);

		btNuevo = new JButton("Nuevo");
		btNuevo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				//archivo = null;
			}
		});
		panelBotones.add(btNuevo);

		btGuardar = new JButton("Guardar");
		btGuardar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
			}
		});
		panelBotones.add(btGuardar);

		btEliminar = new JButton("Eliminar");
		btEliminar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
			}
		});
		panelBotones.add(btEliminar);

        setSize(700, 400);
        setResizable(false);
		setTitle("Registros de Usuarios");
        setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


	
}