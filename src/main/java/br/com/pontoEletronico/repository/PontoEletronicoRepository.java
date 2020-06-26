package br.com.pontoEletronico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pontoEletronico.model.PontoEletronico;

public interface PontoEletronicoRepository extends JpaRepository <PontoEletronico, Integer> {

	List<PontoEletronico> findByIdfunc(int idfunc);
}
