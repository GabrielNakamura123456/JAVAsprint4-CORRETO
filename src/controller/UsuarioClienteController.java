package controller;

import model.UsuarioCliente;
import service.UsuarioClienteService;

import java.util.Scanner;

public class UsuarioClienteController {
    private static UsuarioClienteService service = new UsuarioClienteService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Usuario Cliente ---");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Listar Usuarios");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    try {
                        UsuarioCliente usuario = new UsuarioCliente(id, nome, email);
                        service.cadastrarUsuario(usuario);
                        System.out.println("Usuário cadastrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    for (UsuarioCliente u : service.listarUsuarios()) {
                        System.out.printf("ID: %d | Nome: %s | Email: %s\n", u.getIdUsuario(), u.getNome(), u.getEmail());
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}