package com.sport.springboot.service.bulletin;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sport.springboot.model.bulletin.Bulletin;

public interface BulletinService {
	Bulletin save(Bulletin bulletin);
	void delete(Integer id);
	Bulletin get(Integer id);
	void update(Bulletin bulletin);
	List<Bulletin> getAllBulletin();
	Page<Bulletin> findById( Integer id, Pageable pageable);
}
