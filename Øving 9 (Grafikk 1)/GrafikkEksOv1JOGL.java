/*
 * GrafikkEksempelOv1JOGL.java JHN
 * Filen inneholder to klasser:
 * Vindu: Et vindu med en tegning
 * GrafikkEksempelOv1JOGL: Inneholder main()-metode som viser fram vinduet med tegningen
 * Tegningen er gitt som en egen klasse TegningOv1_1JOGL som ligger paa
 * en egen fil kalt TegningOv1_1JOGL.java. Det som tegnes ut er to trekanter,
 * en firkant og en sirkel. JOGL er javabindingen som benyttes mot OPENGL. */

import java.awt.*; // klassene Color og Graphics
import javax.swing.*; // klassene JFrame og JPanel
import java.util.*;
import javax.media.opengl.*; //JOGL klasser
import javax.media.opengl.glu.*; //glu klasser

class Vindu extends JFrame {
	public Vindu(String tittel) {
		setTitle(tittel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		TegningOv1_1JOGL tegningen = new TegningOv1_1JOGL(400, 400);
		add(tegningen);
		pack();
	}
}

/*Klassen som inneholder main*/

class GrafikkEksOv1JOGL {
	public static void main(String[] args) {
		Vindu etVindu = new Vindu("V2005 Oving 1: Enkel grafikk");
		etVindu.setVisible(true);
	}
}