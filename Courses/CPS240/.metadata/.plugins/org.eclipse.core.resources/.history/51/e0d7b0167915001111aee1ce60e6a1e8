package angsty_Butterflies;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * By Kyle Head
 * 
 * @author head1km
 * 
 */
public class TestGradesheet {

	private JFrame frmCourseEditor;
	private JTextField txtEnterName;
	private JTextField txtEnterTerm;
	JLabel lblCourseName;
	JLabel lblTerm;
	JLabel lblCrn;
	JFormattedTextField frmtdtxtfldEnterCrn;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenuItem mntmNew;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmUndo;
	private JMenuItem mntmCut;
	private JMenuItem mntmCopy;
	private JMenuItem mntmPaste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGradesheet window = new TestGradesheet();
					window.frmCourseEditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGradesheet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCourseEditor = new JFrame();
		frmCourseEditor.setTitle("Course Editor");
		frmCourseEditor.setBounds(100, 100, 450, 300);
		frmCourseEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblCourseName = new JLabel("Course Name:");

		txtEnterName = new JTextField();
		txtEnterName.setText("Enter Name");
		txtEnterName.setColumns(10);

		lblTerm = new JLabel("Term:");

		txtEnterTerm = new JTextField();
		txtEnterTerm.setText("Enter Term");
		txtEnterTerm.setColumns(10);

		lblCrn = new JLabel("CRN:");

		frmtdtxtfldEnterCrn = new JFormattedTextField();
		frmtdtxtfldEnterCrn.setText("Enter CRN");

		JLabel lblChooseWhatTo = new JLabel("Choose what to edit:");
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox box = (JComboBox) arg0.getSource();
				String a = "Assignment";
				String q = "Questions";
				if (box.getSelectedItem().equals(a)) {
					newTestFrame.main(null);
					frmCourseEditor.setVisible(false);
				}
				if (box.getSelectedItem().equals(q)) {
					TestQuestion.main(null);
					frmCourseEditor.setVisible(false);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Course",
				"Assignment", "Questions" }));
		GroupLayout groupLayout = new GroupLayout(
				frmCourseEditor.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addGap(60)
								.addComponent(lblChooseWhatTo)
								.addGap(5)
								.addComponent(comboBox,
										GroupLayout.PREFERRED_SIZE, 192,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addGap(102)
								.addComponent(lblCourseName)
								.addGap(5)
								.addComponent(txtEnterName,
										GroupLayout.PREFERRED_SIZE, 192,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addGap(154)
								.addComponent(lblTerm)
								.addGap(5)
								.addComponent(txtEnterTerm,
										GroupLayout.PREFERRED_SIZE, 192,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addGap(159)
								.addComponent(lblCrn)
								.addGap(5)
								.addComponent(frmtdtxtfldEnterCrn,
										GroupLayout.PREFERRED_SIZE, 192,
										GroupLayout.PREFERRED_SIZE)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(5)
																		.addComponent(
																				lblChooseWhatTo))
														.addComponent(
																comboBox,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(35)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(6)
																		.addComponent(
																				lblCourseName))
														.addComponent(
																txtEnterName,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(35)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(6)
																		.addComponent(
																				lblTerm))
														.addComponent(
																txtEnterTerm,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(35)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(6)
																		.addComponent(
																				lblCrn))
														.addComponent(
																frmtdtxtfldEnterCrn,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))));
		frmCourseEditor.getContentPane().setLayout(groupLayout);

		menuBar = new JMenuBar();
		frmCourseEditor.setJMenuBar(menuBar);

		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);

		mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);

		mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);

		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		mntmUndo = new JMenuItem("Undo");
		mnEdit.add(mntmUndo);

		mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);

		mntmCopy = new JMenuItem("Copy");
		mnEdit.add(mntmCopy);

		mntmPaste = new JMenuItem("Paste");
		mnEdit.add(mntmPaste);
	}

}