package src.exemples.carafe;

public class Carafe {

    private int capacité;
    private int contenu;

    public Carafe(int capacité) { 
        this.capacité = capacité;
        contenu = 0;
    }

    public int contenu() {
        return contenu;
    }

    public void remplir() {
        contenu = capacité;
    }

    public void vider() {
        contenu = 0;
    }

    public void transvaserDans(Carafe c) {
        if(this.contenu + c.contenu > c.capacité) {
            int depassement = (this.contenu + c.contenu) - c.capacité;
            c.remplir();
            this.contenu -= this.contenu - depassement;
        } else {
            c.contenu += this.contenu;
            this.vider();
        }
    }

    public String toString() {
        return contenu+"/"+capacité;
    }
}