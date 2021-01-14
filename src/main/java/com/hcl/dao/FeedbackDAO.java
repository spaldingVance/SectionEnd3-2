package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Feedback;

@Repository
public interface FeedbackDAO extends CrudRepository<Feedback,Integer> {

}