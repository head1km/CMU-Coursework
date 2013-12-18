/*
 * EditStuff
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Nov 10, 2011
 * 
 */
package edu.cmich.cps.cps240.TableStuff;

import javax.swing.JApplet;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 * @author albee
 *
 * @version $Id$
 */
public class EditStuff extends JApplet {
	private JTable table;

	/**
	 * Create the applet.
	 */
	public EditStuff() {
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		TemperatureTableModel table_model = new TemperatureTableModel();
		table = new JTable(table_model);
		scrollPane.setViewportView(table);
		table_model.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getSource());
			}
		});
	}

}
