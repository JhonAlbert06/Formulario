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
	private JCheckBox activo;
	private JTextField id, alias, nombres, email, costoxHora;
	private JPasswordField clave, confirmacionClave;

    public Ventana(){
        init();
    }

    private void init(){
        
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		add(panelPrincipal);

		JLabel id_ = new JLabel("ID ");
		id_.setBounds(10, 15, 20, 35);
		panelPrincipal.add(id_);
		id = new JTextField(10);
		id.setBounds(69, 25, 100, 20);
		panelPrincipal.add(id);

		ImageIcon icon = new ImageIcon("C:\\Users\\Jhony Alberto\\Documents\\Code\\Formulario\\icons8-search-24.png");
		busqueda = new JButton(icon);
		busqueda.setBounds(180, 25, 50, 20);
		panelPrincipal.add(busqueda);

		activo = new JCheckBox("Activo");
		activo.setBounds(400, 25, 100, 20);
		panelPrincipal.add(activo);

		JLabel nivel_ = new JLabel("Nivel");
		nivel_.setBounds(380, 60, 100, 25);
		panelPrincipal.add(nivel_);
		JMenu c = new JMenu("Administrador");
		
		c.setBounds(420, 60, 100, 25);
		panelPrincipal.add(c);

		JLabel alias_ = new JLabel("Alias ");
		alias_.setBounds(10, 60, 50, 35);
		panelPrincipal.add(alias_);
		alias = new JTextField(10);
		alias.setBounds(70, 70, 150, 20);
		panelPrincipal.add(alias);

		JLabel nombres_ = new JLabel("Nombres");
		nombres_.setBounds(10, 110, 100, 20);
		panelPrincipal.add(nombres_);
		nombres = new JTextField(10);
		nombres.setBounds(70, 110, 200, 20);
		panelPrincipal.add(nombres);

		JLabel email_ = new JLabel("Email ");
		email_.setBounds(300, 110, 100, 20);
		panelPrincipal.add(email_);
		email = new JTextField(10);
		email.setBounds(350, 110, 200, 20);
		panelPrincipal.add(email);
		
		JLabel clave_ = new JLabel("Clave ");
		clave_.setBounds(10, 160, 100, 20);
		panelPrincipal.add(clave_);
		clave = new JPasswordField(16);
		clave.setBounds(70, 160, 90, 20);
		panelPrincipal.add(clave);

		JLabel confirmacionClave_ = new JLabel("Confirma Clave ");
		confirmacionClave_.setBounds(170, 160, 100, 20);
		panelPrincipal.add(confirmacionClave_);
		confirmacionClave = new JPasswordField(16);
		confirmacionClave.setBounds(265, 160, 100, 20);
		panelPrincipal.add(confirmacionClave);

		JLabel costoXhora_ = new JLabel("Costo X Hora ");
		costoXhora_.setBounds(370, 160, 100, 20);
		panelPrincipal.add(costoXhora_);
		costoxHora = new JTextField(" ", 10);
		costoxHora.setBounds(450, 160, 100, 20);
		panelPrincipal.add(costoxHora);

		panelBotones = new JPanel();
		add(panelBotones, BorderLayout.SOUTH);

		ImageIcon icon1 = new ImageIcon("C:\\Users\\Jhony Alberto\\Documents\\Code\\Formulario\\icons8-new-24.png");
		btNuevo = new JButton("Nuevo", icon1);
		btNuevo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				//archivo = null;
			}
		});
		panelBotones.add(btNuevo);

		ImageIcon icon2 = new ImageIcon("C:\\Users\\Jhony Alberto\\Documents\\Code\\Formulario\\icons8-save-24.png");
		btGuardar = new JButton("Guardar", icon2);
		btGuardar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
			}
		});
		panelBotones.add(btGuardar);

		ImageIcon icon3 = new ImageIcon("C:\\Users\\Jhony Alberto\\Documents\\Code\\Formulario\\icons8-delete-24.png");
		btEliminar = new JButton("Eliminar", icon3);
		btEliminar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
			}
		});
		panelBotones.add(btEliminar);

        setSize(580, 300);
        setResizable(false);
		setTitle("Registros de Usuarios");
        setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

    }


	
}