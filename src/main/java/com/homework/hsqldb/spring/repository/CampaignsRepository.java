package com.homework.hsqldb.spring.repository;

import java.util.List;
import java.util.Optional;

import com.homework.hsqldb.spring.model.Campaign;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

@Repository
public interface CampaignsRepository extends CrudRepository<Campaign, Integer> {

    @Query(nativeQuery = true, value = "SELECT campaign_id, name, start_date, finish_date, status FROM campaigns WHERE name LIKE :name")
    Optional<Campaign> findByName(@Param("name") String name);

    @Query(nativeQuery = true, value = "SELECT campaign_id, name, start_date, finish_date, status FROM campaigns WHERE name LIKE :name and status = :status")
    List<Campaign> findCampainsByNameAndStatus(@Param("name") String name, @Param("status") int status, Pageable page);

}
