package cn.soa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import cn.soa.entity.Position;

@RepositoryRestResource(path="positions")
public interface PositionRepository extends JpaRepository<Position, Long>{
	
	@RestResource(path="enumber",rel="enumber")
	Position findByEnumber(@Param("enumber") String enumber );
}
