package oving9;
/*
 * TegningOv1_1JOGL.java JHN
 * Draws one quad, two triangles and one circle. JOGL binding towards OpenGL
 */

// Java classes
import java.awt.*;
import javax.swing.*; // klassene JFrame og JPanel
import java.util.*;

//JOGL klasser
import javax.media.opengl.*;
import javax.media.opengl.glu.*;

public class TegningOv1_1JOGL extends JPanel implements GLEventListener{
	
	/* interfacet GLEventListener innholder folgende 4 metoder som maa implemeenteres:
	 * - display(GLDrawable drawable)
	 * 	Called by the drawable to initiate OpenGL rendering by the client
	 * - displayChanged(GLDrawable drawable, boolean modeChanged, boolean deviceChanged)
	 * 	Called by the drawable when the display mode or the display device associated with the GLDrawable has changed.
	 * - init(GLDrawable drawable)
	 * 	Called by the drawable immediately after the OpenGL context is initialized.
	 * - reshape(GLDrawable drawable, int x, int y, int width, int height)
	 * 	Called by the drawable during the first repaint after the component has been resized.
	 */
	
	private GLCanvas canvas;
	private float angle;
	private GLU glu = new GLU();
	
	public TegningOv1_1JOGL(int width, int height) {
		super();
		GLCapabilities capabilities = new GLCapabilities();
		capabilities.setHardwareAccelerated(true); // We want hardware acceleration
		capabilities.setDoubleBuffered(true); // And double buffering
		canvas = new GLCanvas(capabilities);
		canvas.addGLEventListener(this);
		this.add(canvas);
		this.setSize(width,height);
		canvas.setSize(width,height); // We want the JPanel and the GLCanvas to have the same size
		canvas.setVisible(true); // This is somehow necessary
	}
	
	public void init(GLAutoDrawable glDrawable) {
		GL gl = glDrawable.getGL(); // Get the GL object from glDrawable
		gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f); // Sets the background color to white
		gl.glMatrixMode(GL.GL_PROJECTION); // Select The Projection Matrix
		gl.glLoadIdentity(); // Reset the view matrix to the identity matrix
		glu.gluPerspective(45.0, 1.25, 2.0, 9.0); // Spesifize the projection matrix (fov, w/h, near plane, far plane)
		gl.glMatrixMode(GL.GL_MODELVIEW);
	}
	
	public void reshape(GLAutoDrawable glDrawable, int i, int i1, int i2, int i3) {
		// Has to be implemented due to the GLEventListener interface
	}
	
	/* Draw two triangles and one quad */
	
	public void drawGLScene(GLAutoDrawable glDrawable) {
		GL gl = glDrawable.getGL();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT); // Clear The Screen and The Depth Buffer
		gl.glLoadIdentity(); // Reset The View matrix
		gl.glTranslatef(-1.5f, 0.0f, -8.0f); // Move Left 1.5 Units and into The Screen 8 units
		gl.glColor3f(1.0f, 0.0f, 0.0f);	// Set the Color to Red
		
		gl.glBegin(GL.GL_TRIANGLES); // Start drawing a triangle
		gl.glVertex3f(0.5f, 0.5f, 0.0f); // Top
		gl.glVertex3f(0.0f, -0.5f, 0.0f); // Bottom Left
		gl.glVertex3f(1.0f, -0.5f, 0.0f); // Bottom Right
		gl.glEnd(); // Finished Drawing The Triangle
		
		gl.glBegin(GL.GL_TRIANGLES); // Start drawing a triangle
		gl.glVertex3f(1.5f, 0.5f, 0.0f); // Top
		gl.glVertex3f(1.0f, -0.5f, 0.0f); // Bottom Left
		gl.glVertex3f(2.0f, -0.5f, 0.0f); // Bottom Right
		gl.glEnd(); // Finished Drawing The Triangle
		
		gl.glTranslatef(3.0f, 0.0f, 0.0f); // Move Right 3 Units
		gl.glColor3f(0.0f, 1.0f, 0.0f); // Set the Color to Green
		
		gl.glBegin(GL.GL_QUADS); // Start drawing a Quad
		gl.glVertex3f(-1.0f, 0.5f, 0.0f); // Top Left
		gl.glVertex3f(0.0f, 0.5f, 0.0f); // Top Right
		gl.glVertex3f(0.0f, -0.5f, 0.0f); // Bottom Right
		gl.glVertex3f(-1.0f, -0.5f, 0.0f); // Bottom Left
		gl.glEnd(); // Done drawing the Quad
	} // drawGLScene()
	
	/* Tegner en sirkel */
	
	public void drawGLScene2(GLAutoDrawable glDrawable) {
		GL gl = glDrawable.getGL();
		gl.glLoadIdentity(); // Reset The View matrix
		gl.glTranslatef(-0.1f, -1.0f, -7.0f); // Move Left 0.1, down 1.0 units and into the screen 7 units
		final double PI = 3.1415926535898; // Initiate constant PI
		int circle_points = 100; // Initiate circle_points (number of points to construct the circle)
		gl.glColor3f(0.0f, 0.0f, 1.0f); // Set Color to Blue
		gl.glBegin(GL.GL_LINE_LOOP); // Draw a lines between circle points using
		double angle = 0.0; // Initiate angle
		
		for (int i = 0; i < circle_points; i++){ // for loop
			angle = 2 * PI * i/circle_points; // calculate new angle
			gl.glVertex2f((float)Math.cos(angle), (float)Math.sin(angle)); // Calculate vertex points on the circle
		}
		
		gl.glEnd(); // Done drawing the circle
	}
	
	/** void display() Draw to the canvas. */
	/* Purely a Java thing. Simple calls drawGLScene once GL is initialized */
	
	public void display(GLAutoDrawable glDrawable) {
		GL gl = glDrawable.getGL();
		drawGLScene(glDrawable); // Calls drawGLScene
		drawGLScene2(glDrawable); // Calls drawGLScene2
		glDrawable.swapBuffers();// Ligger ikke i glut slik som i c, her er det viktig for ikke aa faa flimmer!!
		gl.glFlush(); // Tvinger tidligere buffrede OpenGL kommandoer til aa utfores med en gang.
	}
	
	public void displayChanged(GLAutoDrawable glDrawable, boolean b, boolean b1) {
		// Must be present due to the GLEventListener interface
	}
} // TegningOv1_1JOGL