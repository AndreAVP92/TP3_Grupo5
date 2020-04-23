package Ejercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = -980822024548498639L;
	private JTextField textFieldN3;
	private JTextField textFieldN2;
	private JTextField textFieldN1;
	private JTextField textFieldPro;
	private JTextField textFieldCond;
	private JComboBox CB;
	

	public Ventana2() {
		setBounds(200, 200, 537, 417);
		setTitle("Promedio");
		getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(63, 218, 282, 139);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textFieldPro = new JTextField();
		textFieldPro.setBounds(88, 40, 116, 22);
		panel_2.add(textFieldPro);
		textFieldPro.setColumns(10);
		
		textFieldCond = new JTextField();
		textFieldCond.setBounds(88, 75, 116, 22);
		panel_2.add(textFieldCond);
		textFieldCond.setColumns(10);
		
		JLabel lblPro = new JLabel("Promedio:");
		lblPro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPro.setBounds(20, 43, 66, 16);
		panel_2.add(lblPro);
		
		JLabel lblCond = new JLabel("Condicion");
		lblCond.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCond.setBounds(20, 78, 66, 16);
		panel_2.add(lblCond);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				/*
				 * textFieldN3;
	private JTextField textFieldN2;
	private JTextField textFieldN1;
				 * 
				 * 
				 * 
				 * || (textFieldN3. < 6)
				 * 
				 * */
				String item;
				item = CB.getSelectedItem().toString();
				
				if (item.equalsIgnoreCase("Desaprobado" )){
					
					textFieldCond.setText("LIBRE");}
					
				
			}
		});
		btnCalcular.setBounds(357, 80, 97, 38);
		getContentPane().add(btnCalcular);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnSalir.setBounds(357, 159, 97, 38);
		getContentPane().add(btnSalir);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				/// Limpiar cajas de texto
				
				textFieldN1.setText(null);
				textFieldN2.setText(null);
				textFieldN3.setText(null);
				textFieldPro.setText(null);
				textFieldCond.setText(null);
				
				// Limpiar combobox
			
				CB.setSelectedIndex(-1);
			}
		});
		btnNuevo.setBounds(357, 120, 97, 38);
		getContentPane().add(btnNuevo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(63, 29, 282, 168);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblN1 = new JLabel("Nota 1:");
		lblN1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblN1.setBounds(30, 38, 56, 16);
		panel_1.add(lblN1);
		
		JLabel lblN2 = new JLabel("Nota 2:");
		lblN2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblN2.setBounds(30, 67, 56, 16);
		panel_1.add(lblN2);
		
		JLabel lblN3 = new JLabel("Nota 3:");
		lblN3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblN3.setBounds(30, 96, 56, 16);
		panel_1.add(lblN3);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTPS.setBounds(30, 125, 56, 16);
		panel_1.add(lblTPS);
		
		CB = new JComboBox();
		CB.setBounds(98, 122, 117, 22);
		CB.addItem("Aprobado");
		CB.addItem("Desaprobado");
		panel_1.add(CB);
	
		
		
		textFieldN3 = new JTextField();
		textFieldN3.setBounds(98, 93, 117, 22);
		panel_1.add(textFieldN3);
		textFieldN3.setColumns(10);
		
		textFieldN2 = new JTextField();
		textFieldN2.setBounds(98, 64, 116, 22);
		panel_1.add(textFieldN2);
		textFieldN2.setColumns(10);
		
		textFieldN1 = new JTextField();
		textFieldN1.setBounds(99, 35, 116, 22);
		panel_1.add(textFieldN1);
		textFieldN1.setColumns(10);
		
		
	}
}
