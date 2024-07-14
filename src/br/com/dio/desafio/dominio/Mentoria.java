package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Mentoria extends Conteudo {
    private LocalDate data;
    private LocalTime tempo;

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + ", tempo= "
                + tempo + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
