package br.com.systemsgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.dto.ModelCompraDTO;
import br.com.systemsgs.service.CompraService;

@RestController
@RequestMapping(value = "/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping
	public void realizaCompra(@RequestBody ModelCompraDTO modelCompraDTO) {
		
	}

}
