package br.com.minhasMusicas.modelo;

public class MinhasPreferidas {

    public void inclui (Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() +" Esta sendo considerado sucesso");
        }else {
            System.out.println(audio.getTitulo() + " Esse esta mais fraco");
        }
    }
}
