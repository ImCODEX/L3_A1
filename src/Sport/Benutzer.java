package Sport;

import java.util.ArrayList;
import java.util.List;

public class Benutzer {

    private String vorName, nachName;
    private List<Sport> sportList;

    public Benutzer(String vorName, String nachName, List<Sport> sportList) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sportList = sportList;
    }

    
}
