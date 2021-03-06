package angsty_Butterflies;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * By Kyle Head
 * 
 * @author head1km
 * 
 */
public class newTestFrame {

	private JFrame frmAssignmentEditor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newTestFrame window = new newTestFrame();
					window.getFrmAssignmentEditor().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newTestFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmAssignmentEditor(new JFrame());
		getFrmAssignmentEditor().setTitle("Assignment Editor");
		getFrmAssignmentEditor().setBounds(100, 100, 450, 300);
		getFrmAssignmentEditor().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(
				getFrmAssignmentEditor().getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 438,
								Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 266,
								Short.MAX_VALUE).addContainerGap()));

		JLabel lblChooseWhatTo = new JLabel("Choose What to edit:");

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox box = (JComboBox) arg0.getSource();
				String c = "Course";
				String q = "Questions";
				if (box.getSelectedItem().equals(c)) {
					TestGradesheet.main(null);
					getFrmAssignmentEditor().setVisible(false);
				}
				if (box.getSelectedItem().equals(q)) {
					TestQuestion.main(null);
					getFrmAssignmentEditor().setVisible(false);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Assignment",
				"Course", "Question" }));

		JLabel lblAssignmentNumber = new JLabel("Assignment Number:");

		JLabel lblDateIssued = new JLabel("Date Issued:");

		JLabel lblDateDue = new JLabel("Date Due:");

		JLabel lblDescription = new JLabel("Description:");

		JTextPane txtpnAssignmentDescription = new JTextPane();
		txtpnAssignmentDescription.setText("Assignment description");

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "January",
				"Febuary", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" }));

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "1990",
				"1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
				"1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
				"2015" }));

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "January",
				"Febuary", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" }));

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "1990",
				"1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
				"1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
				"2015" }));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(53)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING, false)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		lblDescription)
																.addGap(18)
																.addComponent(
																		txtpnAssignmentDescription))
												.addComponent(
														lblAssignmentNumber)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		lblChooseWhatTo)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		comboBox,
																		GroupLayout.PREFERRED_SIZE,
																		131,
																		GroupLayout.PREFERRED_SIZE))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addComponent(
																						lblDateIssued)
																				.addComponent(
																						lblDateDue))
																.addGap(18)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										comboBox_4,
																										GroupLayout.PREFERRED_SIZE,
																										98,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										comboBox_5,
																										GroupLayout.PREFERRED_SIZE,
																										59,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										comboBox_6,
																										GroupLayout.PREFERRED_SIZE,
																										88,
																										GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										comboBox_1,
																										GroupLayout.PREFERRED_SIZE,
																										98,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										comboBox_2,
																										GroupLayout.PREFERRED_SIZE,
																										59,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										comboBox_3,
																										GroupLayout.PREFERRED_SIZE,
																										88,
																										GroupLayout.PREFERRED_SIZE)))))
								.addContainerGap(32, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(15)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblChooseWhatTo)
												.addComponent(
														comboBox,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblAssignmentNumber)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		lblDateIssued)
																.addGap(18)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.BASELINE)
																				.addComponent(
																						lblDateDue)
																				.addComponent(
																						comboBox_4,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						comboBox_5,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						comboBox_6,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														gl_panel.createParallelGroup(
																Alignment.BASELINE)
																.addComponent(
																		comboBox_1,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		comboBox_2,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		comboBox_3,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)))
								.addGap(18)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addComponent(lblDescription)
												.addComponent(
														txtpnAssignmentDescription,
														GroupLayout.PREFERRED_SIZE,
														62,
														GroupLayout.PREFERRED_SIZE))
								.addContainerGap(49, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		getFrmAssignmentEditor().getContentPane().setLayout(groupLayout);

	}

	public JFrame getFrmAssignmentEditor() {
		return frmAssignmentEditor;
	}

	public void setFrmAssignmentEditor(JFrame frmAssignmentEditor) {
		this.frmAssignmentEditor = frmAssignmentEditor;
	}
}