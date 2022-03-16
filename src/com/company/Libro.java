package com.company;

public class Libro {
    int paginas;
    int cuantas;
    String autor;
    String isbn;
    String titulo;
    String contenido[];
    public Libro(int paginas, String autor, String isbn, String titulo){
        this.paginas=paginas;
        this.cuantas=0;
        this.autor=autor;
        this.isbn=isbn;
        this.titulo=titulo;
        this.contenido= new String [paginas];
    }
    public Libro(){
        this.paginas=0;
        this.cuantas=0;
        this.autor=null;
        this.isbn=null;
        this.titulo=null;
        this.contenido= new String [0];
    }
    int getPaginas(){
        return paginas;
    }
    void setPaginas(int paginas){
        this.paginas = paginas;
    }

    String getAutor(){
        return autor;
    }
    void setAutor(String autor){
        this.autor=autor;
    }
    String getIsbn(){
        return isbn;
    }
    void setIsbn(String isbn){
        this.isbn=isbn;
    }
    String getTitulo(){
        return titulo;
    }
    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    boolean nuevaPag(String p){
        if (this.contenido[this.cuantas]==null){
        this.contenido[this.cuantas]=p;
        this.cuantas++;
        return true;
        }
        else return false;
    }
    String caracteres(int n){
        String k = this.contenido[n].substring(0,10);
        return k;
    }
    boolean buscaPalabra(String p){
        int n;
        boolean aux=false;
        for (n=0;n<this.cuantas;n++) {
            if (this.contenido[n].contains(p) == true) {
                System.out.println(n);
                aux=true;
            }
        }
        return aux;
    }
    Libro CopiaLibro(){
        Libro l2= new Libro(this.paginas,this.autor,this.isbn,this.titulo);
        l2.contenido=this.contenido;
        l2.cuantas=this.cuantas;
        return l2;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Libro){
            if(this.paginas==((Libro)obj).paginas && this.autor==((Libro)obj).autor && this.isbn==((Libro)obj).isbn
            && this.titulo==((Libro)obj).titulo){
                return true;
            }
            else return false;
        }
        return false;
    }
}
