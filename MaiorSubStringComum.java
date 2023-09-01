public class MaiorSubStringComum {
    public static void main(String[] args) {
        char[] firstWord = "blue".toCharArray();
        char[] secondWord = "clues".toCharArray();
        int maiorSubString = 0;

        int[][] celula = new int[firstWord.length][secondWord.length];

        for (int i = 0; i < firstWord.length; i++) {
            for (int j = 0; j < secondWord.length; j++) {
                if (firstWord[i] == secondWord[j]) {
                    celula[i][j] = 1 + (i == 0 && j == 0 ? 0 : celula[i - 1][j - 1]);
                    maiorSubString += 1;
                } else {
                    celula[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < firstWord.length; i++) {
            for (int j = 0; j < secondWord.length; j++) {
                System.out.print(celula[i][j]);
            }
            System.out.println();
        }

        System.out.println(maiorSubString);

    }
}