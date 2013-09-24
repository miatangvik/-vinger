/**
 * Primtall.java
 *
 * Skriver et program som finner ut om et tall er et primtall.
 */

import static javax.swing.JOptionPane.*;
class Primtall {
  public static void main(String[] args) {
    String tallLest = showInputDialog(null, "Skriv inn tallet du lurer på om er et primtall: ");
    int tall = Integer.parseInt(tallLest);
    boolean primtall = true;
      for (int i = 2; i < tall; i++) {
        if (tall % i == 0) {
        primtall = false;
        }
      }
		if (primtall == false) {
		  showMessageDialog(null, "Tallet " + tall + " er ikke et primtall.");
		} else {
		  showMessageDialog(null, "Tallet " + tall + " er et primtall.");
		}
  }
}