package Prototype5;

import processing.core.PImage;

import java.awt.*;

/**
 * Created by Tom_Bryant on 7/13/15.
 * An Icon resource pairing
 */
public class ResourceIcon {

    private Board parent;
    private String resource;
    private Point startPos;
    private int amount;

    public ResourceIcon(Board parent, String resource){
        this.parent = parent;
        this.resource = resource;

        this.startPos = new Point(0,0);
        this.amount = 0;
    }

    public void display(){
        parent.image(getImg(),startPos.x,5);
        parent.fill(78,52,46);
        parent.stroke(0,0,0,30);
        parent.rect(startPos.x + 32,7, 30,25,5,5,5,5);
        parent.fill(255);
        parent.text(amount, startPos.x + 47 - (parent.textWidth("" +amount)/2), 5 + 15 + 7 );
    }


    public Point getStartPos() {
        return startPos;
    }

    public void setStartPos(Point startPos) {
        this.startPos = startPos;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Returns a PImage that
     * is loaded in the parent board
     * based on the resource type
     */
    private PImage getImg(){
        if(resource.equals("grain")){
            return parent.images[1];
        }
        if(resource.equals("ore")){
            return parent.images[2];
        }
        if(resource.equals("wool")){
            return parent.images[3];
        }
        if(resource.equals("brick")){
            return parent.images[4];
        }
            return parent.images[5];
        }


}