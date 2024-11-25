package Dokladne;

public class PLECAK_BF {
    final static int N = 6; // <- liczba przedmiotow w plecaku
    final static int MAX_V = 10; // <- objetosc plecka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // <- objetosci przedmitow
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // <- wartosci przedmiotow

    public static void main(String[] args) {
        int sumaWartosci = 0;
        int[] najlepszyPodzbior = new int[N];
        int sumaObjetosci = 0;

        for (int p1 = 0; p1 <= 1; p1++) {
            for (int p2 = 0; p2 <= 1; p2++) {
                for (int p3 = 0; p3 <= 1; p3++) {
                    for (int p4 = 0; p4 <= 1; p4++) {
                        for (int p5 = 0; p5 <= 1; p5++) {
                            for (int p6 = 0; p6 <= 1; p6++) {
                                int obecnaWartosc = 0;
                                int obecnaObjetosc = 0;

                                if (p1 == 1) {
                                    obecnaObjetosc += OBJETOSCI_P[0];
                                    obecnaWartosc += WARTOSCI_P[0];
                                }
                                if (p2 == 1) {
                                    obecnaObjetosc += OBJETOSCI_P[1];
                                    obecnaWartosc += WARTOSCI_P[1];
                                }
                                if (p3 == 1) {
                                    obecnaObjetosc += OBJETOSCI_P[2];
                                    obecnaWartosc += WARTOSCI_P[2];
                                }
                                if (p4 == 1) {
                                    obecnaObjetosc += OBJETOSCI_P[3];
                                    obecnaWartosc += WARTOSCI_P[3];
                                }
                                if (p5 == 1) {
                                    obecnaObjetosc += OBJETOSCI_P[4];
                                    obecnaWartosc += WARTOSCI_P[4];
                                }
                                if (p6 == 1) {
                                    obecnaObjetosc += OBJETOSCI_P[5];
                                    obecnaWartosc += WARTOSCI_P[5];
                                }
                                if (obecnaObjetosc <= MAX_V && obecnaWartosc > sumaWartosci) {
                                    sumaWartosci = obecnaWartosc;
                                    sumaObjetosci = obecnaObjetosc;
                                    najlepszyPodzbior[0] = p1;
                                    najlepszyPodzbior[1] = p2;
                                    najlepszyPodzbior[2] = p3;
                                    najlepszyPodzbior[3] = p4;
                                    najlepszyPodzbior[4] = p5;
                                    najlepszyPodzbior[5] = p6;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Najlepsza wartosc " + sumaWartosci);
        System.out.println(sumaObjetosci + "/" + MAX_V + " objetosc zluzyta");
        System.out.println("Wybrane przedmioty ");
        for (int i = 0; i < N; i++) {
            if (najlepszyPodzbior[i] == 1) {
                System.out.print("p" + (i + 1) + " ");
            }
        }
    }
}

