/*
 * SimpleGUI
 * 
 * Author albee
 * Kyle Head
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
 * This class initializes an instance of the SimpleGUI. It uses the java API
 * to create a user specified gui that will display three entered score values
 * and the total of all three values in an easy to use, user friendly 
 * environment. Included is the constructor for the class, a main method to 
 * start the program, a method that creates the gui, and the various setters 
 * and getters for the private variables.
 * @author albee
 * Kyle Head
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
	 * Launch the application. The main method launches the application by
	 * calling the invokelater method from the Java API. Then a try/catch block
	 * is used to create a new instance of the SimpleGUI window. If it fails an
	 * exception is then thrown. 
	 * 
	 * @param args	Not sure exactly what this is for but I know it is important.
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
	 * Create the application. SimpleGUI is the constructor for the SimpleGUI
	 * class. When called it will implement the application. 
	 *
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
					newScore=getMyData().getScore1();
				}
			}
		});
		frame.getContentPane().add(getScore1_textField());
		getScore1_textField().setColumns(10);
		
		JLabel lblScore2 = new JLabel("Score 2");
		frame.getContentPane().add(lblScore2);
		
		setScore2_textField(new JTextField());
		getScore2_textField().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double newScore = getMyData().getScore2();
				try {
					newScore = Double.parseDouble(getScore2_textField().getText());
					getMyData().setScore2(newScore);
					getTotal_textField().setText(Double.toString(getMyData().total()));
					
				} catch (Exception e) {
					newScore=getMyData().getScore2();
				}
			}
		});
		frame.getContentPane().add(score2_textField);
		score2_textField.setColumns(10);
		
		JLabel lblScore3 = new JLabel("Score 3");
		frame.getContentPane().add(lblScore3);
		
		setScore3_textField(new JTextField());
		getScore3_textField().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double newScore = getMyData().getScore3();
				try {
					newScore = Double.parseDouble(getScore3_textField().getText());
					getMyData().setScore3(newScore);
					getTotal_textField().setText(Double.toString(getMyData().total()));
					
				} catch (Exception e) {
					newScore=getMyData().getScore3();
				}
			}
		});
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
	 * getMyData is a getter for the myData variable. When called it will
	 * return myData
	 * @return the myData	The data from the DataModel class
	 */
	public DataModel getMyData() {
		return myData;
	}

	/**
	 * This is the setter for the DataModel data. When called it sets the data
	 * variable.
	 * @param myData the myData to set
	 */
	public void setMyData(DataModel myData) {
		this.myData = myData;
	}

	/**
	 * Gets the data for the textfield for the total 
	 * @return the total_textField the value to be entered in the total
	 * textfield
	 */
	public JTextField getTotal_textField() {
		return total_textField;
	}

	/**
	 * Sets a value in the total_textfield variable.
	 * @param total_textField the total_textField to set
	 */
	public void setTotal_textField(JTextField total_textField) {
		this.total_textField = total_textField;
	}

	/**
	 * Gets a value for the score1 field
	 * @return the score1_textField
	 */
	public JTextField getScore1_textField() {
		return score1_textField;
	}

	/**
	 * Sets a value in the score1_textField.
	 * @param score1_textField the score1_textField to set
	 */
	public void setScore1_textField(JTextField score1_textField) {
		this.score1_textField = score1_textField;
	}
	
	/**
	 * Gets a value for the score2 field
	 * @return the score2_textField
	 */
	public JTextField getScore2_textField() {
		return score2_textField;
	}

	/**
	 * Sets a value in the score2_textField.
	 * @param score2_textField the score2_textField to set
	 */
	public void setScore2_textField(JTextField score2_textField) {
		this.score2_textField = score2_textField;
	}
	
	/**
	 * Gets a value for the score3_textField field
	 * @return the score3_textField
	 */
	public JTextField getScore3_textField() {
		return score3_textField;
	}

	/**
	 * Sets a value in the score3_textField.
	 * @param score3_textField the score3_textField to set
	 */
	public void setScore3_textField(JTextField score3_textField) {
		this.score3_textField = score3_textField;
	}
}
