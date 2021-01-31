package com.kazale.pontointeligente.services;

import com.kazale.pontointeligente.entities.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

public interface LancamentoService {

    /**
     * retorna uma lista paginada de lancamentos de deteminado funcionario
     * @param funcionarioId
     * @param pageRequest
     * @return
     */
    Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

    /**
     * retorna um lancamento pelo id
     * @param id
     * @return Optional<Lancamento>
     */
    Optional<Lancamento> buscarPorId(Long id);

    /**
     * salva o lancamento
     * @param lancamento
     * @return
     */
    Lancamento persistir(Lancamento lancamento);

    /**
     * remover o lancamento
     * @param id
     */
    void remover(Long id);
}
