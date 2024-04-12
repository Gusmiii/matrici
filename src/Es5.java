public class Es5 {
    public static void main(String[] args) {
        int[][] maQuad = {
                {4, 5, 11},
                {9, 6, 111},
                {90, 69, 91}
        };
        int[] risultato = sommaR(maQuad);
        for (int i = 0; i < risultato.length; i++) {
            System.out.println("somma della riga #" + (i + 1) + " è: " + risultato[i]);
        }
    }
    public static int[] sommaR(int[][] maQuad) {
        int[] somme = new int[maQuad.length];
        for (int i = 0; i < maQuad.length; i++) {
            int somma = 0;
            for (int j = 0; j < maQuad[i].length; j++) {
                somma += maQuad[i][j];
            }
            somme[i] = somma;
        }
        return somme;
    }
}