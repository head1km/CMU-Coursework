import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * 
 */

/**
 * @author khead90
 *
 */
public class BTreeDisplay extends JPanel {
	BTreeDisplay(AVLNode tree) {
		setBorder(BorderFactory.createEtchedBorder());
		setLayout(new BorderLayout());
		if (tree != null) {
			String value = String.valueOf(tree.value);
			int pos = SwingConstants.CENTER;
			JLabel rootLabel = new JLabel(value, pos);
			add(rootLabel, BorderLayout.NORTH);
			JPanel panel = new JPanel(new GridLayout(1, 2));
			panel.add(new BTreeDisplay(tree.left));
			panel.add(new BTreeDisplay(tree.right));
		}
	}
}
