/**
 * MinRandom.java
 *
 * Lager klassen MinRandom.
 */

class MinRandom {
  java.util.Random random = new java.util.Random();
  
  public int nesteHeltall(int nedre, int ovre) { // intervallet [nedre, ovre]
    return (random.nextInt(ovre - nedre) + nedre);
  }
  
  public double nesteDesimaltall(double nedre, double ovre) { // intervallet <nedre, ovre>
    return (random.nextDouble() * (ovre - nedre) + nedre); // spør john inge om dette
  }
}