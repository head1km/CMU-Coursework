import java.util.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author khead90
 *
 */
public class AVLTreeDemo extends JFrame implements ActionListener {
	public AVLTree avlTree = new AVLTree();
	public JLabel cmdResultLabel;
	public JTextField cmdResultTextField;
	
	public JLabel cmdLabel;
	public JTextField cmdTextField;
	
	public AVLTreeDemo() {
		setTitle("AVL Trees");
		
		JPanel resultPanel = new JPanel(new GridLayout(1,2));
		cmdResultLabel = new JLabel("Command Result: ");
		cmdResultTextField = new JTextField();
		resultPanel.add(cmdResultLabel);
		resultPanel.add(cmdResultTextField);
		cmdResultTextField.setEditable(false);
		add(resultPanel, BorderLayout.NORTH);
		
		cmdLabel = new JLabel("Command: ");
		cmdTextField = new JTextField();
		JPanel cmdPanel = new JPanel(new GridLayout(1,2));
		cmdPanel.add(cmdLabel);
		cmdPanel.add(cmdTextField);
		cmdTextField.addActionListener(this);
		add(cmdPanel, BorderLayout.SOUTH);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
	
	JPanel view = null;
	
	public void actionPerformed(ActionEvent evt) {
		String cmdStr = cmdTextField.getText();
		Scanner sc = new Scanner(cmdStr);
		String cmd = sc.next();
		if (cmd.equals("add")) {
				int value = sc.nextInt();
				avlTree.add(value);
				if (view != null) remove(view);
				view = avlTree.getView();
				add(view);
				pack();
				validate();
				cmdResultTextField.setText(" ");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AVLTreeDemo atd = new AVLTreeDemo();

	}

}
