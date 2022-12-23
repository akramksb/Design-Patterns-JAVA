package ma.enset.frameWork.LegacyAdapters;

import ma.enset.frameWork.classDiagram.ClassDiagram;
import ma.enset.frameWork.codeGenerators.CodeGenerator;

public class LegacyGenAdapter implements CodeGenerator {
    private LegacyCodeGenerator legacyCodeGenerator = new LegacyCodeGenerator();
    @Override
    public String fromClassDiagram(ClassDiagram classDiagram) {
        return legacyCodeGenerator.genrateCode(classDiagram, "java");
    }
}
