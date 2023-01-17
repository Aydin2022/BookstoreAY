package com.example.demo5.Service;

import com.example.demo5.dto.requestDto.CityRequestDto;
import com.example.demo5.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    City addCity(CityRequestDto cityRequestDto);
    List<City> getCities();
    City getCity(Long cityId);
    City deleteCity(Long cityId);
    City editCity(Long cityId, CityRequestDto cityRequestDto);
}
