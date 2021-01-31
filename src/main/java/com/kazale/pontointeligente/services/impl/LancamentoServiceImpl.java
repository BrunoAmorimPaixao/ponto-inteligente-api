package com.kazale.pontointeligente.services.impl;

import com.kazale.pontointeligente.entities.Lancamento;
import com.kazale.pontointeligente.repositories.LancamentoRepository;
import com.kazale.pontointeligente.services.LancamentoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

public class LancamentoServiceImpl implements LancamentoService {

    private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);

    private LancamentoRepository lancamentoRepository;

    @Override
    public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
        log.info("Buscando lancamentos para o funcionario pelo id {}", funcionarioId);
        return this.buscarPorFuncionarioId(funcionarioId, pageRequest);
    }

    @Override
    public Optional<Lancamento> buscarPorId(Long id) {
        log.info("Buscando um lancamento pelo id {}", id);
        return this.lancamentoRepository.findById(id);
    }

    @Override
    public Lancamento persistir(Lancamento lancamento) {
        log.info("Salvando a lancamento: {}", lancamento);
        return this.lancamentoRepository.save(lancamento);
    }

    @Override
    public void remover(Long id) {
        log.info("Removendo o lancamento pelo id {}", id);
        this.remover(id);
    }
}
