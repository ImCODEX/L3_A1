package Sport;

import java.util.List;

public class Benutzer {

    private String vorname, nachname;
    private List<Sport> sportList;

    public Benutzer(String vorname, String nachname, List<Sport> sportList) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.sportList = sportList;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
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
    public double kalkuliereDurschnittszeit(){
        double avg = 0;
        for (Sport i : sportList){
            avg += i.kalkuliereZeit();
        }
        avg/=sportList.size();
        return avg;
    }

}
