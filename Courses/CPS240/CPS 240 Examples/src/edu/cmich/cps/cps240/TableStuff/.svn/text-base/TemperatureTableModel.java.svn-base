/*
 * TemperatureTableModel
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Nov 10, 2011
 * 
 */
package edu.cmich.cps.cps240.TableStuff;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * @author albee
 *
 * @version $Id$
 */
public class TemperatureTableModel implements TableModel {
	private String[] rooms = {"PE 122", "PE 107", "PE 126"};
	private Integer[] temperature = {65, 85, 76};
	private String[] columnName= {"Room", "Heat"};
	private Class<?>[]  columnTypes = {String.class, Integer.class};
	private ArrayList<TableModelListener> listeners = new ArrayList<TableModelListener>();
	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#addTableModelListener(javax.swing.event.TableModelListener)
	 */
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		if(!listeners.contains(arg0)){
			listeners.add(arg0);
		}
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnClass(int)
	 */
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return columnTypes[columnIndex];
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnName(int)
	 */
	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return columnName[columnIndex];
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return rooms.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if (columnIndex == 0){
			return rooms[rowIndex];
		}
		return temperature[rowIndex];
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#isCellEditable(int, int)
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex == 1;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#removeTableModelListener(javax.swing.event.TableModelListener)
	 */
	@Override
	public void removeTableModelListener(TableModelListener l) {
		if(listeners.contains(l)){
			listeners.remove(l);
		}
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#setValueAt(java.lang.Object, int, int)
	 */
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if(columnIndex == 1){
			System.out.println(columnTypes[columnIndex]);
//			temperature[rowIndex] = columnTypes[columnIndex].cast(aValue);
		}
		notify_listeners();
	}
	
	private void notify_listeners() {
		TableModelEvent evt = new TableModelEvent(this);
		 for (TableModelListener tableModelListener : listeners){
			tableModelListener.tableChanged(evt);
		}

	}

}
