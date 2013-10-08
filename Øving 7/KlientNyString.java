/**
 * KlientNyString.java
 *
 * Tester klassen NyString.
 */

import static javax.swing.JOptionPane.*;
public class KlientNyString {
  public static void main(String[] args) {
    String analyseResultat = "";
    
    NyString analyseTekst = new NyString(showInputDialog("Skriv inn teksten du ønsker å analysere: "));
    
    analyseResultat = "De første tegnene i ordene er: " + analyseTekst.getForkorting();
    String fjerneTegn = showInputDialog("Hvilket tegn vil du fjerne fra teksten?");
    char tegn = fjerneTegn.charAt(0);
    analyseResultat += "Med tegnet fjernet, blir teksten: " + analyseTekst.getFjerningAvTegn(tegn);
    showMessageDialog(null, analyseResultat);
  }
}