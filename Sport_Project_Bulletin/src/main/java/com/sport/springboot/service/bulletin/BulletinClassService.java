package com.sport.springboot.service.bulletin;

import java.util.List;

import com.sport.springboot.model.bulletin.BulletinClass;

public interface BulletinClassService {
	List<BulletinClass> getAllBulletinClass();
	BulletinClass getBulletinClass(Integer id);
}
