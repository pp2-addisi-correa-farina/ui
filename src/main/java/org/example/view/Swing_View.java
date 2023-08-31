package org.example.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.example.view.panels.Switch;

public class Swing_View {

	private JFrame frame;
	private Switch switchTemp;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing_View window = new Swing_View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Swing_View() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		switchTemp = new Switch(frame);
		frame.getContentPane().add(switchTemp);
	}

}
