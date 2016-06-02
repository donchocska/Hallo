import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form extends JFrame {

	JPanel panel = new JPanel();
	JButton button = new JButton("Hallo");
	JTextField text = new JTextField();

	public Form() {

		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(panel);
		panel.setLayout(null);
		button.setLocation(188, 170);
		panel.add(button);
		button.setSize(new Dimension(94, 25));
		text.setLocation(188, 124);

		panel.add(text);
		text.setSize(new Dimension(94, 22));

		button.addActionListener(new ActionListener() {
			String item = text.getText();

			@Override
			public void actionPerformed(ActionEvent e) {
				{
					JOptionPane.showMessageDialog(null, "Hi my name is " + Text("") + " ;)");
					Clear();
				}
			}
		});
	}

	private String Text(String s) {

		String txt = text.getText();
		return txt;
	}

	private void Clear() {
		text.setText(null);
	}
}
