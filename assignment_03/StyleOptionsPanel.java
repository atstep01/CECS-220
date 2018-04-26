package assignment_03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class StyleOptionsPanel extends JPanel
{
	private JLabel	saying, inputLabel;
	private JCheckBox	bold, italic;
	private JTextField	fontSize;
	private int size = 36;

	public StyleOptionsPanel()
	{
		saying = new JLabel("Say it with style!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
		inputLabel = new JLabel("Enter the font size");
		fontSize = new JTextField(5);
		fontSize.addActionListener(new FontSizeListener());

		bold = new JCheckBox("Bold");
		bold.setBackground(Color.red);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.red);

		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);

		add(saying);
		add(bold);
		add(italic);
		add(inputLabel);
		add(fontSize);

		setBackground(Color.red);
		setPreferredSize(new Dimension(300, 300));
	}

	private class StyleListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			int style = Font.PLAIN;

			if (bold.isSelected())
				style += Font.BOLD;

			if (italic.isSelected())
				style += Font.ITALIC;

			saying.setFont(new Font("Helvetica", style, size));
		}
	}
	
	private class FontSizeListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String text = fontSize.getText();
			size = Integer.parseInt(text);
			saying.setFont(new Font("Helvetica", Font.PLAIN, size));
		}
	}
	
}
