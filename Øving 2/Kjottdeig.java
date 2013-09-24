/**
 * Kjottdeig.java
 *
 * Oppgave 3.12.4 s. 113
 */

import static javax.swing.JOptionPane.*;
class Kjottdeig {
  public static void main(String[] args) {
  double pris1 = 35.90;
  double pris2 = 39.50;
  int vekt1 = 450;
  int vekt2 = 500;
  
  double grampris1 = pris1 / vekt1;
  double grampris2 = pris2 / vekt2;
  
  if (grampris1 < grampris2) {
  System.out.println("Kjøttdeig A er billigst");
  } else {
  System.out.println("Kjøttdeig B er billigst");
  }
  }
}
  
  
  /*
  String vekt1Lest = showInputDialog("Vekt kjøttdeig A i gram: ");
  String vekt2Lest = showInputDialog("Vekt kjøttdeig B i gram: ");
  int vekt1 = Integer.parseInt(vekt1Lest);
  int vekt2 = Integer.parseInt(vekt2Lest);
  double pris1 = Double.parseDouble(pris1Lest);
  double pris2 = Double.parseDouble(pris2Lest);
  */