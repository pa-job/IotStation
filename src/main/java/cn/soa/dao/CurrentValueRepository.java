package cn.soa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cn.soa.entity.CurrentValue;
import cn.soa.entity.Position;

@RepositoryRestResource(path="currentValues")
public interface CurrentValueRepository extends JpaRepository<CurrentValue, Long>{

}
