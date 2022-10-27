import compresser.Compresser;
import compresser.CompresserImpl;
import filter.Filter;
import filter.FilterImpl;

public class Frame {
    private Filter filter = new FilterImpl();
    private Compresser compresser = new CompresserImpl();

    public int[] filter( int[] data ){
        return filter.filter(data);
    }

    public int[] compresser(int[] data) {
        return compresser.compresser(data);
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void setCompresser(Compresser compresser) {
        this.compresser = compresser;
    }
}
