package com.rebels.resistenceapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rebels.resistenceapi.models.Rebel;
import com.rebels.resistenceapi.repository.RebelRepository;

@RestController
@RequestMapping(value="/api")
public class RebelResource {
	
	@Autowired
	RebelRepository rebelRepository;
	
	@GetMapping("/rebels")
	public List<Rebel> listRebels(){
		return rebelRepository.findAll();
	}
	
	@GetMapping("/rebel/{id}")
	public Rebel listUniqueRebel(@PathVariable(value="id") long id){
		return rebelRepository.findById(id);
	}
	
	@PostMapping("/rebel")
	public Rebel saveRebel(@RequestBody Rebel rebel) {
		return rebelRepository.save(rebel);
	}
	
	@DeleteMapping("/rebel")
	public void deleteRebel(@RequestBody Rebel rebel) {
		rebelRepository.delete(rebel);	
	}
	
	@PutMapping("/rebel")
	public Rebel refreshRebel(@RequestBody Rebel rebel) {
		return rebelRepository.save(rebel);
	}

}
