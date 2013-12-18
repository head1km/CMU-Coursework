/*
 * ValidatingButtonHandler
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Nov 15, 2011
 * 
 */
package edu.cmich.cps.cps240.TableStuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

/**
 * @author albee
 *
 * @version $Id$
 */
public class ValidatingButtonHandler implements ActionListener, FocusListener {
	private JTextField myField;
	private String previous;
	
	
	/**
	 * @param myField
	 */
	public ValidatingButtonHandler(JTextField myField) {
		super();
		this.myField = myField;
		this.previous = myField.getText();
		this.myField.addActionListener(this);
		this.myField.addFocusListener(this);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.FocusListener#focusGained(java.awt.event.FocusEvent)
	 */
	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		this.myField.selectAll();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.FocusListener#focusLost(java.awt.event.FocusEvent)
	 */
	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		String current = this.myField.getText();
		if (current.equalsIgnoreCase("Snarf")){
			this.myField.setText(previous);
		}
		previous = current;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String current = this.myField.getText();
		if (current.equalsIgnoreCase("Snarf")){
			this.myField.setText(previous);
		}
		previous = current;
	}

}
