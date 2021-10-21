package Sport;

import java.util.List;

public class Benutzer {

    private String vorName, nachName;
    private List<Sport> sportList;

    public Benutzer(String vorName, String nachName, List<Sport> sportList) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sportList = sportList;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSportList() {
        return sportList;
    }

    public void setSportList(List<Sport> sportList) {
        this.sportList = sportList;
    }

    /**
     * Macht die Summe aller Zeiten
     * @return sum
     */
    public double kalkuliereZeit(){
        double sum = 0;
        for (Sport i : sportList){
            sum += i.kalkuliereZeit();
        }
        return sum;
    }

    /**
     * Zuruckgibt die Zeit fur ein beliebiges Sport
     * @param s - Sport
     * @return - Zeit
     */
    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();
    }

    /**
     * Mach die Durschnittszeit fur alle LieblingsSporte
     * @return average
     */
    public double kalkuriereDurschnittszeit(){
        double avg = 0;
        for (Sport i : sportList){
            avg += i.kalkuliereZeit();
        }
        avg/=sportList.size();
        return avg;
    }

}
