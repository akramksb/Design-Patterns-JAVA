package Figures;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {
    List<Figure> figures = new ArrayList<>();
    @Override
    public float perimetre() {
        float sum = 0;
        for ( Figure figure : figures )
            sum += figure.perimetre();
        return sum;
    }

    @Override
    public float surface() {
        float sum = 0;
        for ( Figure figure : figures )
            sum += figure.surface();
        return sum;
    }

    @Override
    public void dessiner() {
        System.out.println("------Groupe------");
        for ( Figure figure : figures )
            figure.dessiner();
        System.out.println("------------------");
    }

    public void addFigure(Figure figure){
        figures.add(figure);
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
