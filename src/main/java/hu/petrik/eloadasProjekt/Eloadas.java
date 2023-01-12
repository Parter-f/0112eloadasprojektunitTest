package hu.petrik.eloadasProjekt;

import org.w3c.dom.ls.LSOutput;

public class Eloadas {

    private boolean[][] foglalasok;

    public Eloadas(int sorokSzama , int helyekSzama){

        if (sorokSzama < 1){
            throw new IllegalArgumentException("A sorokSzama paraméternek pozitívnak kell lennie");
        }
        if (helyekSzama < 1){
            throw new IllegalArgumentException("A helyekSzama paraméternek pozitívnak kell lennie");
        }
        this.foglalasok = new boolean[sorokSzama][helyekSzama];
    }
    public boolean lefoglal(){
        boolean sikerult = false;
        int i = 0;
       while(!sikerult && i < foglalasok.length){
           int j = 0;
           while(!sikerult && j < foglalasok[i].length){
               if (foglalasok[i][j]){
                   j++;
               }else{
                   foglalasok[i][j] = true;
                   sikerult = true;
               }
           }
           if (!sikerult){
               j++;

           }
       }
       return sikerult;
    }

    public int getSzabadhelyek(){

        throw new UnsupportedOperationException();
    }

    public boolean getTeli(){

        throw new UnsupportedOperationException();
    }

    public boolean foglalt(int sorSzam , int helySzam){

        throw new UnsupportedOperationException();
    }
}
