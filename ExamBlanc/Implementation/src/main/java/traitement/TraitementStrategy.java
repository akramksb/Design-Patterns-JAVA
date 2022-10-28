package traitement;

import Figures.Figure;

import java.util.List;

public interface TraitementStrategy {
    void traiter(List<Figure> figures);
}
