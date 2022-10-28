package Figures;

public class Cercle extends Figure {
    private float rayon;

    public Cercle() {
    }

    public Cercle(Point point, int contour, int couleur, int remplissage, float rayon) {
        super(point, contour, couleur, remplissage);
        this.rayon = rayon;
    }

    @Override
    public float perimetre() {
        return (float) (2*Math.PI*rayon);
    }

    @Override
    public float surface() {
        return (float) (Math.PI*rayon*rayon);
    }

    @Override
    public void dessiner() {
        System.out.printf("Cer (%.2f, %.2f) : %.2f\n",
                point.x, point.y, rayon);
        super.dessiner();
    }
}
