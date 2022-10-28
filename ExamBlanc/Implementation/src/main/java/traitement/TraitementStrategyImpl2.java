package traitement;

import Figures.Figure;

import java.util.List;

public class TraitementStrategyImpl2 implements TraitementStrategy {
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("Traitement 2");
    }
}
