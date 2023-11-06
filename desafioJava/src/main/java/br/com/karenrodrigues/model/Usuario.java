package br.com.karenrodrigues.model;


import jakarta.persistence.*;

@Entity
@Table(name = "dbusuarios")
public class Usuario {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String profissao;
    private int idade;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String profissao, int idade) {
        this.id = id;
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
