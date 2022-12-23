package ma.enset.frameWork.codeGenerators;

import ma.enset.frameWork.classDiagram.ClassDiagram;

public class JavaCodeGenerator implements CodeGenerator {
    @Override
    public String fromClassDiagram(ClassDiagram classDiagram) {
        return "java impl";
    }
}
