package cn.soa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cn.soa.entity.Position;

@RepositoryRestResource(path="positions")
public interface PositionRepository extends JpaRepository<Position, Long>{
	
}
