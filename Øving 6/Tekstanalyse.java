/**
 * Tekstanalyse.java
 *
 * Lager en klasse for tekstanalyse som finner ut ting om en tekst skrevet inn av bruker i et klientprogram.
 */

class Tekstanalyse {
  private int[] antallTegn = new int[30];
  private int indeksgrense = 29;
  private String tekst = "";
  
  public Tekstanalyse(String tekst) { // Konstruktør
    this.tekst = tekst;
    
    for (int i = 0; i < tekst.length(); i++) {
      char tegn = tekst.charAt(i);
      if (tegn > 64 && tegn < 91) {
        antallTegn[tegn - 'A']++;
      } else if (tegn > 96 && tegn < 123) {
        antallTegn[tegn - 'a']++;
      } else if (tegn == 'æ' || tegn == 'Æ') {
        antallTegn[26]++;
      } else if (tegn == 'ø' || tegn == 'Ø') {
        antallTegn[27]++;
      } else if (tegn == 'å' || tegn == 'Å') {
        antallTegn[28]++;
      } else if (tegn > 31 && tegn < 65 || tegn > 90 && tegn < 97 || tegn > 122 && tegn < 127) {
        antallTegn[29]++;
      }
    }
  }
  
  public int getAntallForskjelligeBokstaver() { // Summerer antall fra indeks 0-28 som ikke er 0
    int antallForskjelligeBokstaver = 0;
    for (int i = 0; i < indeksgrense; i++) {
      if (antallTegn[i] != 0) {
        antallForskjelligeBokstaver++;
      }
    }
    return antallForskjelligeBokstaver;
  }

  public int getAntallBokstaver() {
    int antallBokstaver = 0;
    for (int i = 0; i < indeksgrense; i++) {
      antallBokstaver += antallTegn[i];
    }
    return antallBokstaver;
  }
  
  public int getAntallIkkeBokstaver() {
    int antallIkkeBokstaver = antallTegn[29];
    int antallIkkeBokstaverProsent = (antallIkkeBokstaver * 100) / (antallIkkeBokstaver + getAntallBokstaver());
    return antallIkkeBokstaverProsent;
  }
  
  public int getAntallBestemtBokstav(String bokstav) {
    int bestemtBokstav = bokstav.charAt(0);
    if (bestemtBokstav >= 65 && bestemtBokstav <= 90) {
      bestemtBokstav -= 'A';
    } else if (bestemtBokstav >= 97 && bestemtBokstav <= 122) {
      bestemtBokstav -= 'a';
    } else if (bestemtBokstav == 'æ' || bestemtBokstav == 'Æ') {
      bestemtBokstav = 26;
    } else if (bestemtBokstav == 'ø' || bestemtBokstav == 'Ø') {
      bestemtBokstav = 27;
    } else if (bestemtBokstav == 'å' || bestemtBokstav == 'Å') {
      bestemtBokstav = 28;
    }
    return antallTegn[bestemtBokstav];
  }
  
  public String getOftest() { // Sjekker alle plassene i tabellen om det finnes større verdier og om det finnes flere av den største verdien
    String oftest = "";
    int maks = 0;
    for (int i = 0; i < indeksgrense; i++) {
      if (antallTegn[i] > maks) {
        maks = antallTegn[i];
      }
    }
    char flestAv = 'a';
    for (int i = 0; i < indeksgrense - 3; i++) {
      if (antallTegn[i] == maks) {
        oftest += flestAv;
      }
    flestAv++;
    }
    return oftest;
  }
}