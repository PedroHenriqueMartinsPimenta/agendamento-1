package br.com.israel.eeep.agendamento.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Usuario {
    //Atributos
    @Id
    private long cpf;
    @NotBlank(message = "nome é obrigatório")
    private String nome;
    @NotBlank(message = "email é obrigatório")
    private String email;
    private String senha;
    private boolean status;

    //Construtores


    public Usuario() {
    }

    public Usuario(long cpf, String nome, String email, String senha, boolean status) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }

    //Métodos gets e sets

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", status=" + status +
                '}';
    }
}
