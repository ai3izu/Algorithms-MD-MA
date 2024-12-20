package Test;

public class PL_AZ {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {
        int sumaWartosci = 0;
        int sumaObjetosci = 0;
        String przedmiot = " Przedmioty : ";
        int liczbaSpakowanych = 0;

        boolean[] czySpakowany = new boolean[N];

        while (true){
            int maxWartosc = 0;
            int indexPrzedmiotu = -1;
            for (int i = 0; i < N; i++) {
                if (
                        WARTOSCI_P[i] > maxWartosc &&
                        !czySpakowany[i] &&
                        sumaObjetosci + OBJETOSCI_P[i] <= MAX_V
                ){
                    maxWartosc = WARTOSCI_P[i];
                    indexPrzedmiotu = i;
                }
            }
            if(indexPrzedmiotu == -1){
                break;
            }else {
                czySpakowany[indexPrzedmiotu] = true;
                sumaWartosci += WARTOSCI_P[indexPrzedmiotu];
                sumaObjetosci += OBJETOSCI_P[indexPrzedmiotu];
                przedmiot += " P" + (indexPrzedmiotu + 1) + " ";
                liczbaSpakowanych++;
            }
        }
        System.out.println("Wykorzystana objetosc plecaka : " + sumaObjetosci + "/" + MAX_V);
        System.out.println("Laczna wartosc : " + sumaWartosci);
        System.out.println("Liczba przedmiotow -> " + liczbaSpakowanych + " ||  wybrane " + przedmiot);
    }
}
