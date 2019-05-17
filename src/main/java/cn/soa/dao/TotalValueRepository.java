package cn.soa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cn.soa.entity.CurrentValue;
import cn.soa.entity.TotalValue;

@RepositoryRestResource(path="totalValues")
public interface TotalValueRepository extends JpaRepository<TotalValue, Long>{

}
