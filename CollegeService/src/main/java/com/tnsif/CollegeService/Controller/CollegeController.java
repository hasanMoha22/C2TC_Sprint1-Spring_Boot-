package com.tnsif.CollegeService.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.CollegeService.entity.College;
import com.tnsif.CollegeService.Service.CollegeService;

import jakarta.persistence.NoResultException;


@RestController
public class CollegeController {
	@Autowired
	private CollegeService c;

	
	@GetMapping("/CollegeService")
	public List<College> list(){
		return c.listAll();
	}
	@PostMapping("/CollegeService")
	public void add(@RequestBody College c1) {
		c.save(c1);
	}
	
	@GetMapping("/CollegeService/{id}")
	public ResponseEntity<College> get(@PathVariable Integer id){
		try {
			College c2 = c.get(id);
			return new ResponseEntity<College>(c2,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/CollegeService/{id}")
	public void delete(@PathVariable Integer id) {
		c.delete(id);
	}
	

	@PutMapping("/CollegeService/{id}")
	public ResponseEntity<College> update(@PathVariable Integer id,@RequestBody College update_c){
		try {
			College exist_c = c.get(id);
			exist_c.setS_name(update_c.getS_name());
			exist_c.setYear_of_Study(update_c.getYear_of_Study());
			exist_c.setdept_name(update_c.getdept_name());
			exist_c.setemail(update_c.getemail());
			exist_c.setphone(update_c.getphone());
			exist_c.setgender(update_c.getgender());
			c.update(exist_c);
			return new ResponseEntity<College>(exist_c,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
}