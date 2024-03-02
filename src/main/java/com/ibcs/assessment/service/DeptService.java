package com.ibcs.assessment.service;

import com.ibcs.assessment.entity.Dept;
import com.ibcs.assessment.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    public Iterable<Dept> list() {
        return deptRepository.findAll();
    }

    public Dept get(Long id) {
        return deptRepository.findById(id).get();
    }

    public Dept add(Dept dept) {
        Dept deptLoc = deptRepository.save(dept);
        return deptLoc;
    }

    public Dept update(Dept dept, Long id) {
        Dept ext = deptRepository.findById(id).get();
        ext.setName(dept.getName());
        ext.setActive(dept.getActive());
        Dept deptLoc = deptRepository.save(ext);
        return deptLoc;
    }

    public void delete(Long id) {
        deptRepository.deleteById(id);
    }
}