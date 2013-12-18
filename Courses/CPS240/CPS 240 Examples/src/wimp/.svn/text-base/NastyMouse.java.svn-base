/*
 * NastyMouse
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Nov 17, 2011
 * 
 */
package wimp;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;

/**
 * @author albee
 *
 * @version $Id$
 */
final class NastyMouse extends MouseAdapter {
	private static NastyMouse instance = null;
	private NastyMouse(){
		super();
	}
	
	public static NastyMouse getNastyMouse(){
		if(NastyMouse.instance == null){
			NastyMouse.instance = new NastyMouse();
		}
		return NastyMouse.instance;
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		JComponent component = (JComponent) arg0.getComponent();
		Rectangle bounds = component.getBounds();
		Point mouse_pos = arg0.getPoint();
		int delta_x = 0;
		int delta_y = 0;
		if (mouse_pos.x < (bounds.width / 2)){
			delta_x = mouse_pos.x+5;
		}
		else {
			delta_x = mouse_pos.x - bounds.width - 5;
		}
		if (mouse_pos.y < (bounds.height / 2)){
			delta_y = mouse_pos.y+5;
		}
		else {
			delta_y = mouse_pos.y - bounds.height - 5;
		}
		component.setLocation(bounds.x + delta_x, bounds.y + delta_y);
	}
}