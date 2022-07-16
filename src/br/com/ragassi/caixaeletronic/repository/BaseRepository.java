package br.com.ragassi.caixaeletronic.repository;

import br.com.ragassi.caixaeletronic.model.Conta;

import java.util.List;

public interface BaseRepository<T> {


    List<T> findAll();

    T findByID(int id);

    void adiciona(T objeto);


    Conta findById(int i);
}
