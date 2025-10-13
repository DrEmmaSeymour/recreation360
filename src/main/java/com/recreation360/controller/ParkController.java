package com.recreation360.controller;

import com.recreation360.model.Park;
import com.recreation360.repository.ParkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parks")
@CrossOrigin(origins = "*") // allow testing from anywhere
public class ParkController {

    private final ParkRepository repository;

    public ParkController(ParkRepository repository) {
        this.repository = repository;
    }

    // GET all
    @GetMapping
    public List<Park> getAll() {
        return repository.findAll();
    }

    // GET one
    @GetMapping("/{id}")
    public Park getOne(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    // POST new
    @PostMapping
    public Park create(@RequestBody Park park) {
        return repository.save(park);
    }

    //  PUT update
    @PutMapping("/{id}")
    public Park update(@PathVariable Long id, @RequestBody Park updatedPark) {
        Park park = repository.findById(id).orElseThrow();
        park.setName(updatedPark.getName());
        park.setLocation(updatedPark.getLocation());
        park.setRating(updatedPark.getRating());
        return repository.save(park);
    }

    // DELETE one
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
