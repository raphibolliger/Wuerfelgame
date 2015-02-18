
public class Wuerfel {

    private String bezeichnung;
    private int[] zahlen;

    public Wuerfel(String bezeichnung, int oben, int unten, int links, int rechts, int vorne, int hinten) {


        this.bezeichnung = bezeichnung;

        zahlen = new int[6];

        zahlen[0] = oben;
        zahlen[1] = unten;
        zahlen[2] = links;
        zahlen[3] = rechts;
        zahlen[4] = vorne;
        zahlen[5] = hinten;

    }

    public String getBezeichnung(){
        return bezeichnung;
    }

    public int wuerflen(){
        return zahlen[(int) (Math.random() * (6 - 0) + 0)];
    }


}
