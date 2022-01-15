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

    private JPanel panelPrincipal;
	private JPanel panelBotones;

    private String archivo;
    private JButton btNuevo, btGuardar, btEliminar;
    private JMenuBar nivel;
	private JCheckBox activo;
	private JTextArea id, alias, nombres, email, clave, confirmacionClave, costoxHora;

    public Ventana(){
        init();
    }

    private void init(){

        panelPrincipal = new JPanel();
        add(panelPrincipal);
		panelPrincipal.setLayout(null);
		




		panelBotones = new JPanel();
		add(panelBotones, BorderLayout.SOUTH);

		btNuevo = new JButton("Nuevo");
		btNuevo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				archivo = null;
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

        setSize(600, 300);
        setResizable(false);
		setTitle("Registros de Usuarios");
        setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


	
}