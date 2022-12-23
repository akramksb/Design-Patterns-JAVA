package ma.enset.frameWork.codeGenerators;

import ma.enset.frameWork.classDiagram.ClassDiagram;

public interface CodeGenerator {
    String fromClassDiagram(ClassDiagram classDiagram);
}
