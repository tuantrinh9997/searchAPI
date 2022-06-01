package com.tutorial.repository;

import com.tutorial.repository.entity.DistrictEntity;

public interface DistrictRepository {
	DistrictEntity findNameById(Integer districtId);
}
