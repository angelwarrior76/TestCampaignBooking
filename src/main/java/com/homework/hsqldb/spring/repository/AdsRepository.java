package com.homework.hsqldb.spring.repository;

import com.homework.hsqldb.spring.model.Ad;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AdsRepository extends CrudRepository<Ad, Integer> {
}
