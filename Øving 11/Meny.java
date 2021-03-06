/**
 * Meny.java
 *
 * Oppgave 11.10.1
 * Lager et menystyrt program som gir brukeren mulighet til å forandre på datainnholdet i objektet.
 */

import static javax.swing.JOptionPane.*;

class Meny {
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
    BGS bgs = new BGS(arbTaker);
    
    int valg = bgs.lesValg();
    while (valg != -1) {
      bgs.utførValgtOppgave(valg);
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
      valg = bgs.lesValg();
    }
  }
}

class BGS {
  private final String[] ALTERNATIVER = {"Endre månedslønn", "Endre skatteprosent", "Avslutt"};
  private final int NY_MÅNEDSLØNN = 0;
  private final int NY_SKATTEPROSENT = 1;
  private final int AVSLUTT = 2;
  
  private ArbTaker arbTaker;
  public BGS(ArbTaker arbTaker) {
    this.arbTaker = arbTaker;
  }
  
  public int lesValg() {
    int valg = showOptionDialog(null, "Hva vil du gjøre?", "Arbeidstaker", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
    if (valg == AVSLUTT) {
      valg = -1;
    }
    return valg;
  }
  
  public void utførValgtOppgave(int valg) {
    switch (valg) {
    case NY_MÅNEDSLØNN:
      setMånedslønn();
      break;
    case NY_SKATTEPROSENT:
      setSkatteprosent();
      break;
    default:
      break;
    }
  }
  
  public void setMånedslønn() {
    String nyMånedslønnLest = showInputDialog("Skriv inn ny månedslønn: ");
    int nyMånedslønn = Integer.parseInt(nyMånedslønnLest);
    arbTaker.setMånedslønn(nyMånedslønn);
  }
  
  public void setSkatteprosent() {
    String nySkatteprosentLest = showInputDialog("Skriv inn ny skatteprosent: ");
    int nySkatteprosent = Integer.parseInt(nySkatteprosentLest);
    arbTaker.setSkatteprosent(nySkatteprosent);
  }
}