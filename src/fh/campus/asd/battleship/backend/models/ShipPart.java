package fh.campus.asd.battleship.backend.models;

import org.apache.log4j.Logger;
public class ShipPart
{
    /*Jeder Teil vom Schiff (in unserem Fall ist jeder Teil genau 40pixel lang) hat die Eigenschaften von der Klasse
    ShipPart*/
    private static final Logger log = Logger.getLogger(ShipPart.class);
    private final int x;
    private final int y;
    private boolean damage;

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public ShipPart(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.damage = false;

        /*Dient der Ausgabe für uns, zum testen*/
       log.debug(" schiffteil an X= " + this.x + " Y =" + this.y + " schaden= " + false);
    }

    /*ist dieser Teil vom Schiff zerstört?*/
    public boolean isDamaged()
    {
        return damage;
    }

    /*Wird in der Ship klasse, in der attack Methode aufgerufen!*/
    public void destroy()
    {
        this.damage = true;
    }

}
