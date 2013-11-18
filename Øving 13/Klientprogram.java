/**
 * Klientprogram.java
 *
 * Oppgave 12.10.1
 * Lager et enkelt klientprogram.
 */

import static javax.swing.JOptionPane.*;

class Klientprogram {
  public static void main(String[] args) {
    String antStud = showInputDialog("Hvor mange studenter skal oppgaveoversikten maks inneholde?");
    int antStudLest = Integer.parseInt(antStud);
    
    Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt(antStudLest);
    OppgaveoversiktBGS bgs = new OppgaveoversiktBGS(oppgaveoversikt);
    
    int valg = bgs.lesValg();
    while (valg >= 0) {
      bgs.utførValgtOppgave(valg);
      valg = bgs.lesValg();
    }
  }
}

class OppgaveoversiktBGS {
  private final String[] ALTERNATIVER = {"Finn antall studenter", "Finn antall oppgaver løst", "Registrer ny student", "Øk antall godkjente oppgaver", "Avslutt"};
  private final int FINN_ANT_STUDENTER = 0;
  private final int FINN_ANT_OPPG_LOST = 1;
  private final int REG_NY_STUDENT = 2;
  private final int OK_ANT_GODKJENTE_OPPG = 3;
  private final int AVSLUTT = 4;
  
  private Oppgaveoversikt oppgaveoversikt;
  public OppgaveoversiktBGS(Oppgaveoversikt oppgaveoversikt) {
    this.oppgaveoversikt = oppgaveoversikt;
  }
  
  public int lesValg() {
    int valg = showOptionDialog(null, "Hva vil du gjøre?", "Oppgaveoversikt", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
    if (valg == AVSLUTT) {
      valg = -1;
    }
    return valg;
  }
  
  public void utførValgtOppgave(int valg) {
    switch (valg) {
    case FINN_ANT_STUDENTER:
      getAntStud();
      break;
    case FINN_ANT_OPPG_LOST:
      getAntOppgLost();
      break;
    case REG_NY_STUDENT:
      nyStudent();
      break;
    case OK_ANT_GODKJENTE_OPPG:
      okAntOppg();
      break;
    default:
      break;
    }
  }
  
  public void getAntStud() {
    showMessageDialog(null, "Antall studenter er " + oppgaveoversikt.getAntStud());
  }
  
  public void getAntOppgLost() {
    showMessageDialog(null, "Antall oppgaver løst er " + oppgaveoversikt.getAntOppgLost(showInputDialog("Hva heter studenten du vil se antall godkjente oppgaver for?")));
  }
  
  public void nyStudent() {
    oppgaveoversikt.nyStudent(new Student(showInputDialog("Hva heter den nye studenten?")));
  }
  
  public void okAntOppg() {
    String navn = showInputDialog("Hva heter studenten du vil øke antall godkjente oppgaver for?");
    String okning = showInputDialog("Hvor mange vil du øke antall godkjente oppgaver med?");
    int okningLest = Integer.parseInt(okning);
    oppgaveoversikt.okAntOppg(navn, okningLest);
  }
}