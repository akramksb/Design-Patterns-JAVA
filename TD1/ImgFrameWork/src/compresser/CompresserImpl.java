package compresser;

public class CompresserImpl extends Compresser {
    @Override
    public int getSegmentSize(int[] data) {
        return 5;
    }

    @Override
    public int getMeanValue(int start, int end, int[] data) {
        int avg;
        if ( start==end ) return 0;
        if ( end > data.length )
            end = data.length;
        avg = 0;
        for ( int i = start; i<end; i++ )
            avg += data[i];
        return avg/( end-start );
    }
}
