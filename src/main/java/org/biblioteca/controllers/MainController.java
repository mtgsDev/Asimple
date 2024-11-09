package org.biblioteca.controllers;

import org.biblioteca.enums.ExtensaoDeArquivo;
import org.biblioteca.enums.Idioma;
import org.biblioteca.model.Ebook;
import org.biblioteca.service.GerenciadorService;

public class MainController {
    private final GerenciadorService gerenciadorService = new GerenciadorService();

    public void initializer() {
        Ebook ebook = new Ebook("O Hobbit", "ROMANCE",  Idioma.PORTUGUES, 14, ExtensaoDeArquivo.EPUB, 0, true,"J.R.R. Tolkien", "1233213", null);
        gerenciadorService.adicionarEbook(ebook);

        gerenciadorService.listarEbookDisponivel().forEach(book -> System.out.println(book.getTitulo()));
    }
}
