package org.graphics;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class EventListener implements GLEventListener{

	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();	
		
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		
		gl.glColor3f(0, 0, 1);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(-0.5f, -0.5f);
		gl.glVertex2f(0.5f, -0.5f);
		gl.glVertex2f(0.5f, 0.5f);
		gl.glVertex2f(-0.5f, 0.5f);
		gl.glEnd();
		
		
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		//
		
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		gl.glClearColor(1, 0, 0, 1);
		
		
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		//
		
	}
	
}
