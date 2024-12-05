package org.graphics;

import com.jogamp.opengl.GL2;

public class Graphics {
	public static void fillRect(float x, float y, float width, float height) {		
		GL2 gl = EventListener.gl;
		
		gl.glColor3f(1, 1, 1);
		gl.glBegin(GL2.GL_QUADS);
			gl.glVertex2f(-1, -1);
			gl.glVertex2f(1, -1);
			gl.glVertex2f(1, 1);
			gl.glVertex2f(-1, 1);	
		gl.glEnd();
	}
}
