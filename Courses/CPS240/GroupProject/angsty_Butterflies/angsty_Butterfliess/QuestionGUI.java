package angsty_Butterfliess;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class QuestionGUI {
	
	QuestionFactory allQuestions = new QuestionFactory();

	private JFrame frame;
	private JTextField txtGradingItem;
	private JTextField txtTotalPoints;
	private JFormattedTextField formattedTextField;
	private JList list;
	private DefaultListModel model = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionGUI window = new QuestionGUI();
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
	public QuestionGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtGradingItem = new JTextField();
		txtGradingItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allQuestions.aQuestion.setDescription(txtGradingItem.getText());
			}
		});
		txtGradingItem.selectAll();
		txtGradingItem.setColumns(35);
		
		JButton btnAddNewGrading = new JButton("Add Grading Item to Rubric");
		btnAddNewGrading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddNewGrading.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				allQuestions.setQuestion(allQuestions.aQuestion.getDescription(), allQuestions.aQuestion.getPtsPossible());
				System.out.println(allQuestions.aQuestion.getDescription());
				if (model.firstElement() == "Add a Question") {
					model.set(0, allQuestions.aQuestion.getDescription());
				}
				else {
					addToList();
				}
				
				System.out.println("Question added to map");
			}
		});
		
		
		JLabel lblRubricQuestionsSelect = new JLabel("Rubric Questions: Select to Edit");
		
		JTextArea textArea = new JTextArea();
		
		txtTotalPoints = new JTextField();
		txtTotalPoints.setColumns(10);
		
		JLabel lblTotalPoints = new JLabel("Total Points");
		
		JLabel lblGradingItem = new JLabel("Grading Item:");
		
		JLabel lblPossiblePoints = new JLabel("Possible Points:");
		
		JLabel lblPossiblePoints_1 = new JLabel("Possible Points");
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allQuestions.aQuestion.setPtsPossible(Integer.parseInt(formattedTextField.getText()));
				
			}
		});
		
		JButton btnDeleteFromRubric = new JButton("Delete");
		
		list = new JList(model);
		model.addElement("Add a Question");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = list.getSelectedIndex();
				System.out.println(i);
				allQuestions.setQuestion((String) list.getSelectedValue(), 1);
				txtGradingItem.setText(allQuestions.aQuestion.getDescription());
				txtGradingItem.selectAll();
				formattedTextField.setText(Integer.toString(allQuestions.aQuestion.getPtsPossible()));
				formattedTextField.selectAll();
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblRubricQuestionsSelect)
											.addGap(179))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnDeleteFromRubric, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
											.addGap(132)
											.addComponent(lblTotalPoints)
											.addGap(18)))
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtTotalPoints)
										.addComponent(lblPossiblePoints_1, Alignment.LEADING)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGradingItem)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblPossiblePoints)))
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(formattedTextField, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
								.addComponent(txtGradingItem, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAddNewGrading, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGradingItem)
						.addComponent(txtGradingItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPossiblePoints)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddNewGrading)
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRubricQuestionsSelect)
						.addComponent(lblPossiblePoints_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTotalPoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTotalPoints)
						.addComponent(btnEdit)
						.addComponent(btnDeleteFromRubric))
					.addGap(7))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		
	}
	
	public void addToList() {
		model.addElement(allQuestions.aQuestion.getDescription());
	}
}
