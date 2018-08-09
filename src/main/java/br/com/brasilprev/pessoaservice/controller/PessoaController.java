package br.com.brasilprev.pessoaservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasilprev.pessoaservice.model.Pessoa;
import br.com.brasilprev.pessoaservice.repository.IPessoaRepository;

@RestController
public class PessoaController {

	@Autowired
	private IPessoaRepository pessoaRepository;

	@GetMapping("pessoas")
	public List<Pessoa> getAll() {
		return pessoaRepository.findAll();
	}

	@GetMapping("pessoas/{id}")
	public Pessoa getAll(@PathVariable("id") Long id) {
		Optional<Pessoa> optional = pessoaRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new IllegalArgumentException("Pessoa não encontrada"); 
		}
	}
}
