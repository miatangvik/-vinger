/**
 * SkuddarEllerIkke.java
 *
 * Oppgave 3.12.3 s. 113
 */

import static javax.swing.JOptionPane.*;
class SkuddarEllerIkke {
  public static void main(String[] args) {
  String arstallLest = showInputDialog("Årstall: ");
  int arstall = Integer.parseInt(arstallLest);
  
  String melding;
  if (arstall % 100 == 0) {
  	if (arstall % 400 == 0) {
  	  System.out.println("Skuddår");
  	} else {
  	  System.out.println("Ikke skuddår");
  	}
  } else if (arstall % 4 == 0) {
    System.out.println("Skuddår");
  } else {
    System.out.println("Ikke skuddår");
  }
  }
}