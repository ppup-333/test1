package com.sport.springboot.repository.bulletin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sport.springboot.model.bulletin.BulletinClass;
@Repository
public interface BulletinClassRepository extends JpaRepository<BulletinClass, Integer> {

}
