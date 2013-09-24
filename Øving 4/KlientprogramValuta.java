/**
 * KlientprogramValuta.java
 *
 * Lager et klientprogram som oppretter minst tre objekter som representerer forskjellige valutaer.
 * Brukere får tilbud om å regne om flere ulike beløp i de forskjellige valutaene til norske kroner.
 */

import static javax.swing.JOptionPane.*;
class KlientprogramValuta {
  public static void main(String[] args) {    

  String valutaInput = showInputDialog("Valuta: \n 1: dollar \n 2: euro \n 3: svenske kroner \n 4: avslutt");
  int valuta = Integer.parseInt(valutaInput);
  
  if (valuta < 0 || valuta > 4) {
    showMessageDialog(null, "Ugyldig menyvalg");
  }
  
  String belopInput = showInputDialog("Skriv inn beløpet du vil regne om: ");
  double belop = Double.parseDouble(belopInput);

  Valuta dollar = new Valuta(belop, 6.7512, 1);
  Valuta euro = new Valuta(belop, 8.0555, 1);
  Valuta sek = new Valuta(belop, 86.03, 100);

  while (valuta != 4) {
    switch (valuta) {
    case 1:
      showMessageDialog(null, "Svar: " + dollar.beregnTilNok() + " NOK" + dollar.toString() + " NOK");
      break;
    case 2:
      showMessageDialog(null, "Svar: " + euro.beregnTilNok() + " NOK" + euro.toString() + " NOK");
      break;
    case 3:
      showMessageDialog(null, "Svar: " + sek.beregnTilNok() + " NOK" + sek.toString() + " NOK");
      break;
    }
  valutaInput = showInputDialog("Valuta: \n 1: dollar \n 2: euro \n 3: svenske kroner \n 4: avslutt");
  valuta = Integer.parseInt(valutaInput);
  }
  }
}