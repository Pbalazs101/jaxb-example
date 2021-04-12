package legoset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

import java.time.Year;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"number","url","name", "theme", "subtheme", "year", "pieces", "packaging", "tags", "minifigs", "ratings"})
@Data
public class LegoSet {

    private int number;
    private String url;
    private String name;
    private String theme;
    private String subtheme;


    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    private enum packaging {BOX, POLYBAG};

    private java.util.Set<String> tags;
    private java.util.List<Minifig> minifigs;

    private Ratings ratings;

}
