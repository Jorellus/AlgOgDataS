package Kap1.DelKap2;

public class Program {

    public static void main(String ... args)      // hovedprogram
    {

        int[] a= {15,8,21,16,5,19,7,23,10,14,3,11,6,17,4};
        Tabell.utvalgssortering(a);
        Tabell.skriv(a);

        /* Kall og test for oppg 1.3.4 2
        int[] a = {7,5,9,2,10,4,1,8,6,3};     // en usortert heltallstabell
        Tabell.utvalgssortering(a);           // stigende sortering
        Tabell.snu(a);                        // tabellen snus
        Tabell.skriv(a);                      // 10 9 8 7 6 5 4 3 2 1
         */

        /* Kall og test for oppg 1.3.1 2
        int[] a = {2,6,5,4,3,1};
        Tabell.nestePermutasjon(a);
        Tabell.skriv(a);
        */

        /* Kall og test for oppg 1.3.1 3
        int[] a = {3,1,4,9,7,10,8,6,5,2};

        for (int i = 0; i < 10; i++)
        {
            Tabell.nestePermutasjon(a);
            Tabell.skrivln(a);
        } */
    } // main
}
