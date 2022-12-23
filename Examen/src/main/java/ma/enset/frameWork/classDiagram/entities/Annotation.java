package ma.enset.frameWork.classDiagram.entities;

import ma.enset.frameWork.classDiagram.Property;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Entity{
    List<Property> properties = new ArrayList<>();

    public Annotation(List<Property> properties) {
        this.properties = properties;
    }
}
