package Dokladne;

public class Plecak_Podzbiory {

    final static int N = 6; // liczba przedmiotów
    final static int MAX_V = 10; // maksymalna pojemność plecaka

    final static int[] OBJETOSCI_P = {6, 2, 3, 2, 3, 1}; // objętości przedmiotów
    final static int[] WARTOSCI_P = {6, 4, 5, 7, 10, 2}; // wartości przedmiotów

    public static void main(String[] args) {
        int[] tab = new int[N + 1]; // tablica do przechowywania obecnego podzbioru (0 lub 1)
        int najlepszaWartosc = 0;   // zmienna do przechowywania najlepszej wartości
        int[] najlepszyPodzbior = new int[N]; // tablica do przechowywania najlepszego podzbioru

        int s = (int) Math.pow(2, N); // liczba wszystkich podzbiorów

        // Iteracja po wszystkich możliwych podzbiorach
        for (int l = 0; l < s; l++) {
            // Generowanie kolejnego podzbioru
            int i = 0;
            do {
                if (tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);

            // Obliczanie wartości i objętości bieżącego podzbioru
            int obecnaWartosc = 0;
            int obecnaObjetosc = 0;

            for (int j = 0; j < N; j++) {
                if (tab[j] == 1) { // jeśli przedmiot j jest wybrany
                    obecnaObjetosc += OBJETOSCI_P[j];
                    obecnaWartosc += WARTOSCI_P[j];
                }
            }

            // Sprawdzenie, czy bieżący podzbiór jest lepszy niż najlepszy dotąd znaleziony
            if (obecnaObjetosc <= MAX_V && obecnaWartosc > najlepszaWartosc) {
                najlepszaWartosc = obecnaWartosc;

                // Zapamiętanie najlepszego podzbioru
                for (int j = 0; j < N; j++) {
                    najlepszyPodzbior[j] = tab[j];
                }
            }
        }

        // Wyświetlenie najlepszego rozwiązania
        System.out.println("Najlepsza wartość: " + najlepszaWartosc);
        System.out.print("Wybrane przedmioty: ");
        for (int j = 0; j < N; j++) {
            if (najlepszyPodzbior[j] == 1) {
                System.out.print((j + 1) + " ");
            }
        }
    }
}
