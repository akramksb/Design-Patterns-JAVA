package ma.enset.frameWork.classDiagram.entities;

import java.util.ArrayList;
import java.util.List;

public class ClassGroup extends ClassComposite{
    private List<ClassComposite> classCompositeList = new ArrayList<>();

    public ClassGroup(List<ClassComposite> classCompositeList) {
        this.classCompositeList = classCompositeList;
    }
}
