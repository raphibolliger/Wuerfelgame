
public class Spiel {

    private Wuerfel spieler1;
    private Wuerfel spieler2;
    private int runden;

    public Spiel(Wuerfel spieler1, Wuerfel spieler2, int runden){
        this.spieler1 = spieler1;
        this.spieler2 = spieler2;
        this.runden = runden;
    }

    public void spielen(){

        int win1 = 0;
        int win2 = 0;

        for (int i = 0; i < runden; i++){

            int sp1 = spieler1.wuerflen();
            int sp2 = spieler2.wuerflen();

            if (sp1 > sp2) win1++;
            if (sp1 < sp2) win2++;

        }

        System.out.println(win1 + " Würfel " + spieler1.getBezeichnung());
        System.out.println(win2 + " Würfel " + spieler2.getBezeichnung());

        if (win1 > win2) System.out.println("Würfel " + spieler1.getBezeichnung() + " gewinnt!");
        else System.out.println("Würfel " + spieler2.getBezeichnung() + " gewinnt!");

    }

    public static void main(String[] args){

        Wuerfel A = new Wuerfel("A",6,3,3,3,3,3);
        Wuerfel B = new Wuerfel("B",5,2,5,2,2,5);
        Wuerfel C = new Wuerfel("C",1,4,4,4,4,4);

        Spiel spiel = new Spiel(A, C, 100);
        spiel.spielen();

    }

}
