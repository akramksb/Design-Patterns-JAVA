package ma.enset.frameWork.classDiagram.entities;

import ma.enset.frameWork.classDiagram.Attribut;
import ma.enset.frameWork.classDiagram.Method;

import java.util.List;

public class Record extends Class{
    public Record(boolean isPublic, boolean isAbstract, boolean isStatic, boolean isFinal, List<Attribut> attributs, List<Method> methods) {
        super(isPublic, isAbstract, isStatic, isFinal, attributs, methods);
    }
}
