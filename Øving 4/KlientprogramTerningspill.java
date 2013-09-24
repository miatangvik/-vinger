/**
 * KlientprogramTerningspill.java
 *
 * Programmerer terningspillet 100 med to spillere, A og B.
 */

class KlientprogramTerningspill {
  public static void main(String[] args) {
    int runde = 0;
  
  terningspill spillerA = new terningspill();
  terningspill spillerB = new terningspill();

  while (!spillerA.erFerdig() && !spillerB.erFerdig()) {
    spillerA.kastTerningen();
    spillerB.kastTerningen();
    runde++;
    System.out.println("Runde: " + runde + "\nPoengsum spiller A: " + spillerA.getSumPoeng());
    System.out.println("Runde: " + runde + "\nPoengsum spiller B: " + spillerB.getSumPoeng());
  }
  
  if (spillerA.erFerdig) {
    System.out.println("Spiller A har passert 100 poeng, og dermed vunnet spillet!");
  } else {
    System.out.println("Spiller B har passert 100 poeng, og dermed vunnet spillet!");
  }
  }
}