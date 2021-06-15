package com.ncu.repositories;

import org.springframework.data.repository.CrudRepository;
import com.ncu.entity.Question;
import org.springframework.stereotype.Repository;

@Repository("questionRepository")
public interface QuestionRepository extends CrudRepository<Question,Integer> {

}
