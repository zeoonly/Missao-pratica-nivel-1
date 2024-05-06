import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PessoaFisicaRepo fisicaRepo = new PessoaFisicaRepo();
            PessoaJuridicaRepo juridicaRepo = new PessoaJuridicaRepo();
            
            int opcao = -1;
            while (opcao != 0) {
                System.out.println("Selecione uma opcao:");
                System.out.println("1 - Incluir");
                System.out.println("2 - Alterar");
                System.out.println("3 - Excluir");
                System.out.println("4 - Exibir pelo ID");
                System.out.println("5 - Exibir todos");
                System.out.println("6 - Salvar dados");
                System.out.println("7 - Recuperar dados");
                System.out.println("0 - Finalizar execucao");
                
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
                
                switch (opcao) {
                    case 1 -> {
                        System.out.println("Opcao selecionada: Incluir");
                        incluir(scanner, fisicaRepo, juridicaRepo);
                    }
                    case 2 -> System.out.println("Opcao selecionada: Alterar");
                    // Implementar a lógica para a opção 2: Alterar
                    case 3 -> System.out.println("Opcao selecionada: Excluir");
                    // Implementar a lógica para a opção 3: Excluir
                    case 4 -> System.out.println("Opcao selecionada: Exibir pelo ID");
                    // Implementar a lógica para a opção 4: Exibir pelo ID
                    case 5 -> System.out.println("Opcao selecionada: Exibir todos");
                    // Implementar a lógica para a opção 5: Exibir todos
                    case 6 -> System.out.println("Opcao selecionada: Salvar dados");
                    // Implementar a lógica para a opção 6: Salvar dados
                    case 7 -> System.out.println("Opcao selecionada: Recuperar dados");
                    // Implementar a lógica para a opção 7: Recuperar dados
                    case 0 -> System.out.println("Finalizando execucao.");
                    default -> System.out.println("Opcao invalida. Tente novamente.");
                }
            }
        }
    }

    private static void incluir(Scanner scanner, PessoaFisicaRepo fisicaRepo, PessoaJuridicaRepo juridicaRepo) {
        System.out.println("Selecione o tipo de pessoa (1 para Fisica, 2 para Juridica):");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        switch (tipo) {
            case 1 ->                 {
                    System.out.println("Incluindo Pessoa Fisica...");
                    // Ler os dados da pessoa física
                    System.out.println("Digite o ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CPF:");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite a idade:");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    // Adicionar a pessoa física ao repositório de pessoa física
                    fisicaRepo.inserir(new PessoaFisica(id, nome, cpf, idade));
                    System.out.println("Pessoa Fisica adicionada com sucesso!");
                }
            case 2 ->                 {
                    System.out.println("Incluindo Pessoa Juridica...");
                    // Ler os dados da pessoa jurídica
                    System.out.println("Digite o ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CNPJ:");
                    String cnpj = scanner.nextLine();
                    // Adicionar a pessoa jurídica ao repositório de pessoa jurídica
                    juridicaRepo.inserir(new PessoaJuridica(id, nome, cnpj));
                    System.out.println("Pessoa Juridica adicionada com sucesso!");
                }
            default -> System.out.println("Opcao invalida. Tente novamente.");
        }
    }
}



