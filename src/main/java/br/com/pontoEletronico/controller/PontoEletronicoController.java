package br.com.pontoEletronico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pontoEletronico.model.PontoEletronico;
import br.com.pontoEletronico.repository.PontoEletronicoRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api/ponto")
public class PontoEletronicoController {
	
	@Autowired
	PontoEletronicoRepository pontoEletronicoRepository;
	
	@GetMapping()
	public List<PontoEletronico> getAllRegistries() {
		return pontoEletronicoRepository.findAll();
	}
	
	@PostMapping("/insert")
	public PontoEletronico registryEmployeeTime(@RequestBody PontoEletronico pontoEletronico) {
		return pontoEletronicoRepository.save(pontoEletronico);
	}
	
	@GetMapping("/{idfunc}")
	public @ResponseBody List<PontoEletronico> getEmployeeRegistries(@PathVariable(value="idfunc") int idfunc){
		return pontoEletronicoRepository.findByIdfunc(idfunc);
	}


}
