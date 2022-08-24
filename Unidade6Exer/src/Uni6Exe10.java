import java.util.Scanner;

public class Uni6Exe10 {
    public Uni6Exe10() {
        int numero;
        int valor = 0;
        int vetor[] = new int[50];
        int qtdVetor = 0;
        boolean vetorCheio = false;

        Scanner input = new Scanner(System.in);

        do {
            valor = input(input);

            if (qtdVetor >= 50) {
                System.out.println("Vetor Cheio!");
                vetorCheio = true;
            }

            switch (valor) {
                case 1:
                    if (!vetorCheio) {
                        System.out.print("Digite o vetor a ser adicionado: ");
                        numero = input.nextInt();

                        vetor = incluir(input, vetor, qtdVetor, numero);
                        output(1);
                        qtdVetor++;
                    }
                    break;
                case 2:    
                    System.out.print("Digite o número a ser buscado: ");
                    numero = input.nextInt();

                    boolean valorEncontrado = pesquisarVetor(input, vetor, qtdVetor, numero);
                    if (valorEncontrado) {
                        output(2);
                    } else {
                        output(3);
                    }
                    break;
                case 3:
                    System.out.print("Digite o número velho: ");
                    int oldNumber = input.nextInt();
            
                    System.out.print("Digite o número novo: ");
                    int newNumber = input.nextInt();

                    vetor = alterarVetor(input, vetor, qtdVetor, oldNumber, newNumber);
                    break;
                case 4:
                    System.out.print("Digite o número que será deletado: ");
                    numero = input.nextInt();

                    int novaQtd = encontarElemento(vetor, qtdVetor, numero);

                    if (novaQtd == 0) {
                        output(3);
                    } else {
                        vetor = deletarElemento(vetor, qtdVetor, novaQtd, numero);
                        qtdVetor -= novaQtd;
                    }
                    break;
                case 5:
                    mostarVetor(vetor, qtdVetor);
                    break;
                case 6:
                    vetor = ordenarVetor(vetor, qtdVetor);
                    break;
                case 7:
                    vetor = inverterVetor(vetor, qtdVetor);
                    break;
            }    
            System.out.println("");

        } while (valor != 8);

        input.close();
    }

    public int[] deletarElemento(int[] vetor, int qtdVetor, int novaQtd, int numero) {
        for (int i = 0; i < qtdVetor; i++) {
            if (novaQtd == 0) {
                break;
            } else if (vetor[i] == numero) {
                for (int j = i; j < qtdVetor -1; j++) {
                    vetor[j] = vetor[j+1];
                    i -= 1;
                }
                novaQtd -= 1;
            }
        }

        return vetor;
    }

    public int encontarElemento(int[] vetor, int qtdVetor, int numero) {
        int novaQtd = 0;

        for (int i = 0; i < qtdVetor; i++) {
            if (vetor[i] == numero) {
                novaQtd++;
            }
        }

        return novaQtd;
    }

    public int[] ordenarVetor(int[] vetor, int qtdVetor) {
        for (int i = 0; i < qtdVetor - 1;) {
            if (vetor[i] > vetor[i+1]) {
                int bolha = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = bolha;
                i = 0;
            } else {
                i++;
            }
        }

        return vetor;
    }

    public int[] inverterVetor(int[] vetor, int qtdVetor) {
        int novoVetor[] = new int[qtdVetor];

        for (int i = 0; i < qtdVetor; i++) {
            novoVetor[i] = vetor[qtdVetor - (i + 1)];
        }

        return novoVetor;
    }

    public void mostarVetor(int[] vetor, int qtdVetor) {
        for (int i = 0; i < qtdVetor; i++) {
            System.out.println(vetor[i]);
        }
    }

    public int[] alterarVetor(Scanner input, int[] vetor, int qtdVetor, int oldNumber, int newNumber) {
        boolean numberFound = false;

        for (int i = 0; i < qtdVetor; i++) {
            if (vetor[i] == oldNumber) {
                vetor[i] = newNumber;
                numberFound = true;
                break;
            }
        }

        if (!numberFound) {
            output(4);
        }

        return vetor;
    }

    public boolean pesquisarVetor(Scanner input, int[] vetor, int qtdVetor, int numero) {
        boolean valorEncontrado = false;

        for (int i = 0; i < qtdVetor; i++) {
            if (vetor[i] == numero) {
                valorEncontrado = true;
            }
        }

        return valorEncontrado;
    }

    public void output(int valor) {
        switch (valor) {
            case 1:
                System.out.println("Número adicionado ao Vetor!");
                break;
            case 2:
                System.out.println("Valor encontrado!");
                break;
            case 3:
                System.out.println("Valor inexistente!");
                break;
            case 4:
                System.out.println("Número não encontrado!");
        }
    }

    public int[] incluir(Scanner input, int[] vetor, int qtdVetor, int numero) {
        vetor[qtdVetor] = numero;

        return vetor;
    }

    public int input(Scanner input) {
        System.out.println("1 – Incluir valor \n" +
        "2 – Pesquisar valor \n" +
        "3 – Alterar valor \n" +
        "4 – Excluir valor \n" +
        "5 – Mostrar valores \n" +
        "6 – Ordenar valores \n" +
        "7 – Inverter valores \n" +
        "8 – Sair do sistema");
        System.out.print("Digite a opção: ");
        int valor = input.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
