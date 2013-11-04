/**
 * Klient.java
 *
 * Oppgave 11.10.1
 * Lager et klientprogram som kaller omtrent alle objektmetodene jeg har laget i klassene.
 */

import static javax.swing.JOptionPane.*;

class Klient {
  public static void main(String[] args) {
    String resultat = "";
    
    String fornavn = showInputDialog("Skriv inn fornavn: ");
    String etternavn = showInputDialog("Skriv inn etternavn: ");
    String fødselsårLest = showInputDialog("Skriv inn fødselsår: ");
    int fødselsår = Integer.parseInt(fødselsårLest);
    
    String arbtakernrLest = showInputDialog("Skriv inn arbeidstakernummer: ");
    String ansettelsesårLest = showInputDialog("Skriv inn ansettelsesår: ");
    String månedslønnLest = showInputDialog("Skriv inn månedslønn: ");
    String skatteprosentLest = showInputDialog("Skriv inn skatteprosent: ");
    String ansattLengerEnnLest = showInputDialog("Skriv antall år du ønsker å se om personen har vært ansatt lenger enn: ");
    int arbtakernr = Integer.parseInt(arbtakernrLest);
    int ansettelsesår = Integer.parseInt(ansettelsesårLest);
    int månedslønn = Integer.parseInt(månedslønnLest);
    int skatteprosent = Integer.parseInt(skatteprosentLest);
    int ansattLengerEnn = Integer.parseInt(ansattLengerEnnLest);
    
    Person personalia = new Person(fornavn, etternavn, fødselsår);
    ArbTaker arbTaker = new ArbTaker(personalia, arbtakernr, ansettelsesår, månedslønn, skatteprosent);
    
    resultat = "Navn: " + arbTaker.navn();
    resultat += "\nAlder: " + arbTaker.alder();
    resultat += "\nFødselsår: " + personalia.getFødselsår();
    resultat += "\nArbeidstakernummer: " + arbTaker.getArbtakernr();
    resultat += "\nAnsettelsesår: " + arbTaker.getAnsettelsesår();
    resultat += "\nMånedslønn: " + arbTaker.getMånedslønn();
    resultat += "\nSkatteprosent: " + arbTaker.getSkatteprosent();
    resultat += "\nSkattetrekk per måned (juni er skattefri og i desember betales halv skatt): " + arbTaker.skattetrekkPrMåned();
    resultat += "\nBruttolønn per år: " + arbTaker.bruttolønnPrÅr();
    resultat += "\nSkattetrekk per år: " + arbTaker.skattetrekkPrÅr();
    resultat += "\nAntall år ansatt i bedriften: " + arbTaker.antallÅrAnsatt();
    if (arbTaker.ansattLengerEnn(ansattLengerEnn) == true) {
      resultat += "\nHar vært ansatt lenger enn " + ansattLengerEnn + " år";
    } else if (arbTaker.ansattLengerEnn(ansattLengerEnn) == false) {
      resultat += "\nHar ikke vært ansatt lenger enn " + ansattLengerEnn + " år";
    }
    showMessageDialog(null, resultat);
  }
}