package autonoma.simuladorpulgas.models;

/**
 *
 * @author LAPTOP
 */
public abstract class Pulga {
    protected int vida;
    protected int x;
    protected int y;

    public Pulga(int vida, int posicionX, int posicionY) {
        this.vida = vida;
        this.x = posicionX;
        this.y = posicionY;
    }
   
    
    public abstract void reubicar (int x , int y);
}
