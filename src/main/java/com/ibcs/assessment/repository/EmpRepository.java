package com.ibcs.assessment.repository;

import com.ibcs.assessment.entity.Emp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CrudRepository<Emp, Long> {

}