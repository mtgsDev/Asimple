package org.biblioteca.enums;

public enum ExtensaoDeArquivo {
    EPUB(Categoria.EBOOK),
    PDF(Categoria.EBOOK),
    MOBI(Categoria.EBOOK),
    AZW(Categoria.EBOOK),
    MP4(Categoria.AUDIOVISUAL),
    AVI(Categoria.AUDIOVISUAL),
    MOV(Categoria.AUDIOVISUAL),
    WMV(Categoria.AUDIOVISUAL),
    MKV(Categoria.AUDIOVISUAL);

    ExtensaoDeArquivo(Categoria categoria) {
        this.categoria = categoria;
    }

    private final Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }
}

