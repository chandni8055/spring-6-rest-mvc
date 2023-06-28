package com.infy.spring6restmvc.service;

import com.infy.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
