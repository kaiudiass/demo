package com.capacitamais.demo.controller;

import com.capacitamais.demo.dao.CidadeDAO;
import com.capacitamais.demo.dao.ProjetoDAO;
import com.capacitamais.demo.dao.UsuarioDAO;
import com.capacitamais.demo.model.Cidade;
import com.capacitamais.demo.model.Projeto;
import com.capacitamais.demo.model.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        CidadeDAO cidadeDAO = new CidadeDAO();
//
//        System.out.println("=== Cadastro de Cidade ===");
//
//        System.out.print("ID da Cidade: ");
//        int id = scanner.nextInt();
//        scanner.nextLine(); // limpar quebra de linha
//
//        System.out.print("Representante: ");
//        String representante = scanner.nextLine();
//
//        System.out.print("Email: ");
//        String email = scanner.nextLine();
//
//        System.out.print("Senha: ");
//        String senha = scanner.nextLine();
//
//        System.out.print("UF: ");
//        String uf = scanner.nextLine();
//
//        Cidade cidade = new Cidade();
//        cidade.setIdCidade(id);
//        cidade.setRepresentante(representante);
//        cidade.setEmail(email);
//        cidade.setSenha(senha);
//        cidade.setUf(uf);
//
//        cidadeDAO.inserir(cidade);
//



//
//        UsuarioDAO usuarioDAO = new UsuarioDAO();
//
//        System.out.println("=== Cadastro de Usuário ===");
//
//        System.out.print("ID do Usuário: ");
//        int id = scanner.nextInt();
//        scanner.nextLine(); // limpar quebra de linha
//
//        System.out.print("Nome: ");
//        String nome = scanner.nextLine();
//
//        System.out.print("Email: ");
//        String email = scanner.nextLine();
//
//        System.out.print("Senha: ");
//        String senha = scanner.nextLine();
//
//        System.out.print("Telefone: ");
//        String telefone = scanner.nextLine();
//
//        Usuario usuario = new Usuario();
//        usuario.setIdUser(id);
//        usuario.setNome(nome);
//        usuario.setEmail(email);
//        usuario.setSenha(senha);
//        usuario.setTelefone(telefone);
//
//        usuarioDAO.inserir(usuario);
//








        ProjetoDAO projetoDAO = new ProjetoDAO();

        System.out.println("=== Cadastro de Projeto ===");

        System.out.print("ID do Projeto: ");
        int idProjeto = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Nome do Projeto: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição do Projeto: ");
        String descricao = scanner.nextLine();

        System.out.print("Data de Início (yyyy-MM-dd): ");
        LocalDate dataInicio = LocalDate.parse(scanner.nextLine());

        System.out.print("Data de Criação (yyyy-MM-dd): ");
        LocalDate dataCriacao = LocalDate.parse(scanner.nextLine());

        System.out.print("Data Limite (yyyy-MM-dd): ");
        LocalDate dataLimite = LocalDate.parse(scanner.nextLine());

        System.out.print("Status: ");
        String status = scanner.nextLine();

        System.out.print("Local: ");
        String local = scanner.nextLine();

        System.out.print("Duração (dias): ");
        int duracao = scanner.nextInt();

        System.out.print("Vagas: ");
        int vagas = scanner.nextInt();

        Projeto projeto = new Projeto();
        projeto.setIdProjeto(idProjeto);
        projeto.setNome(nome);
        projeto.setDescricao(descricao);
        projeto.setDataInicio(dataInicio);
        projeto.setDataCriacao(dataCriacao);
        projeto.setDataLimite(dataLimite);
        projeto.setStatus(status);
        projeto.setLocal(local);
        projeto.setDuracao(duracao);
        projeto.setVagas(vagas);

        projetoDAO.inserir(projeto);

        scanner.close();








    }
}
