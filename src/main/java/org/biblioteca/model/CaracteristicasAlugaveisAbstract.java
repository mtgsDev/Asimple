package org.biblioteca.model;

import org.biblioteca.enums.ExtensaoDeArquivo;
import org.biblioteca.enums.Idioma;

/***
 * Utilizada para pegar centralizar caracteristicas comuns de itens alugaveis
 */
public abstract class CaracteristicasAlugaveisAbstract {

    protected String titulo;
    // transformar em enum
    protected String categoria;
    protected Idioma idioma;
    protected double valor;
    protected boolean disponivel;
    protected int classificacaoIndicativa;
    protected ExtensaoDeArquivo extensaoDeArquivo;

    public CaracteristicasAlugaveisAbstract(String titulo, String categoria, Idioma idioma, int classificacaoIndicativa, ExtensaoDeArquivo extensaoDeArquivo, double valor, boolean disponivel) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.idioma = idioma;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.extensaoDeArquivo = extensaoDeArquivo;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public ExtensaoDeArquivo getExtensaoDeArquivo() {
        return extensaoDeArquivo;
    }

    public void setExtensaoDeArquivo(ExtensaoDeArquivo extensaoDeArquivo) {
        this.extensaoDeArquivo = extensaoDeArquivo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
