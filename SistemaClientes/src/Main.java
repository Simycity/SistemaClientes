import dao.ClienteDAO;
import model.Cliente;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        //Scanner = kleber
        Scanner kleber = new Scanner(System.in);
        
        ClienteDAO dao = new ClienteDAO();
        
        //Opções para o menu.
        int opcao;
        
        do {
            System.out.println("---CADASTRO---");
            System.out.println("1 - Cadastrar Cliente.");
            System.out.println("2 - Listar Cliente.");
            System.out.println("3 - Atualizar Cliente.");
            System.out.println("4 - Remover Cliente.");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = kleber.nextInt();
            
            try{
                switch (opcao) {
                    case 1:
                        Cliente novo = new Cliente();
                        System.out.print("Nome: ");
                        novo.setNome(kleber.nextLine());
                        System.out.print("CPF: ");
                        novo.setCpf(kleber.nextLine());
                        System.out.print("Email: ");
                        novo.setEmail(kleber.nextLine());
                        System.out.print("Telefone: ");
                        novo.setTelefone(kleber.nextLine());
                        System.out.print("Endereço: ");
                        novo.setEndereco(kleber.nextLine());
                        dao.inserir(novo);
                        System.out.println("Cliente cadastrado com sucesso!");
                        break;
                    case 2:
                        List<Cliente> clientes = dao.listarTodos();
                        for (Cliente c : clientes) {
                            System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome() + " | CPF: " + c.getCpf() + " | Email: " + c.getEmail());
                        }
                        break;
                    case 3:
                        Cliente atualizar = new Cliente();
                        System.out.print("ID do cliente: ");
                        atualizar.setId(kleber.nextInt());
                        kleber.nextLine();
                        System.out.print("Novo nome: ");
                        atualizar.setNome(kleber.nextLine());
                        System.out.print("Novo CPF: ");
                        atualizar.setCpf(kleber.nextLine());
                        System.out.print("Novo Email: ");
                        atualizar.setEmail(kleber.nextLine());
                        System.out.print("Novo Telefone: ");
                        atualizar.setTelefone(kleber.nextLine());
                        System.out.print("Novo Endereço: ");
                        atualizar.setEndereco(kleber.nextLine());
                        dao.atualizar(atualizar);
                        System.out.println("Cliente atualizado com sucesso!");
                        break;
                    case 4:
                        System.out.print("ID do cliente a excluir: ");
                        int id = kleber.nextInt();
                        dao.excluir(id);
                        System.out.println("Cliente excluído com sucesso!");
                        break;
                }
            }catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 5);
            kleber.close();
    }
}
