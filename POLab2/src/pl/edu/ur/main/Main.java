package pl.edu.ur.main;

/**
 *
 * @author marcin
 */
import java.util.Scanner;

public class Main {
    private static void zadanie3(){
        Scanner scanner = new Scanner(System.in);
        Double[] tablica = new Double[10];
        int operacja = 1;
        System.out.println("Podaj 10 liczb do tablicy:");
        for (int i=0; i<10; i++){
            System.out.print("Podaj wartosc " + (i+1) + ". elementu tablicy: ");
            tablica[i] = scanner.nextDouble();
        }
        
        do {
            System.out.println("Wybierz operacje: ");
            System.out.println("[ 1 ] Wyswietlanie tablicy od pierwszego do ostatniego indeksu");
            System.out.println("[ 2 ] Wyswietlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("[ 3 ] Wysletlanie elementow tablicy o nieparzystych indeksach");
            System.out.println("[ 4 ] Wyswietlanie elementow tablicy o parzystych indeksach");
            System.out.println("[ 0 ] Cofnij");
            System.out.print("-> ");
            operacja = scanner.nextInt();
            
            if (operacja == 1){
            System.out.print("Wyswietlam zawartosc tablicy od pierwszego do ostatniego indeksu: ");
                for (int i=0; i<10; i++){
                    System.out.print(tablica[i] + " ");
                }
            }else if (operacja == 2){
                System.out.print("Wyswietlam zawartosc tablicy od ostatniego do pierwszego indeksu: ");
                for (int i=9;i>=0;i--){
                    System.out.print(tablica[i] + " ");
                }
            }else if (operacja == 3){
                System.out.print("Wyswietlam elementy tablicy o indeksach nieparzystych: ");
                for (int i=1;i<10;){
                    System.out.print(tablica[i] + " ");
                    i = i + 2;
                }
            }else if (operacja == 4){
                System.out.print("Wyswietlam elementy tablicy o indeksach parzystych: ");
                for (int i=0;i<10;) {
                    System.out.print(tablica[i] + " ");
                    i = i + 2;
                }
            }else System.out.println("Nieprawidlowa opcja");
        }while (operacja != 0);
        
        
    }
    
    private static void zadanie4(){
        Scanner scanner = new Scanner(System.in);
        Double[] tablica = new Double[10];
        
        System.out.println("Podaj 10 liczb do tablicy:");
        for (int i=0; i<10; i++){
            System.out.print("Podaj wartosc " + (i+1) + ". elementu tablicy: ");
            tablica[i] = scanner.nextDouble();
        }
        
        System.out.println("Wybierz operacje:");
        System.out.println("[ 1 ] Oblicz sume elementow tablicy");
        System.out.println("[ 2 ] Oblicz iloczyn elementow tablicy");
        System.out.println("[ 3 ] Wyznacz wartosc srednia");
        System.out.println("[ 4 ] Wyznacz wartosc minimalna");
        System.out.println("[ 5 ] Wyznacz wartosc maksymalna");
        System.out.print("-> ");
        int operacja = scanner.nextInt();
        
        switch (operacja){
            case 1:
                double suma = 0;
                for (int i=0;i<10;i++){
                    suma = suma + tablica[i];
                }
                System.out.println("Suma elementow tablicy wynosi: " + suma);
                break;
            case 2:
                double iloczyn = 1;
                for (int i=0;i<10;i++){
                    iloczyn = iloczyn * tablica[i];
                }
                System.out.println("Iloczyn elementow tablicy wynosi: " + iloczyn);
                break;
            case 3:
               double sumaSr = 0;
                for (int i=0;i<10;i++){
                    sumaSr = sumaSr + tablica[i];
                }
                System.out.println("Srednia elementow tablicy wynosi: " + (sumaSr / 10));
                break;
            case 4:
                double min = 0;
                for (int i=0;i<10;i++){
                    if (min>tablica[i]) min = tablica[i];
                }
                System.out.println("Minimalna wartosc elementow tablicy wynosi: " + min);
                break;
            case 5:
                double max = 0;
                for (int i=0;i<10;i++){
                    if (max<tablica[i]) max = tablica[i];
                }
                System.out.println("Maksymalna wartosc elementow tablicy wynosi: " + max);
                break;
            default: System.out.println("Nieprawidlowa opcja");
        }
    }

    private static void zadanie6(){
        Scanner scanner = new Scanner(System.in);
        int liczba;
        
        while (true){
            System.out.print("Podaj liczbe calkowita: ");
            liczba = scanner.nextInt();
            if (liczba < 0) break;
        }
    }
    
    private static void zadanie7(){
        Scanner scanner = new Scanner(System.in);
        int n;
        int zmiany = 1;
        int temp;
        
        System.out.print("Ile liczb chcesz wprowadzic?: ");
        n = scanner.nextInt();
        
        int[] tablica = new int[n];
        
        for (int i=0;i<n;i++){
            System.out.print("Podaj wartosc " + (i + 1) + ". elementu tablicy: ");
            tablica[i] = scanner.nextInt();
        }
        
        while(zmiany > 0){
            zmiany = 0;
            for (int i=0;i<n-1;i++){
                if(tablica[i] > tablica[i+1]){
                    temp = tablica[i+1];
                    tablica[i+1] = tablica[i];
                    tablica[i] = temp;
                    zmiany++;
                }
            }
        }
        
        System.out.print("Posortowana tablica: ");
        for (int i=0;i<n;i++){
            System.out.print(tablica[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcja = 1;
        
        
        while (opcja != 0){
            System.out.println("\nWybierz opcje:");
            System.out.println("[ 3 ] Zadanie 3");
            System.out.println("[ 4 ] Zadanie 4");
            System.out.println("[ 6 ] Zadanie 6");
            System.out.println("[ 7 ] Zadanie 7");
            System.out.println("[ 0 ] Koniec");
            System.out.print("-> ");
            opcja = scanner.nextInt();
            
            switch (opcja){
                case 3: zadanie3(); break;
                case 4: zadanie4(); break;
                case 6: zadanie6(); break;
                case 7: zadanie7(); break;
                case 0: break;
                default: System.out.println("Nieprawidlowa opcja");
            }
        }
    }
}