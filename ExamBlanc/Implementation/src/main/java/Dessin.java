import Figures.Figure;
import traitement.TraitementStrategy;
import traitement.TraitementStrategyImpl;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> figureList = new ArrayList<>();
    private TraitementStrategy traitementStrategy = new TraitementStrategyImpl();

    public void traiter(){
        traitementStrategy.traiter(figureList);
    }
    public void dessiner(){
        for (Figure figure: figureList)
            figure.dessiner();
    }
    public void addFigure(Figure figure){
        figureList.add(figure);
    }
    public void removeFigure(Figure figure){
        figureList.remove(figure);
    }

    public void setTraitementStrategy(TraitementStrategy traitementStrategy) {
        this.traitementStrategy = traitementStrategy;
    }
}
