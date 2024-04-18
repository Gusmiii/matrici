public class es6 {
    public static void main(String[] args) {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] vettore = new int[matrice[0].length];
        sommmaColonne(matrice, vettore);
        for (int i = 0; i < vettore.length; i++) {
            System.out.println(vettore[i]);
        }
    }
    public static void sommmaColonne(int[][] matrice, int[] vettore) {
        int righe = matrice.length;
        int colonne = matrice[0].length;

        for (int j = 0; j < colonne; j++) {
            int somma = 0;
            for (int i = 0; i < righe; i++) {
                somma += matrice[i][j];
            }
            vettore[j] = somma;
        }
    }
}