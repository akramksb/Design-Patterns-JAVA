package Figures;

public class Rectangle extends Figure {
    private float largeur;
    private float hauteur;

    public Rectangle() {
    }

    public Rectangle(Point point, int contour, int couleur, int remplissage, float largeur, float hauteur) {
        super(point, contour, couleur, remplissage);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public float perimetre() {
        return 2*(largeur+hauteur);
    }

    @Override
    public float surface() {
        return largeur*hauteur;
    }

    @Override
    public void dessiner() {
        System.out.printf("Rec (%.2f, %.2f) : %.2f / %.2f \n",
                point.x, point.y, largeur, hauteur);
        super.dessiner();
    }
}
