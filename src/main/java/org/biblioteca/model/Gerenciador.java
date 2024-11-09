package org.biblioteca.model;

import java.util.List;

public class Gerenciador {
    List<Ebook> ebooksCadastrados;
    List<Usuario> usuariosCadastrados;
    List<String> audiovisualCadastrado;

    public Gerenciador() {
    }

    public List<Ebook> getEbooksCadastrados() {
        return ebooksCadastrados;
    }

    public void setEbooksCadastrados(List<Ebook> ebooksCadastrados) {
        this.ebooksCadastrados = ebooksCadastrados;
    }

    public List<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void setUsuariosCadastrados(List<Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }

    public List<String> getAudiovisualCadastrado() {
        return audiovisualCadastrado;
    }

    public void setAudiovisualCadastrado(List<String> audiovisualCadastrado) {
        this.audiovisualCadastrado = audiovisualCadastrado;
    }

    @Override
    public String toString() {
        return "GerenciadorDeArquivos{" +
                "ebooksCadastrados=" + ebooksCadastrados +
                ", usuariosCadastrados=" + usuariosCadastrados +
                ", audiovisualCadastrado=" + audiovisualCadastrado +
                '}';
    }
}
