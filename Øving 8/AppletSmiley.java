/**
 * AppletSmiley.java
 *
 * Oppgave 10.9.1
 * Legger smileyen i en applet.
 */

import javax.swing.*;
import java.awt.*;

public class AppletSmiley extends JApplet {
  public void init() {
    add(new Tegning());
  }
}

class Tegning extends JPanel {
  public void paintComponent(Graphics tegneflate) {
    super.paintComponent(tegneflate);
    tegneflate.setColor(Color.PINK);
    tegneflate.fillOval(90, 80, 300, 300); // At de to siste argumentene er like, angir at figuren skal være en sirkel
    tegneflate.setColor(Color.BLACK);
    tegneflate.fillOval(160, 160, 30, 30); // Venstre øye
    tegneflate.fillOval(290, 160, 30, 30); // Høyre øye
    tegneflate.drawArc(175, 250, 140, 70, 0, -180); // Munn
  }
}