package legoset;

import java.time.Year;

public class LegoSet {

    private Year year;
    private int pieces;
    private enum packaging {BOX, POLYBAG};
    private java.util.Set<String> tags;
    private java.util.List<Minifig> minifigs;

}
