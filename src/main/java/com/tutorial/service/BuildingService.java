package com.tutorial.service;

import java.util.List;
import java.util.Map;

import com.tutorial.model.response.BuildingSearchResponse;

public interface BuildingService {
	List<BuildingSearchResponse> findByConditions(Map<String, String> params);
}
