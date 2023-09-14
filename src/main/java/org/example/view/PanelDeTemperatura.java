package org.example.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		JButton btnNewButton = new JButton("Encender");
		btnNewButton.setBackground(UIManager.getColor("List.foreground"));
		btnNewButton.setForeground(UIManager.getColor("List.foreground"));
		btnNewButton.setBounds(245, 259, 150, 29);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System. out. println("Button Pressed!");
            	//Llamar al método para ejecutar comando del Core
            }
        });
		
		JLabel lblSamsungv = new JLabel("SamsungV6");
		lblSamsungv.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblSamsungv.setForeground(new Color(255, 255, 255));
		lblSamsungv.setBounds(245, 177, 150, 29);
		add(lblSamsungv);

	}
}
