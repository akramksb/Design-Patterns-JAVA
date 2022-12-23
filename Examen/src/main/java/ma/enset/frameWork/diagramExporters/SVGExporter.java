package ma.enset.frameWork.diagramExporters;

import ma.enset.frameWork.classDiagram.ClassDiagram;

public class BinaryExporter implements DiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram) {
        System.out.println("Binary Export...");
    }
}
