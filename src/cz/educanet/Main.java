package cz.educanet;

public class Main {

    public static void main(String[] args) {

        String vstup = "((djdjdjd)))";

        zavorky(vstup);


    }

    // TODO non oop way of gerland
    public static int gerland(String word) {
        return -1;
    }

    // TODO non oop way of disemvoweler
    public static DissVow disemvoweler(String str) {

        DissVow result = new DissVow("twdrmsndcym","aoai");
        return result;
    }



    public static boolean isDiss(char c){
        String diss = "bcdfghjklmnpqrstvwxyz";
        return isInString(c, diss);

    }
    public static boolean isVow(char c){
        String diss = "aeiou";
        return isInString(c, diss);

    }


    public static boolean isInString(char c, String diss) {
        int index = diss.indexOf( "" + c);
        return index >= 0;
    }


    public static boolean zavorky (String vstup){
        if(vstup == ""){
            System.out.println("Neni vstup");
            return false;
        }
        int pocetOteviracichZavorek = 0;
        int pocetZaviracichZavorek = 0;

        char [] vstupPole = vstup.toCharArray();

        for (int i=0;i<vstup.length();i++){
            if (vstupPole[i] == '('){
                pocetOteviracichZavorek++;
            }
            if(vstupPole[i] == ')'){
                pocetZaviracichZavorek++;

            }
        }

        if (pocetOteviracichZavorek == pocetZaviracichZavorek){
            return true;
        }else if(pocetOteviracichZavorek<pocetZaviracichZavorek){
            System.out.println("Nektera oteviraci zavorka chybi");
            return false;
        }else if (pocetOteviracichZavorek>pocetZaviracichZavorek){
            System.out.println("Nektera zaviraci zavorka chybi");
            return false;
        }

        return false;
    }


    // TODO non oop way of balance
    public static boolean balance(String str) {
        return false;
    }
}
