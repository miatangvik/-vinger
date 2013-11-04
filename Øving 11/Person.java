/**
 * Person.java
 *
 * Oppgave 11.10.1
 * Lager en klasse Person med get-metoder for alle attributtene.
 */

class Person {
  private final String fornavn;
  private String etternavn;
  private final int fødselsår;
  
  public Person(String fornavn, String etternavn, int fødselsår) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.fødselsår = fødselsår;
  }
  
  public String getFornavn() {
    return fornavn;
  }
  
  public String getEtternavn() {
    return etternavn;
  }
  
  public int getFødselsår() {
    return fødselsår;
  }
}