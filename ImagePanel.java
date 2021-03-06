import javax.swing.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

class ImagePanel extends JPanel {

  // serialization
  private static final long serialVersionUID = 1L;

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());

  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(img, 0, 0, null);
  }

}