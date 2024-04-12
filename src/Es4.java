public class Es4 {
    public static void main(String[] args) {
        int[][] maQuad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        trasporta(maQuad);
        for (int i = 0; i < maQuad.length; i++) {
            for (int j = 0; j < maQuad[0].length; j++) {
                System.out.print(maQuad[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void trasporta(int[][] maQuad) {
        int n = maQuad.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = maQuad[i][j];
                maQuad[i][j] = maQuad[j][i];
                maQuad[j][i] = temp;
            }
        }
    }
}