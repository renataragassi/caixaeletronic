package br.com.ragassi.caixaeletronic.repository;

import br.com.ragassi.caixaeletronic.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class MemoriaContaRepository implements BaseRepository<Conta>{

    private final List <Conta> contas = new ArrayList<>();


    @Override
    public List<Conta> findAll() {
        return contas;

    }

    @Override
    public Conta findByID(int id) {
        return contas.get(id);

    }

    @Override
    public void adiciona(Conta objeto) {
        objeto.setNumeroDaConta(contas.size());
        contas.add(objeto);

    }

    }










