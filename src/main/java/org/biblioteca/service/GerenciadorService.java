package org.biblioteca.service;

import org.biblioteca.model.Ebook;
import org.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorService {

    List<Ebook> ebooks = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();

    public void adicionarEbook(Ebook ebookAdicionado) {
        ebooks.add(ebookAdicionado);
    }

    private void removerEbookPorIsbn(Ebook ebook, String isbn) {
        if(!ebook.getIsbn().isEmpty()) {
            ebooks.remove(ebook);
        }
    }

    private void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public List<Ebook> listarEbookDisponivel() {
        return ebooks;
    }

}
