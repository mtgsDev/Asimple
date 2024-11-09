package org.biblioteca.enums;

public enum TitulosDisponiveis {

    TITULO_1("titulo", 3, true),
    TITULO_2("titulo2", 1, true),
    TITULO_3("titulo3", 2, true),
    TITULO_4("titulo4", 0, false);

    private String titulo;
    private int quantidade;
    private boolean disponibilidade;

    TitulosDisponiveis(String titulo, int quantidade, boolean disponibilidade) {
        this.titulo = titulo;
        this.disponibilidade = disponibilidade;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }
}

