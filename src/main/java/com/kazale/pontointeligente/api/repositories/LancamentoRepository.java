package com.kazale.pontointeligente.api.repositories;

import com.kazale.pontointeligente.api.entities.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NamedQuery;
import java.util.List;

@Transactional(readOnly = true)
@NamedQuery(name = "LancamentoRepository.findByFuncionarioId",
        query = "SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id = :funcionarioId")
// Minha query o spring não consegue fazer com sua convenção, porque pego dado de uma outra entidade
//Linguagem JPQL linguage sql do JPA
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

    List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);//Todos os lancamentos

    Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);//Lancamentos paginados
}