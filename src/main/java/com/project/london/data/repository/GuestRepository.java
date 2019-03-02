package com.project.london.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.project.london.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}