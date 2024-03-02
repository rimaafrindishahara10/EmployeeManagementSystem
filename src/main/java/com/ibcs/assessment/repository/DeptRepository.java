package com.ibcs.assessment.repository;

import com.ibcs.assessment.entity.Dept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends CrudRepository<Dept, Long> {

}