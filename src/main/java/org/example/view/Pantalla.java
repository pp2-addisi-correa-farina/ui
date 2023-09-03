package org.example.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Pantalla {

	private JFrame frame;
	private PanelDeTemperatura switchTemp;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		switchTemp = new PanelDeTemperatura(frame);
		frame.getContentPane().add(switchTemp);
	}

}
