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
	private JButton btNuevo, btGuardar, btEliminar, busqueda;

	private JPanel panelPrincipal;
    private String archivoNombre;
    private JMenuBar nivel;
	private JCheckBox activo;
	private JTextField id, alias, nombres, email, costoxHora;
	private JPasswordField clave, confirmacionClave;

    public Ventana(){
        init();
    }

    private void init(){

		/*
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS)); 
		*/
        
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		add(panelPrincipal);

		JLabel id_ = new JLabel("ID ");
		id_.setBounds(10, 15, 20, 35);
		panelPrincipal.add(id_);
		id = new JTextField(10);
		id.setBounds(25, 25, 100, 20);
		panelPrincipal.add(id);

		busqueda = new JButton("Busqueda");
		busqueda.setBounds(130, 25, 50, 20);
		panelPrincipal.add(busqueda);

		activo = new JCheckBox("Activo");
		activo.setBounds(400, 25, 100, 20);
		panelPrincipal.add(activo);

		JLabel alias_ = new JLabel("Alias ");
		alias_.setBounds(10, 60, 50, 35);
		panelPrincipal.add(alias_);
		alias = new JTextField(10);
		alias.setBounds(70, 60, 100, 20);
		panelPrincipal.add(alias);

		JLabel nombres_ = new JLabel("Nombres ");
		panelPrincipal.add(nombres_);
		nombres = new JTextField(10);
		panelPrincipal.add(nombres);

		JLabel email_ = new JLabel("Email ");
		panelPrincipal.add(email_);
		email = new JTextField(10);
		panelPrincipal.add(email);
		
		JLabel clave_ = new JLabel("Clave ");
		panelPrincipal.add(clave_);
		clave = new JPasswordField(16);
		panelPrincipal.add(clave);

		JLabel confirmacionClave_ = new JLabel("Confirma Clave ");
		panelPrincipal.add(confirmacionClave_);
		confirmacionClave = new JPasswordField(16);
		panelPrincipal.add(confirmacionClave);

		JLabel costoXhora_ = new JLabel("Costo X Hora ");
		panelPrincipal.add(costoXhora_);
		costoxHora = new JTextField(" ", 10);
		panelPrincipal.add(costoxHora);

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

        setSize(600, 300);
        setResizable(false);
		setTitle("Registros de Usuarios");
        setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

    }


	
}