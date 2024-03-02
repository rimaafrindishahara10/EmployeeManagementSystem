package com.ibcs.assessment.controller;

import com.ibcs.assessment.entity.Dept;
import com.ibcs.assessment.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    //All Dept get
    @GetMapping("")
    public Iterable<Dept> list() {
        return this.deptService.list();
    }

    //Single Dept get
    @GetMapping("/{id}")
    public Dept get(@PathVariable Long id) {
        return this.deptService.get(id);
    }

    //Dept Add
    @PostMapping("")
    public Dept add(@RequestBody Dept emp) {
        return this.deptService.add(emp);
    }

    //Dept Update
    @PutMapping("/{id}")
    public Dept update(@PathVariable Long id, @RequestBody Dept emp) {
        return this.deptService.update(emp,id);
    }

    //Dept Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long id) {
        this.deptService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}