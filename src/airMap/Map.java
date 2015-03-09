package airMap;

import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Map extends JPanel {
	private static final long serialVersionUID = 1L;
	protected int width;
	protected int height;
	protected Image img;
	protected String view;

	public Map() {
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}

	public void setImage(Image img) {
		this.img = img;
	}
}