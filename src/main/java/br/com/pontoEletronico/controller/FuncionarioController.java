package br.com.pontoEletronico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pontoEletronico.model.Funcionario;
import br.com.pontoEletronico.repository.FuncionarioRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/api/funcionarios")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@GetMapping()
	public List<Funcionario> getAllEmployees(){
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody List<Funcionario> getAEmployeeById(@PathVariable(value="id") int id){
		return funcionarioRepository.findById(id);
	}

	
	@PostMapping("/insert")
	public ResponseEntity<Funcionario> insertEmployee(@RequestBody Funcionario funcionario) {
		Funcionario func = funcionarioRepository.save(funcionario);
		return ResponseEntity.ok().body(func);
	}
	
    @PutMapping("/update/{id}")
    public Funcionario atualizaUsuario(@RequestBody Funcionario data) {
        return funcionarioRepository.save(data);
    }
}
