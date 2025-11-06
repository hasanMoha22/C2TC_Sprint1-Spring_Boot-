package com.tnsif.CollegeService.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CollegeService.entity.College;
import com.tnsif.CollegeService.repository.CollegeRepository;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository repo;

    // to get all the records from the table
    public List<College> listAll() {
        return repo.findAll();
    }

    public void save(College c) {
        repo.save(c);
    }

    public College get(Integer s_id) { 
        return repo.findById(s_id).get(); 
    }

    public void delete(Integer s_id) {
        repo.deleteById(s_id);
    }

    public void update(College c) {
        repo.save(c);
    }
}
