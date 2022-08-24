import java.util.Scanner;

public class TrabalhoFinal {
    private String[][] palavras = new String[5][2];

    public TrabalhoFinal() {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("_____ Menu: Caça Palavras _____");;
            System.out.println("Opção 1: chama o método palavrasImprimir");
            System.out.println("Opção 2: chamar o método mapaImprimir;");
            System.out.println("Opção 3: chamar o método palavrasRepostas;");
            System.out.println("Opção 4: sair;");

            System.out.print(" __ opção: ");
            opcao = input.nextInt();
            
            palavrasEntrada();

            char mapa[][] = mapaEntrada();

            switch(opcao) {
                case 1:
                    palavrasImprimir();
                    break;
                case 2:
                    mapaImprimir(mapa);
                    break;
                case 3:
                    mapaPesquisa(mapa);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Errada!...");
            }

        } while (opcao != 4);

        input.close();
    }

    public void palavrasEntrada() {
        palavras[0][0] = "IFELSE";  
        palavras[1][0] = "FORA";  
        palavras[2][0] = "WHILE";  
        palavras[3][0] = "OBJETO";  
        palavras[4][0] = "VETOR";
    }

    public char[][] mapaEntrada() {
        char[][] mapa = new char[10][5];
        mapa[ 0][ 0] = 'D';  mapa[ 0][ 1] = 'C';  mapa[ 0][ 2] = 'Q';  mapa[ 0][ 3] = 'W';  mapa[ 0][ 4] = 'E';
        mapa[ 1][ 0] = 'I';  mapa[ 1][ 1] = 'X';  mapa[ 1][ 2] = 'F';  mapa[ 1][ 3] = 'O';  mapa[ 1][ 4] = 'R';
        mapa[ 2][ 0] = 'F';  mapa[ 2][ 1] = 'F';  mapa[ 2][ 2] = 'R';  mapa[ 2][ 3] = 'G';  mapa[ 2][ 4] = 'F';
        mapa[ 3][ 0] = 'E';  mapa[ 3][ 1] = 'L';  mapa[ 3][ 2] = 'I';  mapa[ 3][ 3] = 'H';  mapa[ 3][ 4] = 'W';
        mapa[ 4][ 0] = 'L';  mapa[ 4][ 1] = 'S';  mapa[ 4][ 2] = 'F';  mapa[ 4][ 3] = 'O';  mapa[ 4][ 4] = 'U';
        mapa[ 5][ 0] = 'S';  mapa[ 5][ 1] = 'D';  mapa[ 5][ 2] = 'G';  mapa[ 5][ 3] = 'T';  mapa[ 5][ 4] = 'S';
        mapa[ 6][ 0] = 'E';  mapa[ 6][ 1] = 'J';  mapa[ 6][ 2] = 'H';  mapa[ 6][ 3] = 'E';  mapa[ 6][ 4] = 'T';
        mapa[ 7][ 0] = 'I';  mapa[ 7][ 1] = 'I';  mapa[ 7][ 2] = 'I';  mapa[ 7][ 3] = 'J';  mapa[ 7][ 4] = 'M';
        mapa[ 8][ 0] = 'X';  mapa[ 8][ 1] = 'C';  mapa[ 8][ 2] = 'K';  mapa[ 8][ 3] = 'B';  mapa[ 8][ 4] = 'G';
        mapa[ 9][ 0] = 'E';  mapa[ 9][ 1] = 'E';  mapa[ 9][ 2] = 'T';  mapa[ 9][ 3] = 'O';  mapa[ 9][ 4] = 'R';

        return mapa;
    }

    public void palavrasImprimir() {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i][0]);
        }
    }

    public void mapaImprimir(char[][] mapa) {
        String print = "";

        for (int i = 0; mapa.length > i; i++) {
            for (int j = 0; mapa[0].length > j; j++) {
                if ((mapa[0].length - 1) == j) {
                    print += " | " + mapa[i][j] + " |";
                } else {
                    print += " | " + mapa[i][j];
                }
            }
            System.out.println(print);
            print = "";
        }
    }

    public void mapaPesquisa(char[][] mapa) {

        for (int i = 0; i < palavras.length; i++) {
            if (!pesquisaHorizontal(mapa, palavras[i][0].toUpperCase(), i)) {
                palavrasRespostas(i);
            } else if (!pesquisaHorizontalInvertida(mapa, palavras[i][0].toUpperCase(), i)) {
                palavrasRespostas(i);
            } else if (!pesquisaVertical(mapa, palavras[i][0].toUpperCase(), i)) {
                palavrasRespostas(i);
            } else if (!pesquisaVerticalInvertida(mapa, palavras[i][0].toUpperCase(), i)) {
                palavrasRespostas(i);
            } else {
                palavrasRespostas(i);
            }
        }   
    }

    public boolean pesquisaVertical(char[][] mapa, String palavra, int posicaoI) {
        int qtdPalavra = palavra.length();
        int qtd = 0;
        int posicaoLocal = 0;

        for (int i = 0; i < mapa[0].length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                if (qtdPalavra == qtd) {
                    break;
                }
                if (mapa[j][i] == palavra.charAt(qtd)) {
                    if (qtd == 0) {
                        posicaoLocal = j;
                    }
                    qtd++;
                } else {
                    qtd = 0;
                }
            }

            if (qtdPalavra == qtd) {
                palavras[posicaoI][1] = "[" + posicaoLocal + ", " + i + "] = " + palavra;
                return false;
            } else {
                palavras[posicaoI][1] = "Palavra NÃO encontrada " + palavra;
            }
        }

        return true;
    }

    public boolean pesquisaVerticalInvertida(char[][] mapa, String palavra, int posicaoI) {
        int qtdPalavra = palavra.length();
        int qtd = 0;
        int posicaoLocal = 0;

        for (int i = 0; i < mapa[0].length; i++) {
            for (int j = (mapa.length-1); j >= 0; j--) {
                if (qtdPalavra == qtd) {
                    break;
                }
                if (mapa[j][i] == palavra.charAt(qtd)) {
                    if (qtd == 0) {
                        posicaoLocal = j;
                    }
                    qtd++;
                } else {
                    qtd = 0;
                }
            }

            if (qtdPalavra == qtd) {
                palavras[posicaoI][1] = "[" + posicaoLocal + ", " + i + "] = " + palavra;
                return false;
            } else {
                palavras[posicaoI][1] = "Palavra NÃO encontrada " + palavra;
            }
        }

        return true;
    }

    public boolean pesquisaHorizontal(char[][] mapa, String palavra, int posicaoI) {
        int qtdPalavra = palavra.length();
        int qtd = 0;
        int posicaoLocal = 0;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                if (qtdPalavra == qtd) {
                    break;
                }
                if (mapa[i][j] == palavra.charAt(qtd)) {
                    if (qtd == 0) {
                        posicaoLocal = j;
                    }
                    qtd++;
                } else {
                    qtd = 0;
                }
            }

            if (qtdPalavra == qtd) {
                palavras[posicaoI][1] = "[" + i + ", " + posicaoLocal + "] = " + palavra;
                return false;
            } else {
                palavras[posicaoI][1] = "Palavra NÃO encontrada " + palavra;
            }
        }

        return true;
    }

    public boolean pesquisaHorizontalInvertida(char[][] mapa, String palavra, int posicaoI) {
        int qtdPalavra = palavra.length();
        int qtd = 0;
        int posicaoLocal = 0;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = (mapa[0].length-1); j >= 0; j--) {
                if (qtdPalavra == qtd) {
                    break;
                }
                if (mapa[i][j] == palavra.charAt(qtd)) {
                    if (qtd == 0) {
                        posicaoLocal = j;
                    }
                    qtd++;
                } else {
                    qtd = 0;
                }
            }

            if (qtdPalavra == qtd) {
                palavras[posicaoI][1] = "[" + i + ", " + posicaoLocal + "] = " + palavra;
                return false;
            } else {
                palavras[posicaoI][1] = "Palavra NÃO encontrada " + palavra;
            }
        }

        return true;
    }

    public void palavrasRespostas(int posicao) {
        System.out.println(palavras[posicao][1]);
    }
    
    public static void main(String[] args) {
        new TrabalhoFinal();
    }
}
