package com.eventos.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eventos.models.Evento;
import com.eventos.repository.EventoRepository;


@RestController
@RequestMapping("/evento")
public class EventoResource {

	@Autowired
	private EventoRepository er;
	
	
	//Método HTTP: - GET - para buscar TODOS os dados de 'Eventos'
	@GetMapping(produces="application/json")
	public @ResponseBody  Iterable<Evento> listaEventos(){
		
		Iterable<Evento> listaEventos = er.findAll();
		
		return listaEventos;
	
	}
	
	
	//Método HTTP: - GET - para pegar os dados pelo 'codigo' do evento
	@GetMapping(value="/{codigo}", produces="application/json")
	public @ResponseBody Evento evento(@PathVariable(value="codigo") long codigo){
		
		Evento evento = er.findByCodigo(codigo);
		return evento;
	}

	
	
	//Método HTTP: - POST - para enviar os dados para a base do banco de dados
	@PostMapping()
	public Evento cadastraEvento(@RequestBody @Valid Evento evento){
		
		er.save(evento);
		return evento;
	
	}
	
	
	//Método HTTP: - DELETE - para enviar os dados para a base do banco de dados
	@DeleteMapping()
	public Evento deletaEvento(@RequestBody Evento evento){
		
		er.delete(evento);
		return evento;
	
	}
	
	
	

}
