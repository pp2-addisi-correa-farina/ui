package org.example.view;

import org.pp2.Dispositivo;

import javax.swing.*;
import java.awt.*;

public class PanelDeTemperatura extends JPanel {

	public PanelDeTemperatura(Dispositivo dispositivo) {
		setBackground(UIManager.getColor("List.foreground"));
		setLayout(null);
		
		JLabel lblClimatotal = new JLabel("ClimaTotal");
		lblClimatotal.setForeground(Color.WHITE);
		lblClimatotal.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 40));
		lblClimatotal.setBounds(211, 24, 218, 48);
		add(lblClimatotal);

		JButton btnNewButton = new JButton("Encender");
		btnNewButton.setBackground(UIManager.getColor("List.foreground"));
		btnNewButton.setForeground(UIManager.getColor("List.foreground"));
		btnNewButton.setBounds(245, 259, 150, 29);
		add(btnNewButton);
		btnNewButton.addActionListener(e -> {
//			System. out. println("Ejecutando encendido");
			try {
				dispositivo.ejecutar("ENCENDER");
			} catch (RuntimeException ex) {
				JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		JLabel lblSamsungv = new JLabel("SamsungV6");
		lblSamsungv.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblSamsungv.setForeground(new Color(255, 255, 255));
		lblSamsungv.setBounds(245, 177, 150, 29);
		add(lblSamsungv);

	}

}
