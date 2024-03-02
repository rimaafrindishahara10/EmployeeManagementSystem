package com.ibcs.assessment.controller;

import com.ibcs.assessment.dto.EmpDto;
import com.ibcs.assessment.entity.Emp;
import com.ibcs.assessment.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    //All Emp get
    @GetMapping("")
    public Iterable<Emp> list() {
        return this.empService.list();
    }

    //Single Emp get
    @GetMapping("/{id}")
    public Emp get(@PathVariable Long id) {
        return this.empService.get(id);
    }

    //Emp Add
    @PostMapping("")
    public Emp add(@RequestBody EmpDto emp) {
        return this.empService.add(emp);
    }

    //Emp Update
    @PutMapping("/{id}")
    public Emp update(@RequestBody EmpDto emp, @PathVariable Long id) {
        return this.empService.update(emp, id);
    }

    //Emp Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long id) {
        this.empService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}