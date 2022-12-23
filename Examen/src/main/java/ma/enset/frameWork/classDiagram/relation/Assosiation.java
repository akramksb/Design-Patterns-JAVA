package ma.enset.frameWork.classDiagram.relation;

import ma.enset.frameWork.classDiagram.entities.Class;
import ma.enset.frameWork.classDiagram.entities.Entity;

public class Assosiation extends Relation{
    private Class src;
    private Entity dest;
    private Cardinality[] cardSrc = new Cardinality[2];
    private Cardinality[] cardDest = new Cardinality[2];
    private boolean isBidirectional;
}
