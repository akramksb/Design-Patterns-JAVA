package observable;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {
    private int contour;
    private int couleur;
    private int remplissage;
    List<Observer> observers = new ArrayList<>();
    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(this);
    }

    public void setContour(int contour) {
        this.contour = contour;
        notifyObservers();
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
        notifyObservers();
    }

    public void setRemplissage(int remplissage) {
        this.remplissage = remplissage;
        notifyObservers();
    }

    public int getContour() {
        return contour;
    }

    public int getCouleur() {
        return couleur;
    }

    public int getRemplissage() {
        return remplissage;
    }
}
