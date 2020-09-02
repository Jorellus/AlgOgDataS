package Kap1.DelKap2;


    // OPPGAVE 1.2.1- 1 OG 5

import java.util.Arrays;
import java.util.Random;

public class Tabell     // Samleklasse for tabellmetoder
    {
        private Tabell() {}   // privat standardkonstruktør - hindrer instansiering

        // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)
        public static void bytt(int[] a, int i, int j)
        {
            int temp = a[i]; a[i] = a[j]; a[j] = temp;
        }

        //Metoden bytt fra 1.2.2 oppgave 3. Samme som Programkode 1.1.8 d), men bruker char istede for int.
        public static void bytt(char[] c, int i, int j)
        {
            char temp = c[i]; c[i] = c[j]; c[j] = temp;
        }

        // Metoden skriv fra 1.2.2 oppgave 4 del 1
        public static void skriv(int[] a, int fra, int til){

            if (fra < 0 || til > a.length || fra >= til)
            {
                throw new IllegalArgumentException("Illegalt intervall!");
            }

            String ut = "";

            for (int i = fra; i < til; i++){

                if(i != til - 1){
                    ut+= a[i] + " ";
                }
                else{
                    ut+= a[i];
                }

            }

            System.out.print(ut);
        }

        //Metoden skriv fra 1.2.2 oppgave 4 del 2
        public static void skriv(int[] a){
            String ut = "";
            for(int i = 0;i<a.length;i++){
                if(i != a.length -1){
                    ut+= a[i] + " ";
                }
                else{
                    ut+= a[i];
                }
            }
            System.out.print(ut);
        }

        // Metoden skriv fra 1.2.2 oppgave 5 del 1
        public static void skrivln(int[] a, int fra, int til){

            if (fra < 0 || til > a.length || fra >= til)
            {
                throw new IllegalArgumentException("Illegalt intervall!");
            }

            String ut = "";

            for (int i = fra; i < til; i++){

                if(i != til - 1){
                    ut+= a[i] + " ";
                }
                else{
                    ut+= a[i];
                }

            }

            System.out.println(ut);
        }

        //Metoden skriv fra 1.2.2 oppgave 5 del 2
        public static void skrivln(int[] a){
            String ut = "";
            for(int i = 0;i<a.length;i++){
                if(i != a.length -1){
                    ut+= a[i] + " ";
                }
                else{
                    ut+= a[i];
                }
            }
            System.out.println(ut);
        }

        // Metoden randPerm(int n)                   Programkode 1.1.8 e)
        public static int[] randPerm(int n)  // en effektiv versjon
        {
            Random r = new Random();         // en randomgenerator
            int[] a = new int[n];            // en tabell med plass til n tall

            Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

            for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
            {
                int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
                bytt(a,k,i);                   // bytter om
            }

            return a;                        // permutasjonen returneres
        }

        // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)
        public static void randPerm(int[] a)  // stokker om a
        {
            Random r = new Random();     // en randomgenerator

            for (int k = a.length - 1; k > 0; k--)
            {
                int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
                bytt(a,k,i);
            }
        }



        // Metoden maks(int[] a, int fra, int til)// Programkode 1.2.1 b)
        public static int maks(int[] a, int fra, int til)
        {
            if (fra < 0 || til > a.length || fra >= til)
            {
                throw new IllegalArgumentException("Illegalt intervall!");
            }

            int m = fra;              // indeks til største verdi i a[fra:til>
            int maksverdi = a[fra];   // største verdi i a[fra:til>

            for (int i = fra + 1; i < til; i++)
            {
                if (a[i] > maksverdi)
                {
                    m = i;                // indeks til største verdi oppdateres
                    maksverdi = a[m];     // største verdi oppdateres
                }
            }

            return m;  // posisjonen til største verdi i a[fra:til>
        }

        // Metoden maks(int[] a)                     Programkode 1.2.1 c)

        public static int maks(int[] a)  // bruker hele tabellen
        {
            return maks(a,0,a.length);     // kaller metoden over
        }

        // min-metodene - se Oppgave 1 i Avsnitt 1.2.1:

        // programkode 1.2.1 b min-versjon
        public static int min(int[] a, int fra, int til)
        {
            if (fra < 0 || til > a.length || fra >= til)
            {
                throw new IllegalArgumentException("Illegalt intervall!");
            }

            int m = fra;              // indeks til største verdi i a[fra:til>
            int minverdi = a[fra];   // største verdi i a[fra:til>

            for (int i = fra + 1; i < til; i++)
            {
                if (a[i] < minverdi)
                {
                    m = i;                // indeks til største verdi oppdateres
                    minverdi = a[m];     // største verdi oppdateres
                }
            }

            return m;  // posisjonen til minste verdi i a[fra:til>
        }


        // programkode 1.2.1 c min-versjon
        public static int min(int[] a)
        {
            return min(a,0, a.length);
        }

        // programkode 1.2.3 a
        public static void fratilKontroll(int tablengde, int fra, int til)
        {
            if (fra < 0)                                  // fra er negativ
                throw new ArrayIndexOutOfBoundsException
                        ("fra(" + fra + ") er negativ!");

            if (til > tablengde)                          // til er utenfor tabellen
                throw new ArrayIndexOutOfBoundsException
                        ("til(" + til + ") > tablengde(" + tablengde + ")");

            if (fra > til)                                // fra er større enn til
                throw new IllegalArgumentException
                        ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
        }

        // programkode 1.2.3 d
        public static void vhKontroll(int tablengde, int v, int h)
        {
            if (v < 0)
                throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

            if (h >= tablengde)
                throw new ArrayIndexOutOfBoundsException
                        ("h(" + h + ") >= tablengde(" + tablengde + ")");

            if (v > h + 1)
                throw new IllegalArgumentException
                        ("v = " + v + ", h = " + h);
        }
    }


