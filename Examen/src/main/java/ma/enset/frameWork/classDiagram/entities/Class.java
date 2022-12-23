package ma.enset.frameWork.classDiagram.entities;

import ma.enset.frameWork.classDiagram.Attribut;
import ma.enset.frameWork.classDiagram.Method;

import java.util.ArrayList;
import java.util.List;

public class Class extends ClassComposite{
    private boolean isPublic;
    private boolean isAbstract;
    private boolean isStatic;
    private boolean isFinal;
    private List<Attribut> attributs = new ArrayList<>();
    private List<Method> methods = new ArrayList<>();

    public Class(boolean isPublic, boolean isAbstract, boolean isStatic, boolean isFinal, List<Attribut> attributs, List<Method> methods) {
        this.isPublic = isPublic;
        this.isAbstract = isAbstract;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.attributs = attributs;
        this.methods = methods;
    }

    public void setAttributs(List<Attribut> attributs) {
        this.attributs = attributs;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<Attribut> getAttributs() {
        return attributs;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public boolean isFinal() {
        return isFinal;
    }
}
