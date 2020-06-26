package br.com.pontoEletronico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pontoEletronico.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {
	List<Funcionario> findById(int id);

}
