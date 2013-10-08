/**
 * KlientTekstanalyse.java
 *
 * 
 */

import static javax.swing.JOptionPane.*;
class KlientTekstanalyse {
  public static void main(String[] args) {
  String tekst = showInputDialog("Skriv teksten du ønsker å analysere: ");
  String bokstav = showInputDialog("Skriv bokstaven du ønsker å vite antall forekomster av: ");
  String resultat = "";
  
  while (tekst != null) {
    Tekstanalyse analyseTekst = new Tekstanalyse(tekst);
    
    resultat = "Antall forskjellige bokstaver i teksten er " + analyseTekst.getAntallForskjelligeBokstaver();
    resultat += "\nAntall bokstaver i teksten er " + analyseTekst.getAntallBokstaver();
    resultat += "\nAntall prosent av teksten som ikke er bokstaver er " + analyseTekst.getAntallIkkeBokstaver() + "%";
    resultat += "\nAntall forekomster av " + bokstav.charAt(0) + " er " + analyseTekst.getAntallBestemtBokstav(bokstav);
    resultat += "\nBokstaven(e) som forekommer oftest i teksten er " + analyseTekst.getOftest();
    
    showMessageDialog(null, resultat);
    tekst = showInputDialog(null, "Skriv teksten du ønsker å analysere: ");
    bokstav = showInputDialog(null, "Skriv bokstaven du ønsker å vite antall forekomster av: ");
  }
  }
}