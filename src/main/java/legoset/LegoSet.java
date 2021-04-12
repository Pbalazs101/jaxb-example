package legoset;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

import java.time.Year;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder= {"number","url","name", "theme", "subtheme", "year", "pieces", "packaging", "tags", "minifigs", "rating"})
@Data
public class LegoSet {

    @XmlAttribute
    private int number;

    @XmlAttribute
    private String url;

    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    protected enum wrap {BOX, POLYBAG};
    private wrap packaging;


    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private java.util.Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private java.util.List<Minifig> minifigs;

    public Ratings rating;

}
