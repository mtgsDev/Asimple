package org.biblioteca.model;

import org.biblioteca.enums.ExtensaoDeArquivo;
import org.biblioteca.enums.Idioma;

public class Audiovisual extends CaracteristicasAlugaveisAbstract {

    private String diretor;
    private int duracao;

    public Audiovisual(String titulo, String categoria, Idioma idioma, int classificacaoIndicativa, ExtensaoDeArquivo extensaoDeArquivo, double valor, boolean disponivel, String diretor, int duracao) {
        super(titulo, categoria, idioma, classificacaoIndicativa, extensaoDeArquivo, valor, disponivel);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
