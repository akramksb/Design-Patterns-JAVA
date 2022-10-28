import Figures.*;
import traitement.TraitementStrategyImpl2;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();
        Rectangle r1 = new Rectangle(new Point(1,3), 2,1,3,1.2f,3.2f);
        Rectangle r2 = new Rectangle(new Point(3,3), 5,3,7,5.2f,9.5f);
        Rectangle r3 = new Rectangle(new Point(7,5), 6,2,5,7.7f,4.7f);
        Cercle c1 = new Cercle(new Point(4,4), 2,3,2,5);
        Cercle c2 = new Cercle(new Point(6,5), 2,6,2,5.4f);
        Cercle c3 = new Cercle(new Point(7,4), 4,9,1,8);

        Group g1 = new Group();
        Group g2 = new Group();
        g1.addFigure(r2);
        g1.addFigure(c2);
        g2.addFigure(g1);
        g2.addFigure(r3);
        g2.addFigure(c3);

        dessin.addFigure(r1);
        dessin.addFigure(c1);
        dessin.addFigure(g2);

        dessin.traiter();
        dessin.setTraitementStrategy(new TraitementStrategyImpl2());
        dessin.traiter();
        dessin.dessiner();
    }
}
