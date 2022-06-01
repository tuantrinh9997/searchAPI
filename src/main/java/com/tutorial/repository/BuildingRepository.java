package com.tutorial.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import com.tutorial.repository.entity.BuildingEntity;


@Component
public interface BuildingRepository {
	List<BuildingEntity> findByConditions(Map<String, String> params);
}
