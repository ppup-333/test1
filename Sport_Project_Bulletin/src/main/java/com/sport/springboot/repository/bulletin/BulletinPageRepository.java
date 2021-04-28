package com.sport.springboot.repository.bulletin;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sport.springboot.model.bulletin.Bulletin;

public interface BulletinPageRepository extends PagingAndSortingRepository<Bulletin, Integer> {
	
}
