package org.biblioteca.model;

import java.util.List;

public class Usuario {

    Long id;
    int idade;
    String nome;
    String login;
    String email;
    enum nacionalidade{};
    enum generosFavoritos{};
    String artistasFavoritos;
    String autoresFavoritos;

    List<Ebook> ebookList;
    List<Audiovisual> audiovisualList;




}
