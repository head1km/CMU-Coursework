/*
 * SimpleGUI
 * 
 * Author albee
 * TODO : Add your name
 * $Id$
 * 
 * Oct 4, 2011
 * 
 */
package cps240;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * TODO : Class documentation
 * @author albee
 * TODO : Add your name
 *
 * @version $Id$
 */
public class SimpleGUI {

	private JFrame frame;
	private JTextField score1_textField;
	private JTextField score2_textField;
	private JTextField score3_textField;
	private JTextField total_textField;
	private DataModel myData;

	/**
	 * Launch the application.
	 * TODO : Finish documentation
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUI window = new SimpleGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * TODO : Finish documentation
	 */
	public SimpleGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Create data model
		setMyData(new DataModel());
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblScore1 = new JLabel("Score 1");
		frame.getContentPane().add(lblScore1);
		
		setScore1_textField(new JTextField());
		getScore1_textField().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double newScore = getMyData().getScore1();
				try {
					newScore = Double.parseDouble(getScore1_textField().getText());
					getMyData().setScore1(newScore);
					getTotal_textField().setText(Double.toString(getMyData().total()));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		frame.getContentPane().add(getScore1_textField());
		getScore1_textField().setColumns(10);
		
		JLabel lblScore2 = new JLabel("Score 2");
		frame.getContentPane().add(lblScore2);
		
		// TODO : Refactor code to use getters and setters for score2_textField
		score2_textField = new JTextField();
		// TODO : Add action listener to update GUI when score2_textField changes.
		frame.getContentPane().add(score2_textField);
		score2_textField.setColumns(10);
		
		JLabel lblScore3 = new JLabel("Score 3");
		frame.getContentPane().add(lblScore3);
		
		// TODO : Refactor code to use getters and setters for score3_textField
		score3_textField = new JTextField();
		// TODO : Add action listener to update GUI when score3_textField changes.
		frame.getContentPane().add(score3_textField);
		score3_textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		frame.getContentPane().add(lblTotal);
		
		setTotal_textField(new JTextField());
		getTotal_textField().setEditable(false);
		frame.getContentPane().add(getTotal_textField());
		getTotal_textField().setColumns(10);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getScore1_textField(), score2_textField, score3_textField}));
	}

	/**
	 * TODO : Finish documentation
	 * @return the myData
	 */
	public DataModel getMyData() {
		return myData;
	}

	/**
	 * TODO : Finish documentation
	 * @param myData the myData to set
	 */
	public void setMyData(DataModel myData) {
		this.myData = myData;
	}

	/**
	 * TODO : Finish documentation
	 * @return the total_textField
	 */
	public JTextField getTotal_textField() {
		return total_textField;
	}

	/**
	 * TODO : Finish documentation
	 * @param total_textField the total_textField to set
	 */
	public void setTotal_textField(JTextField total_textField) {
		this.total_textField = total_textField;
	}

	/**
	 * TODO : Finish documentation
	 * @return the score1_textField
	 */
	public JTextField getScore1_textField() {
		return score1_textField;
	}

	/**
	 * TODO : Finish documentation
	 * @param score1_textField the score1_textField to set
	 */
	public void setScore1_textField(JTextField score1_textField) {
		this.score1_textField = score1_textField;
	}

	// TODO : Create getter for score2_textField
	// TODO : Create setter for score2_textField
	// TODO : Create getter for score3_textField
	// TODO : Create setter for score3_textField
}
