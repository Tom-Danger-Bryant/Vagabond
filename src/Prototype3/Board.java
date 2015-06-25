package Prototype3;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import processing.core.PApplet;

/**
 * Created by Tom_Bryant on 6/25/15.
 */
public class Board extends PApplet {

    public int SCREEN_HEIGHT;
    public int SCREEN_WIDTH;


    public void setup() {
        this.SCREEN_HEIGHT = 600 ;
        this.SCREEN_WIDTH = 800;
        size(SCREEN_WIDTH,SCREEN_HEIGHT);
        background(0,188,212);
        smooth(8);


    }

    public void draw() {
        hex(SCREEN_WIDTH/2, SCREEN_HEIGHT/2, 50);

    }


    public void hex(float cX, float cY, int radius){
        smooth(8);
        float sideToSide = (float)(Math.sqrt(3) * radius) / 2f;
        float canopyBase = (float) Math.sqrt((Math.pow(radius, 2)) - Math.pow(sideToSide,2));
        stroke(0,0,0);
        beginShape();
        vertex(cX, cY + radius);
        vertex(cX + sideToSide, cY +  (radius -canopyBase));
        vertex(cX + sideToSide, cY - (radius -canopyBase));
        vertex(cX, cY - radius);
        vertex(cX - sideToSide, cY - (radius -canopyBase));
        vertex(cX - sideToSide, cY +  (radius -canopyBase));
        endShape();

    }

    public static void main(String args[]) {
        PApplet.main(new String[] { "--present", "Prototype3.Board" });
    }
}
