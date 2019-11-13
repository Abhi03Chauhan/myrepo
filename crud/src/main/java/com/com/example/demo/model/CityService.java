package com.com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.example.demo.dao.CityDao;



@Service
public class CityService {
 
 @Autowired
 private CityDao cityDao;

 public List<City> getCitiesByCountry(int countryId) {
  return cityDao.getCitiesByCountry(countryId);
 }
}