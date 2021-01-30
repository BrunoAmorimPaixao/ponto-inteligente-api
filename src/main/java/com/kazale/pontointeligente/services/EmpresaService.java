package com.kazale.pontointeligente.services;

import com.kazale.pontointeligente.entities.Empresa;
import java.util.Optional;

public interface EmpresaService {

    /**
     * retorno uma empresa peli cnpj
     * @param cnpj
     * @return
     */
    Optional<Empresa> buscarPorCnpj(String cnpj);

    /**
     * cadastra uma empresa
     * @param empresa
     * @return
     */
    Empresa persistir(Empresa empresa);


}
