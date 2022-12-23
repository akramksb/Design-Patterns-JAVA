package ma.enset.frameWork.classDiagram;

import ma.enset.frameWork.attributObserver.Observable;
import ma.enset.frameWork.attributObserver.Observer;

import java.util.List;

public class Attribut implements Observable {
    private String name;
    private String type;
    private boolean isStatic;
    private boolean isFinal;
    private Visibility visibility;
    private List<Observer> observers;

    @Override
    public void notifyObserver() {

    }
}
