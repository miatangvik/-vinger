/**
 * Terningspill.java
 *
 * Lager en klasse som simulerer en spiller. 
 */
 
class terningspill {
  java.util.Random terning = new java.util.Random();
  private int sumPoeng = 0;
  private int terningkast;
  public boolean erFerdig = false;
  
  public terningspill() {
  }
  
  public int getSumPoeng() {
    return sumPoeng;
  }
  
  public void kastTerningen() {
    terningkast = terning.nextInt(6) + 1;
    if (terningkast == 1) {
      sumPoeng = 0;
    } else {
      sumPoeng += terningkast;
    }
  }
  
  public boolean erFerdig() {
    if (sumPoeng > 100) {
      erFerdig = true;
    } else {
      erFerdig = false;
    }
    return erFerdig;
  }
}