//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Playlist {
    public static int Aantalnummers;
    public static int Totaleplaylistduur;
    static ArrayList<String> Track = new ArrayList();
    static ArrayList<Integer> Speelduur = new ArrayList();
    static Scanner scan;

    public Playlist() {
    }

    public static void main(String[] args) {
        PrintPersonalia();
        GetAantalnummers();
        System.out.println(Track);
        System.out.println(Speelduur);
        LangsteTrack();
        Alletracks();
    }

    static void PrintPersonalia() {
        System.out.println(" Voornaam: Abdel\n Achternaam: Fenich\n Studentennummer: 500503246 ");
    }

    static int GetAantalnummers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Voer het aantal nummers in");
        if (scan.hasNextInt()) {
            Aantalnummers = scan.nextInt();
        }

        if (Aantalnummers > 1 && Aantalnummers <= 20) {
            System.out.println("Uw kunt nu " + Aantalnummers + " tracks invoeren");
            VoerTrackIn();
        } else {
            System.out.println("Uw heeft een ongeldige invoer gedaan, probeer het opnieuw");
            GetAantalnummers();
        }

        return Aantalnummers;
    }

    static void VoerTrackIn() {
        for(int i = 1; i <= Aantalnummers; ++i) {
            System.out.println("Voer hier track " + i + " in");
            if (scan.hasNext()) {
                Track.add(scan.next());
            }

            System.out.println("Voer de trackduur aan in seconden");
            if (scan.hasNextInt()) {
                Speelduur.add(scan.nextInt());
            }
        }

    }

    static void LangsteTrack() {
        System.out.println(Collections.max(Speelduur));
        int Langestracknummer = Speelduur.indexOf(Collections.max(Speelduur));
        System.out.println("De track met de langste speelduur is tracknummer " + Langestracknummer);
        System.out.println("De naam van deze track is: " + (String)Track.get(Langestracknummer));
        System.out.println("De speelduur van deze track is: " + Speelduur.get(Langestracknummer) + " seconden");
    }

    static void Alletracks() {
        System.out.println("\nAlle tracks in de playlist worden hieronder getoond");
        PrintEenlijn();
        System.out.printf("%-15s %15s %n", "Tracknaam", "Trackduur");
        PrintEenlijn();

        for(int i = 0; i < Aantalnummers; ++i) {
            Totaleplaylistduur += Speelduur.get(i);
            System.out.printf("%-15s %10s %n", Track.get(i), Speelduur.get(i));
        }

        PrintEenlijn();
        System.out.println("De totale duur van de playlist is: " + Totaleplaylistduur + " seconden");
    }

    public static void PrintEenlijn() {
        for(int a = 0; a <= 40; ++a) {
            System.out.print("-");
        }

        System.out.println();
    }

    static {
        scan = new Scanner(System.in);
    }
}
