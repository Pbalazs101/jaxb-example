package legoset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.time.Year;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {

    private int number;
    private String name;
    private String theme;
    private String subtheme;

    private Year year;
    private int pieces;
    private enum packaging {BOX, POLYBAG};

    private java.util.Set<String> tags;
    private java.util.List<Minifig> minifigs;

    private float rating;

}
