package br.com.brasilprev.pessoaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilprev.pessoaservice.model.Pessoa;

public interface IPessoaRepository extends JpaRepository<Pessoa, Long> {

}
