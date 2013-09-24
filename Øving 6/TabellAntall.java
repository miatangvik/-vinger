/**
 * TabellAntall.java
 *
 * Lager et program som går i løkke x antall ganger, og lagrer diverse i tabell.
 */

class TabellAntall {
  public static void main(String[] args) {
    java.util.Random random = new java.util.Random();
    int antallGjennomlop = 1000;

    int[] antall = new int[10];
    for (int i = 0; i < antallGjennomlop; i++) {
      int tall = random.nextInt(10);
      antall[tall]++;
    }
    System.out.println("Antall enere: " + antall[0] + "\nAntall toere: " + antall[1] + "\nAntall treere: " + antall[2] + "\nAntall firere " + antall[3] + "\nAntall femmere: " + antall[4] + "\nAntall seksere: " + antall[5] + "\nAntall syvere: " + antall[6] + "\nAntall åttere: " + antall[7] + "\nAntall niere: " + antall[8] + "\nAntall tiere: " + antall[9]);
  }
}