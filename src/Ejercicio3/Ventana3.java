package Ejercicio3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana3 extends JFrame {

	private static final long serialVersionUID = -6044761850335280629L;
	
	private JPanel contentPane;
	private JTextField txtHoras;
	private final ButtonGroup btg1 = new ButtonGroup();

	public Ventana3() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(200, 200, 505, 420);
		setTitle("Selección múltiple");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo:");
		lblElijeUnSistema.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblElijeUnSistema.setBounds(25, 16, 229, 36);
		contentPane.add(lblElijeUnSistema);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		btg1.add(rdbtnWindows);
		rdbtnWindows.setBounds(25, 57, 103, 29);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("MAC");
		btg1.add(rdbtnMac);
		rdbtnMac.setBounds(138, 57, 84, 29);
		contentPane.add(rdbtnMac);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Linux");
		btg1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(227, 57, 103, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad:");
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblElijeUnaEspecialidad.setBounds(25, 101, 197, 20);
		contentPane.add(lblElijeUnaEspecialidad);
		
		JCheckBox chProgramacion = new JCheckBox("Programaci\u00F3n");
		chProgramacion.setBounds(35, 133, 139, 29);
		contentPane.add(chProgramacion);
		
		JCheckBox chAdmin = new JCheckBox("Administraci\u00F3n");
		chAdmin.setBounds(35, 170, 139, 29);
		contentPane.add(chAdmin);
		
		JCheckBox chDiseño = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chDiseño.setBounds(35, 207, 139, 29);
		contentPane.add(chDiseño);
		
		JLabel lblCantidad = new JLabel("Cantidad de horas en el ordenador:");
		lblCantidad.setBounds(25, 272, 260, 20);
		contentPane.add(lblCantidad);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(294, 269, 131, 26);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sistema = null, op1 = "",op2 = "",op3 = "";
				if(rdbtnWindows.isSelected()) sistema="Windows";
				if(rdbtnMac.isSelected()) sistema="MAC";
				if(rdbtnNewRadioButton.isSelected()) sistema="Linux";
				
				if(chProgramacion.isSelected()) op1 = "Programación - ";
				if(chAdmin.isSelected()) op2 = "Administración - ";
				if(chDiseño.isSelected()) op3 = "Diseño Gráfico - ";
				
				JOptionPane.showMessageDialog(null,sistema+" - "+op1+op2+op3+txtHoras.getText());
			}
		});
		btnAceptar.setBounds(304, 311, 115, 29);
		contentPane.add(btnAceptar);
	}
}
