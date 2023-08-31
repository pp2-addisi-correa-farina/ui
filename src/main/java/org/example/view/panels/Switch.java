package org.example.view.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Switch extends JPanel {

	public Switch(JFrame frame) {
		setLayout(null);

		JLabel lblClimatotal = new JLabel("ClimaTotal");
		lblClimatotal.setBounds(189, 42, 83, 15);
		add(lblClimatotal);

		JButton btnNewButton = new JButton("Establecer temperatura");
		btnNewButton.setBounds(135, 160, 218, 25);
		add(btnNewButton);

		JSlider slider = new JSlider();
		slider.setBounds(135, 114, 200, 16);
		add(slider);

	}
}
