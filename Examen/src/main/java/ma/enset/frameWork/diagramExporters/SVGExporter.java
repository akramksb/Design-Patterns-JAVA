package ma.enset.frameWork.diagramExporters;

import ma.enset.frameWork.classDiagram.ClassDiagram;

public class SVGExporter implements DiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram) {
        System.out.println("SVG Export...");
    }
}
