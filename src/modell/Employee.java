
package modell;

public class Employee {
    String nev;
    String telepules;
    String cim;
    String szuletesiDatum;
    int fizetes;
    
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTelepules() {
        return telepules;
    }
    
    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzuletesiDatum() {
        return szuletesiDatum;
    }

    public void setSzuletesiDatum(String szuletesiDatum) {
        this.szuletesiDatum = szuletesiDatum;
    }

    public int getFizetes() {
        return fizetes;
    }
    
    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }

}
