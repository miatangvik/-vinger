/**
 * TestklientBrok.java
 *
 * Tester metodene i Brok-klassen.
 */

import static javax.swing.JOptionPane.*;
class TestklientBrok {
  public static void main(String[] args) {
  System.out.println("Totalt antall tester: 4");
  
  Brok brok = new Brok(3, 5);
  Brok brok2 = new Brok(1, 3);
  
  brok.getSum(brok2);
  
  System.out.println(brok.toString());
  if (brok.getTeller() == 14 && brok.getNevner() == 15) {
    System.out.println("Svaret er riktig, og addisjonsmetoden fungerer!");
  }
  
  brok.teller = 3;
  brok.nevner = 5;
  brok2.teller = 1;
  brok2.nevner = 3;
  
  brok.getDifferanse(brok2);
  
  System.out.println(brok.toString());
  if (brok.getTeller() == 4 && brok.getNevner() == 15) {
    System.out.println("Svaret er riktig, og subtraksjonsmetoden fungerer!");
  }
  
  brok.teller = 3;
  brok.nevner = 5;
  brok2.teller = 1;
  brok2.nevner = 3;
  
  brok.getProdukt(brok2);
  
  System.out.println(brok.toString());
  if (brok.getTeller() == 3 && brok.getNevner() == 15) {
    System.out.println("Svaret er riktig, og multiplikasjonsmetoden fungerer!");
  }
  
  brok.teller = 3;
  brok.nevner = 5;
  brok2.teller = 1;
  brok2.nevner = 3;
  
  brok.getKvotient(brok2);
  
  System.out.println(brok.toString());
  if (brok.getTeller() == 9 && brok.getNevner() == 5) {
    System.out.println("Svaret er riktig, og divisjonsmetoden fungerer!");
  }
  }
}