package Ejercicio1;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame{
	

	
	private static final long serialVersionUID = -359051714983070085L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public Ventana1() {
		setFont(new Font("Dialog", Font.BOLD, 80));
		setBounds(200, 200, 498, 380);
		setTitle("Contactos");
		getContentPane().setLayout(null);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(46, 76, 66, 14);
		getContentPane().add(lblApellido);
		
		textField = new JTextField();
		textField.setBounds(144, 73, 235, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(46, 129, 78, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(46, 31, 78, 14);
		getContentPane().add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 126, 235, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac");
		lblFechaNac.setBounds(46, 175, 78, 14);
		getContentPane().add(lblFechaNac);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 172, 235, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField_3.getText().length()==0) {
					
					textField_3.setBackground(Color.red);
					
				}else {
					
					textField_3.setBackground(Color.white);
			
				}
				if(textField.getText().length()==0) {
								
					textField.setBackground(Color.red);
					
				}else {
					
					textField.setBackground(Color.white);
			
				}
				if(textField_1.getText().length()==0) {
					
					textField_1.setBackground(Color.red);
					
				}else {
					
					textField_1.setBackground(Color.white);
				}
				if(textField_2.getText().length()==0) {
					
					textField_2.setBackground(Color.red);
					
				}else {
					
					textField_2.setBackground(Color.white);
				}
				
				
				JLabel label = new JLabel(textField_2.getText());
				label.setBounds(78, 293, 46, 14);
				getContentPane().add(label);
				
			}
		});
		
		
		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
		
				
					

				
			}
		});
		
		btnMostrar.setBounds(268, 240, 111, 33);
		getContentPane().add(btnMostrar);
		
		JLabel lblLosDatosIngresados = new JLabel("Los datos ingresados fueron:");
		lblLosDatosIngresados.setBounds(10, 249, 158, 14);
		getContentPane().add(lblLosDatosIngresados);
		
		textField_3 = new JTextField();
		textField_3.setBounds(144, 28, 235, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		
	
		String letra = "a";

		JTextField texto = new JTextField("Hola");

		String contenido = texto.getText();

		contenido = contenido + " " +  letra;

		texto.setText(contenido);
		
		
		
		
	}

	
}



