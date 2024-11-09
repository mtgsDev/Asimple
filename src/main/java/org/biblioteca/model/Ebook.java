package org.biblioteca.model;

import org.biblioteca.enums.ExtensaoDeArquivo;
import org.biblioteca.enums.Idioma;

public class Ebook extends CaracteristicasAlugaveisAbstract {

    private String autor;
    private String isbn;
    private String notaDeClassificacao;

    public Ebook(String titulo, String categoria, Idioma idioma, int classificacaoIndicativa, ExtensaoDeArquivo extensaoDeArquivo, double valor, boolean disponivel, String autor, String isbn, String notaDeClassificacao) {
        super(titulo, categoria, idioma, classificacaoIndicativa, extensaoDeArquivo, valor, disponivel);
        this.autor = autor;
        this.isbn = isbn;
        this.notaDeClassificacao = notaDeClassificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
