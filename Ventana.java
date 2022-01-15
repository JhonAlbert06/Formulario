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

        panelPrincipal = new JPanel();
		add(panelPrincipal);

		JLabel id_ = new JLabel("ID");
		id = new JTextField(10);
		add(id_);
		add(id);

		activo = new JCheckBox("Activo");
		add(activo);

		JLabel alias_ = new JLabel("Alias");
		add(alias_);
		alias = new JTextField(10);
		add(alias);

		JLabel nombres_ = new JLabel("Nombres");
		add(nombres_);
		nombres = new JTextField(10);
		add(nombres);

		JLabel email_ = new JLabel("Email");
		add(email_);
		email = new JTextField(10);
		add(email);
		
		JLabel clave_ = new JLabel("Clave");
		add(clave_);
		clave = new JPasswordField(16);
		add(clave);

		JLabel confirmacionClave_ = new JLabel("Confirma Clave");
		add(confirmacionClave_);
		confirmacionClave = new JPasswordField(16);
		add(confirmacionClave);

		JLabel costoXhora_ = new JLabel("Costo X Hora");
		add(costoXhora_);
		costoxHora = new JTextField(" ", 10);
		add(costoxHora);

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
		setLayout(null);

    }


	
}