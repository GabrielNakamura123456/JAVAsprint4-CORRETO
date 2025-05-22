package controller;

import model.Equipe;
import service.EquipeService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EquipeController {
    private static EquipeService service = new EquipeService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Equipe ---");
            System.out.println("1 - Cadastrar Equipe");
            System.out.println("2 - Listar Equipes");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Severidade: ");
                    String sev = scanner.nextLine();
                    System.out.print("Localização: ");
                    String loc = scanner.nextLine();

                    Equipe e = new Equipe(id, LocalDateTime.now(), sev, loc);
                    try {
                        service.cadastrarEquipe(e);
                        System.out.println("Equipe cadastrada com sucesso!");
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Erro: " + ex.getMessage());
                    }
                    break;

                case 2:
                    for (Equipe eq : service.listarEquipes()) {
                        System.out.printf("ID: %d | Data: %s | Severidade: %s | Localização: %s\n",
                            eq.getIdEquipe(), eq.getDataHora(), eq.getSeveridade(), eq.getLocalizacao());
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}