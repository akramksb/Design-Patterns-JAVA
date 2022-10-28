package Figures;

import observable.Observable;
import observable.Observer;
import observable.Parametrage;

public abstract class Figure implements Observer {
    protected Point point;
    protected int contour;
    protected int couleur;
    protected int remplissage;

    public Figure() {
    }

    public Figure(Point point, int contour, int couleur, int remplissage) {
        this.point = point;
        this.contour = contour;
        this.couleur = couleur;
        this.remplissage = remplissage;
    }

    public abstract float perimetre();
    public abstract float surface();
    public void dessiner(){
        System.out.printf("params[%d, %d, %d]\n",
                contour,couleur,remplissage);
    }

    @Override
    public void update(Observable observable) {
        Parametrage p = (Parametrage) observable;
        setContour( p.getContour() );
        setCouleur( p.getCouleur() );
        setRemplissage( p.getRemplissage() );
    }

    public Point getPoint() {
        return point;
    }

    public int getContour() {
        return contour;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRemplissage() {
        return remplissage;
    }

    public void setContour(int contour) {
        this.contour = contour;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void setRemplissage(int remplissage) {
        this.remplissage = remplissage;
    }
}
