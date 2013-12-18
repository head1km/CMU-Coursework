package angsty_Butterflies;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

/**
 * By Kyle Head
 * 
 * @author head1km
 * 
 */
public class TestQuestion {

	private JFrame frmQuestionEditor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestQuestion window = new TestQuestion();
					window.frmQuestionEditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestQuestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuestionEditor = new JFrame();
		frmQuestionEditor.setTitle("Question Editor");
		frmQuestionEditor.setBounds(100, 100, 450, 300);
		frmQuestionEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(
				frmQuestionEditor.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 441,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(47, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 266,
								Short.MAX_VALUE).addContainerGap()));

		JLabel lblWhatWouldYou = new JLabel("What would you like to edit:");

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox box = (JComboBox) e.getSource();
				String c = "Course";
				String a = "Assignment";
				if (box.getSelectedItem().equals(c)) {
					TestGradesheet.main(null);
					frmQuestionEditor.setVisible(false);
				}
				if (box.getSelectedItem().equals(a)) {
					newTestFrame.main(null);
					frmQuestionEditor.setVisible(false);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Questions",
				"Course", "Assignment" }));

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("0");

		JLabel label = new JLabel("/");

		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("0");

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "Pick a question:" }));

		JLabel lblSomethingDisplayingCurrent = new JLabel(
				"Something displaying current student");

		JTextPane txtpnEnterQuestionComments = new JTextPane();
		txtpnEnterQuestionComments.setText("Enter Question Comments");

		JLabel lblComments = new JLabel("Comments:");
		lblComments.setLabelFor(txtpnEnterQuestionComments);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(21)
								.addComponent(lblWhatWouldYou)
								.addGap(44)
								.addComponent(comboBox,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(69, Short.MAX_VALUE))
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(67)
								.addComponent(comboBox_1,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(formattedTextField,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED,
										GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(label)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(formattedTextField_1,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE).addGap(229))
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(56)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addComponent(
														lblSomethingDisplayingCurrent)
												.addComponent(lblComments)
												.addComponent(
														txtpnEnterQuestionComments,
														GroupLayout.PREFERRED_SIZE,
														366,
														GroupLayout.PREFERRED_SIZE))
								.addContainerGap(19, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblWhatWouldYou)
												.addComponent(
														comboBox,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(34)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														comboBox_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(label)
												.addComponent(
														formattedTextField,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														formattedTextField_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(26)
								.addComponent(lblComments)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtpnEnterQuestionComments,
										GroupLayout.PREFERRED_SIZE, 63,
										GroupLayout.PREFERRED_SIZE).addGap(18)
								.addComponent(lblSomethingDisplayingCurrent)
								.addContainerGap(26, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		frmQuestionEditor.getContentPane().setLayout(groupLayout);
	}
}