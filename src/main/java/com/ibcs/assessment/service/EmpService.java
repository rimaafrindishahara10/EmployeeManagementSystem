package com.ibcs.assessment.service;

import com.ibcs.assessment.dto.EmpDto;
import com.ibcs.assessment.entity.Emp;
import com.ibcs.assessment.repository.DeptRepository;
import com.ibcs.assessment.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;
    @Autowired
    private DeptRepository deptRepository;

    public Iterable<Emp> list() {
        return empRepository.findAll();
    }

    public Emp get(Long id) {
        return empRepository.findById(id).get();
    }

    public Emp add(EmpDto emp) {

        Emp ext = new Emp();

        ext.setName(emp.getName());
        ext.setCode(emp.getCode());
        ext.setActive(emp.getActive());
        ext.setDob(emp.getDob());
        ext.setGender(emp.getGender());
        ext.setMobile(emp.getMobile());
        ext.setDept(deptRepository.findById(emp.getDeptId()).get());

        Emp empLoc = empRepository.save(ext);
        return empLoc;
    }

    public Emp update(EmpDto emp, Long id) {
        Emp ext = empRepository.findById(id).get();

        ext.setName(emp.getName());
        ext.setCode(emp.getCode());
        ext.setActive(emp.getActive());
        ext.setDob(emp.getDob());
        ext.setGender(emp.getGender());
        ext.setMobile(emp.getMobile());
        ext.setDept(deptRepository.findById(emp.getDeptId()).get());

        Emp empLoc = empRepository.save(ext);
        return empLoc;
    }

    public void delete(Long id) {
        empRepository.deleteById(id);
    }
}