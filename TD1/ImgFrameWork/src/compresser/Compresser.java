package compresser;

public abstract class Compresser {
    public int[] compresser(int[] data) {
        int segmentSize = getSegmentSize( data );
        int numOfSegments = data.length/segmentSize + ((data.length%segmentSize==0)?0:1);
        int[] compressed = new int[numOfSegments];
        for ( int i=0; i< numOfSegments; i++ ){
             int compressedSeg = getMeanValue( i*segmentSize, (i+1)*segmentSize, data);
             compressed[i] = compressedSeg;
        }
        return compressed;
    }
    public abstract int getSegmentSize(int[] data);
    public abstract int getMeanValue( int start, int end, int[] data );
}
