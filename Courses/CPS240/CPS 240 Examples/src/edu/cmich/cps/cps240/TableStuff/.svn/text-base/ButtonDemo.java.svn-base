/*
 * ButtonDemo
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Nov 15, 2011
 * 
 */
package edu.cmich.cps.cps240.TableStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Time;
import javax.swing.JTextField;
import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;


/**
 * @author albee
 *
 * @version $Id$
 */
public class ButtonDemo implements ActionListener{
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton button = (JButton) arg0.getSource();
			Time time = new Time(arg0.getWhen());
			System.err.println(button.getActionCommand() + " at " + time);
		}

	

	private JFrame frame;
	private JTextField textField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonDemo window = new ButtonDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ButtonDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton moeButton = new JButton("Moe");
		moeButton.addActionListener(this);
		GridBagConstraints gbc_moeButton = new GridBagConstraints();
		gbc_moeButton.gridwidth = 2;
		gbc_moeButton.fill = GridBagConstraints.BOTH;
		gbc_moeButton.weightx = 0.5;
		gbc_moeButton.insets = new Insets(0, 0, 5, 5);
		gbc_moeButton.gridx = 0;
		gbc_moeButton.gridy = 0;
		frame.getContentPane().add(moeButton, gbc_moeButton);
		
		JButton larryButton = new JButton("Larry");
		larryButton.setAction(action);
		larryButton.addActionListener(this);
		GridBagConstraints gbc_larryButton = new GridBagConstraints();
		gbc_larryButton.gridwidth = 2;
		gbc_larryButton.fill = GridBagConstraints.BOTH;
		gbc_larryButton.insets = new Insets(0, 0, 5, 0);
		gbc_larryButton.gridx = 1;
		gbc_larryButton.gridy = 1;
		frame.getContentPane().add(larryButton, gbc_larryButton);
		
		JButton curleyButton = new JButton("Curley Joe");
		curleyButton.addActionListener(this);
		GridBagConstraints gbc_curleyButton = new GridBagConstraints();
		gbc_curleyButton.insets = new Insets(0, 0, 5, 0);
		gbc_curleyButton.fill = GridBagConstraints.BOTH;
		gbc_curleyButton.weightx = 1.0;
		gbc_curleyButton.gridx = 2;
		gbc_curleyButton.gridy = 2;
		frame.getContentPane().add(curleyButton, gbc_curleyButton);
		
		textField = new JTextField();
		new ValidatingButtonHandler(textField);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		frame.getContentPane().add(textField, gbc_textField);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
