/**
 * Temperaturer.java
 *
 * Oppgave 9.11.2
 * Lager en klasse som inneholder en todimensjonal tabell med temperaturer for hver time i døgnet i en måned.
 */

import java.util.Random;

class Temperaturer {
  private int antDager;
  private int antTimer;
  private double[][] temperatur;
  private double[] middeltemperaturPrDag;
  
  public Temperaturer(int antDager, int antTimer) { // Kontruktør
    this.antDager = antDager;
    this.antTimer = antTimer;
    this.temperatur = new double[antDager][antTimer];
    
    Random temperatur = new Random();
    for (int i = 0; i < antDager; i++) {
      for (int j = 0; j < antTimer; j++) {
        this.temperatur[i][j] = (double) temperatur.nextInt((50 - (-40)) + 1) - 40;
      }
    }
  }
  
  public double[] getMiddeltemperaturPrDag() { // a) Finner middeltemperaturen for hver dag i måneden
    middeltemperaturPrDag = new double[antDager];
    for (int i = 0; i < antDager; i++) {
      for (int j = 0; j < antTimer; j++) {
        middeltemperaturPrDag[i] += (double) temperatur[i][j];
      }
      middeltemperaturPrDag[i] /= antTimer;
    }
    return middeltemperaturPrDag;
  }
  
  public double[] getMiddeltemperaturPrTime() { // b) Finner middeltemperaturen for hver time i døgnet for måneden
    double[] middeltemperaturPrTime = new double[antTimer];
    for (int i = 0; i < antTimer; i++) {
      for (int j = 0; j < antDager; j++) {
        middeltemperaturPrTime[i] += (double) temperatur[j][i];
      }
      middeltemperaturPrTime[i] /= antDager;
    }
    return middeltemperaturPrTime;
  }
  
  public double getMiddeltemperaturManed() { // c) Finner middeltemperaturen for hele måneden
    double middeltemperaturManed = 0;
    for (int i = 0; i < middeltemperaturPrDag.length; i++) {
      middeltemperaturManed += middeltemperaturPrDag[i];
    }
    return middeltemperaturManed / antDager;
  }
  
  public int[] getGruppertTemperatur() { // d) Finner antall døgn med middeltemperatur innen gitte grupper
    int[] gruppertTemperatur = new int[5];
    for (int i = 0; i < antDager; i++) {
      if (middeltemperaturPrDag[i] < (-5)) {
        gruppertTemperatur[0]++;
      } else if (middeltemperaturPrDag[i] > (-5) && middeltemperaturPrDag[i] < 0) {
        gruppertTemperatur[1]++;
      } else if (middeltemperaturPrDag[i] > 0 && middeltemperaturPrDag[i] < 5) {
        gruppertTemperatur[2]++;
      } else if (middeltemperaturPrDag[i] > 5 && middeltemperaturPrDag[i] < 10) {
        gruppertTemperatur[3]++;
      } else if (middeltemperaturPrDag[i] > 10) {
        gruppertTemperatur[4]++;
      }
    }
    return gruppertTemperatur;
  }
}