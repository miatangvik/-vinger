/**
 * Testprogram.java
 *
 * Oppgave 12.10.1
 * Lager et testprogram for klassen Student.
 */

class Testprogram {
  public static void main(String[] args) {
    Student student = new Student("Mia Tangvik");
    System.out.println("Utskrift 1, ingen godkjente oppgaver: " + student.toString());
    student.okAntOppg(10);
    System.out.println("Utskrift 2, ti godkjente oppgaver: " + student.toString());
  }
}