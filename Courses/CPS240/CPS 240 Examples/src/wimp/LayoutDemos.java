/*
 * LayoutDemos
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Nov 17, 2011
 * 
 */
package wimp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

/**
 * @author albee
 *
 * @version $Id$
 */
public class LayoutDemos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutDemos window = new LayoutDemos();
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
	public LayoutDemos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_absolute = new JPanel();
		tabbedPane.addTab("Absolute", null, panel_absolute, null);
		panel_absolute.setLayout(null);
		
		JLabel absoluteLabel = new JLabel("Absolute Label");
		absoluteLabel.setBounds(60, 67, 221, 16);
		absoluteLabel.addMouseListener(NastyMouse.getNastyMouse());
		panel_absolute.add(absoluteLabel);
		
		JButton absoluteButton1 = new JButton("Absolute Button 1");
		absoluteButton1.addMouseListener(NastyMouse.getNastyMouse());
		absoluteButton1.setBounds(143, 106, 170, 29);
		panel_absolute.add(absoluteButton1);
		
		JButton absoluteButton2 = new JButton("Absolute Button 2");
		absoluteButton2.addMouseListener(NastyMouse.getNastyMouse());
		absoluteButton2.setBounds(369, 62, 221, 29);
		panel_absolute.add(absoluteButton2);
		
		JPanel panel_flow = new JPanel();
		tabbedPane.addTab("Flow", null, panel_flow, null);
		
		JLabel flowLabel = new JLabel("Flow Label");
		panel_flow.add(flowLabel);
		
		JButton flowButton1 = new JButton("Flow Button 1");
		panel_flow.add(flowButton1);
		
		JButton flowButton2 = new JButton("Flow Button 2");
		panel_flow.add(flowButton2);
		
		JPanel panel_border = new JPanel();
		tabbedPane.addTab("Border", null, panel_border, null);
		panel_border.setLayout(new BorderLayout(0, 0));
		
		JLabel borderLabel = new JLabel("Border Label");
		panel_border.add(borderLabel, BorderLayout.WEST);
		
		JButton borderButton1 = new JButton("Border Button 1");
		panel_border.add(borderButton1, BorderLayout.NORTH);
		
		JButton borderButton2 = new JButton("Border Button 2");
		panel_border.add(borderButton2, BorderLayout.EAST);
		
		JPanel panel_grid = new JPanel();
		tabbedPane.addTab("Grid", null, panel_grid, null);
		panel_grid.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel gridLabel = new JLabel("Grid Label");
		panel_grid.add(gridLabel);
		
		JButton gridButton1 = new JButton("Grid Button 1");
		panel_grid.add(gridButton1);
		
		JButton gridButton2 = new JButton("Grid Button 2");
		panel_grid.add(gridButton2);
		
		JPanel panel_gridbag = new JPanel();
		tabbedPane.addTab("GridBag", null, panel_gridbag, null);
		GridBagLayout gbl_panel_gridbag = new GridBagLayout();
		gbl_panel_gridbag.columnWidths = new int[]{0, 0, 0};
		gbl_panel_gridbag.rowHeights = new int[]{0, 0, 0};
		gbl_panel_gridbag.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_gridbag.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_gridbag.setLayout(gbl_panel_gridbag);
		
		JLabel gridbagLabel = new JLabel("Gridbag Label");
		GridBagConstraints gbc_gridbagLabel = new GridBagConstraints();
		gbc_gridbagLabel.insets = new Insets(0, 0, 5, 0);
		gbc_gridbagLabel.gridwidth = 2;
		gbc_gridbagLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_gridbagLabel.gridx = 0;
		gbc_gridbagLabel.gridy = 0;
		panel_gridbag.add(gridbagLabel, gbc_gridbagLabel);
		
		JButton gridbagButton1 = new JButton("Gridbag Button 1");
		GridBagConstraints gbc_gridbagButton1 = new GridBagConstraints();
		gbc_gridbagButton1.fill = GridBagConstraints.BOTH;
		gbc_gridbagButton1.weightx = 1.0;
		gbc_gridbagButton1.insets = new Insets(0, 0, 0, 5);
		gbc_gridbagButton1.gridx = 0;
		gbc_gridbagButton1.gridy = 1;
		panel_gridbag.add(gridbagButton1, gbc_gridbagButton1);
		
		JButton gridbagButton2 = new JButton("Gridbag Button 2");
		GridBagConstraints gbc_gridbagButton2 = new GridBagConstraints();
		gbc_gridbagButton2.fill = GridBagConstraints.BOTH;
		gbc_gridbagButton2.weightx = 2.0;
		gbc_gridbagButton2.gridx = 1;
		gbc_gridbagButton2.gridy = 1;
		panel_gridbag.add(gridbagButton2, gbc_gridbagButton2);
		
		JPanel panel_group = new JPanel();
		tabbedPane.addTab("Group", null, panel_group, null);
		
		JLabel groupLabel = new JLabel("Group Label");
		
		JButton groupButton2 = new JButton("Group Button 2");
		
		JButton groupButton1 = new JButton("Group Button 1");
		GroupLayout gl_panel_group = new GroupLayout(panel_group);
		gl_panel_group.setHorizontalGroup(
			gl_panel_group.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_group.createSequentialGroup()
					.addGroup(gl_panel_group.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_group.createSequentialGroup()
							.addGap(55)
							.addComponent(groupLabel)
							.addGap(55)
							.addComponent(groupButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_group.createSequentialGroup()
							.addGap(113)
							.addComponent(groupButton2)))
					.addGap(141))
		);
		gl_panel_group.setVerticalGroup(
			gl_panel_group.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_group.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_panel_group.createParallelGroup(Alignment.TRAILING)
						.addComponent(groupLabel)
						.addComponent(groupButton1))
					.addGap(18)
					.addComponent(groupButton2, GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
					.addGap(115))
		);
		panel_group.setLayout(gl_panel_group);
		
		JPanel panel_mig = new JPanel();
		tabbedPane.addTab("Mig", null, panel_mig, null);
		panel_mig.setLayout(new MigLayout("", "[][][][][]", "[][][][]"));
		
		JLabel migLabel = new JLabel("Mig Label");
		panel_mig.add(migLabel, "cell 0 0");
		
		JButton migButton1 = new JButton("Mig Button 1");
		panel_mig.add(migButton1, "cell 4 1,alignx left,growy");
		
		JButton migButton2 = new JButton("Mig Button 2");
		panel_mig.add(migButton2, "cell 4 3,alignx right,growy");
		
		JPanel panel_box = new JPanel();
		tabbedPane.addTab("Box", null, panel_box, null);
		panel_box.setLayout(new BoxLayout(panel_box, BoxLayout.Y_AXIS));
		
		JLabel boxLabel = new JLabel("Box Label");
		panel_box.add(boxLabel);
		
		JButton boxButton1 = new JButton("Box Button 1");
		panel_box.add(boxButton1);
		
		JButton boxButton2 = new JButton("Box Button 2");
		panel_box.add(boxButton2);
		
		JPanel panel_spring = new JPanel();
		tabbedPane.addTab("Spring", null, panel_spring, null);
		SpringLayout sl_panel_spring = new SpringLayout();
		panel_spring.setLayout(sl_panel_spring);
		
		JLabel springLabel = new JLabel("Spring Label");
		sl_panel_spring.putConstraint(SpringLayout.NORTH, springLabel, 97, SpringLayout.NORTH, panel_spring);
		sl_panel_spring.putConstraint(SpringLayout.WEST, springLabel, 55, SpringLayout.WEST, panel_spring);
		panel_spring.add(springLabel);
		
		JButton springButton1 = new JButton("Spring Button 1");
		sl_panel_spring.putConstraint(SpringLayout.NORTH, springButton1, 0, SpringLayout.NORTH, springLabel);
		sl_panel_spring.putConstraint(SpringLayout.WEST, springButton1, 37, SpringLayout.EAST, springLabel);
		panel_spring.add(springButton1);
		
		JButton springButton2 = new JButton("Spring Button 2");
		sl_panel_spring.putConstraint(SpringLayout.SOUTH, springButton2, -33, SpringLayout.SOUTH, panel_spring);
		sl_panel_spring.putConstraint(SpringLayout.EAST, springButton2, 0, SpringLayout.EAST, springButton1);
		panel_spring.add(springButton2);
		
		JPanel panel_form = new JPanel();
		tabbedPane.addTab("Form", null, panel_form, null);
		panel_form.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel formLabel = new JLabel("Form Label");
		panel_form.add(formLabel, "2, 2");
		
		JButton formButton1 = new JButton("Form Button 1");
		panel_form.add(formButton1, "4, 4");
		
		JButton formButton2 = new JButton("Form Button 2");
		panel_form.add(formButton2, "6, 6, default, fill");
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
	}
}
