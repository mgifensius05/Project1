package com.frankmoley.landon.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.frankmoley.landon.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{ 

}