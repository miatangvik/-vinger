/**
 * Smiley.java
 *
 * Oppgave 10.9.1
 * Lager en tegning av "Smiley". Legger først tegningen i en applikasjon, deretter i en applet.
 */

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame {
  public Vindu(String tittel) {
    setTitle(tittel);
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Tegning tegning = new Tegning();
    add(tegning);
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

class Smiley {
  public static void main(String[] args) {
    Vindu smileyVindu = new Vindu("Smiley");
    smileyVindu.setVisible(true);
  }
}