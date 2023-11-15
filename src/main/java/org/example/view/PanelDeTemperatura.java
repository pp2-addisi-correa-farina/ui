package org.example.view;

import org.pp2.Dispositivo;

import javax.swing.*;
import java.awt.*;

public class PanelDeTemperatura extends JPanel {

	private final JCheckBox checkBoxHabilitarHistorico;
	private final JButton btnGenerarReporte;

	public PanelDeTemperatura(Dispositivo dispositivo) {
		setBackground(UIManager.getColor("List.foreground"));
		setLayout(null);
		
		JLabel lblClimatotal = new JLabel("ClimaTotal");
		lblClimatotal.setForeground(Color.WHITE);
		lblClimatotal.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 40));
		lblClimatotal.setBounds(211, 24, 218, 48);
		add(lblClimatotal);

		checkBoxHabilitarHistorico = new JCheckBox("Habilitar historico");
		checkBoxHabilitarHistorico.setBackground(UIManager.getColor("List.foreground"));
		checkBoxHabilitarHistorico.setForeground(Color.WHITE);
		checkBoxHabilitarHistorico.setBounds(150, 100, 150, 30);
		checkBoxHabilitarHistorico.addActionListener(e -> updateButtonState());
		add(checkBoxHabilitarHistorico);

		btnGenerarReporte = new JButton("Generar reporte");
		btnGenerarReporte.setBounds(330, 100, 150, 30);
		btnGenerarReporte.setBackground(UIManager.getColor("List.foreground"));
		btnGenerarReporte.setForeground(UIManager.getColor("List.foreground"));
		btnGenerarReporte.setEnabled(false);
		add(btnGenerarReporte);

		JButton btnNewButton = new JButton("Encender");
		btnNewButton.setBackground(UIManager.getColor("List.foreground"));
		btnNewButton.setForeground(UIManager.getColor("List.foreground"));
		btnNewButton.setBounds(245, 259, 150, 29);
		add(btnNewButton);
		btnNewButton.addActionListener(e -> {
			System. out. println("Ejecutando encendido");
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

	private void updateButtonState() {
		btnGenerarReporte.setEnabled(checkBoxHabilitarHistorico.isSelected());
	}
}
