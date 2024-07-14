package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;
    private LocalTime tempo;

    public Mentoria(){

    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getTempo(){
        return tempo;
    }

    public void setTempo(LocalTime tempo){
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + ", tempo= " + tempo + "]";
    }

    
}
