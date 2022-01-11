package programa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;

public class UI1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI1 frame = new UI1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI1() {
		setBackground(Color.DARK_GRAY);
		setForeground(new Color(72, 209, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(UIManager.getBorder("Tree.editorBorder"));
		setContentPane(contentPane);
		FlowLayout fl_contentPane = new FlowLayout(FlowLayout.CENTER, 5, 5);
		fl_contentPane.setAlignOnBaseline(true);
		contentPane.setLayout(fl_contentPane);
	}

}
