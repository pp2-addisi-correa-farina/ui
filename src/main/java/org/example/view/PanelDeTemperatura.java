package org.example.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PanelDeTemperatura extends JPanel {

	public PanelDeTemperatura(JFrame frame) {
		setBackground(UIManager.getColor("List.foreground"));
		setLayout(null);

		JLabel lblClimatotal = new JLabel("ClimaTotal");
		lblClimatotal.setForeground(Color.WHITE);
		lblClimatotal.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 40));
		lblClimatotal.setBounds(211, 24, 218, 48);
		add(lblClimatotal);

		JButton btnNewButton = new JButton("Establecer temperatura");
		btnNewButton.setBackground(UIManager.getColor("List.foreground"));
		btnNewButton.setForeground(UIManager.getColor("List.foreground"));
		btnNewButton.setBounds(211, 295, 218, 25);
		add(btnNewButton);

		JSlider slider = new JSlider();
		slider.setBackground(UIManager.getColor("List.foreground"));
		slider.setBounds(220, 177, 200, 16);
		add(slider);

	}
}
