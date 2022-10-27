package filter.adapter;

import filter.FilterImplNonStandard;
import filter.Filter;

public class FilterAdapter implements Filter {
    private FilterImplNonStandard filterNonStandard = new FilterImplNonStandard();
    @Override
    public int[] filter(int[] data) {
        return filterNonStandard.appliquerFiltre("", data);
    }
}
