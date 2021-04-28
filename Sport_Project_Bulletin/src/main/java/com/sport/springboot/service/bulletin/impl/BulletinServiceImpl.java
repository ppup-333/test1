package com.sport.springboot.service.bulletin.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sport.springboot.model.bulletin.Bulletin;
import com.sport.springboot.repository.bulletin.BulletinRepository;
import com.sport.springboot.service.bulletin.BulletinService;
@Service
@Transactional
public class BulletinServiceImpl implements BulletinService {

	@Autowired
	BulletinRepository bulletinDao;
	
	
	@Override
	public Bulletin save(Bulletin bulletin) {
		return bulletinDao.save(bulletin);
	}

	@Override
	public void delete(Integer id) {
//		bulletinDao.deleteById(id);
		bulletinDao.deleteByIdmethod1(id);
	}

	

	@Override
	public void update(Bulletin bulletin) {
		bulletinDao.save(bulletin);
	}

	@Override
	public Bulletin get(Integer id) {
		Optional<Bulletin> optional = bulletinDao.findById(id);
		Bulletin bulletin = null;
		if(optional.isPresent()) {
			bulletin = optional.get();
		}else {
			throw new RuntimeException("bulletin(id=" + id + ")不存在");
		}
		return bulletin;
	}
	
	@Override
	public List<Bulletin> getAllBulletin() {
		return bulletinDao.findAll();
	}
	
	 @Override public Page<Bulletin> findById(Integer id, Pageable pageable) { 
		 return bulletinDao.findByIdSort(id,pageable); 
	}

}
