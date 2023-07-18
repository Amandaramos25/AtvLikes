package com.example.atvlikes;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikesViewModel extends ViewModel {
    private MutableLiveData<String> Nome;

    public MutableLiveData<String> getNome() {
        if (Nome == null) {
            Nome = new MutableLiveData<String>("Amanda");
        }
        return Nome;
    }

    private MutableLiveData<String> Sobrenome;

    public MutableLiveData<String> getSobrenome() {
        if (Sobrenome == null) {
            Sobrenome = new MutableLiveData<String>("Machado");
        }
        return Sobrenome;
    }

    private MutableLiveData<Integer> Barra;

    public MutableLiveData<Integer> getBarra() {
        if (Barra == null) {
            Barra = new MutableLiveData<Integer>(0);
        }
        return Barra;
    }

    private MutableLiveData<Integer> Imagem;

    public MutableLiveData<Integer> getImagem() {
        if (Imagem == null) {
            Imagem = new MutableLiveData<Integer>(R.drawable.like);
        }
        return Imagem;
    }

    public void darLike(){
        Barra.setValue(Barra.getValue() + 1);
        if(Barra.getValue()==10){
            Imagem.setValue(R.drawable.cora);
        }
        if(Barra.getValue()==20){
            Imagem.setValue(R.drawable.fogo);
        }
    }
}
