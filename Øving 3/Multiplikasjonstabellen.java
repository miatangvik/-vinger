/**
 * Multiplikasjonstabellen.java
 *
 * Lager et program som skriver ut en del av multiplikasjonstabellen.
 */

import static javax.swing.JOptionPane.*;
class Multiplikasjonstabellen {
  public static void main(String[] args) {
    String ovreGrenseLest = showInputDialog(null, "Skriv inn nedre grense for gangetabell: ");
    String nedreGrenseLest = showInputDialog(null, "Skriv inn øvre grense for gangetabell: ");
    int nedreGrense = Integer.parseInt(ovreGrenseLest);
    int ovreGrense = Integer.parseInt(nedreGrenseLest);
    String svar = "";
      for (int n = nedreGrense; n <= ovreGrense; n++) {
        for (int i = 1; i < 11; i = i + 1) {
        svar += n + " * " + i + " = " + n * i + "\n";
        }
        svar += "\n";
      }
      showMessageDialog(null, svar);
  }
}