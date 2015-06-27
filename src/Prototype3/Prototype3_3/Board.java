package Prototype3.Prototype3_3;

import processing.core.PApplet;

/**
 * Created by Tom_Bryant on 6/25/15.
 */
public class Board extends PApplet {

    public static int SCREEN_HEIGHT;
    public static int SCREEN_WIDTH;
    public HexTile center;



    public void setup() {

        SCREEN_HEIGHT = 600 ;
        SCREEN_WIDTH = 800;
        size(SCREEN_WIDTH,SCREEN_HEIGHT);
        background(0, 188, 212);
        smooth(8);
        this.center= new HexTile(this, SCREEN_WIDTH/2, SCREEN_HEIGHT/2,50, new BoardData());
        center.getModel().buildRandomBoard((center));
        //center.getModel().buildBoard((center));
        fill(0);
        text("Prototype 3.3", 20,20);

    }



    public void draw() {


        fill(255,0,0,0);

        fill(0);
        center.getModel().displayBoard(1);
        //System.out.println(center.checkNeighbor("AB"));

        fill(0);



    }


    public void hex(float cX, float cY, float radius){
        smooth(8);
        float sideToSide = (float)(Math.sqrt(3) * radius) / 2f;
        float canopyBase = (float) Math.sqrt((Math.pow(radius, 2)) - Math.pow(sideToSide,2));
        stroke(0,0,0,0);
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
        PApplet.main(new String[] { "--present", "Prototype3.Prototype3_3.Board" });
    }
}