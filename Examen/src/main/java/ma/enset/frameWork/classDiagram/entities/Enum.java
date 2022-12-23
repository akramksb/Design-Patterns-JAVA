package ma.enset.frameWork.classDiagram.entities;

import ma.enset.frameWork.classDiagram.Value;

import java.util.ArrayList;
import java.util.List;

public class Enum extends Entity{
    private List<Value> values = new ArrayList<>();

    public Enum(List<Value> values) {
        this.values = values;
    }
}
