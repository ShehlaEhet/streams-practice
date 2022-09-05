package com.cydeo.service.impl;

import com.cydeo.model.Country;
import com.cydeo.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl extends CrudServiceImpl<Country, String> implements CountryService {

    @Override
    public Country create(Country object) {
        return super.create(object.getId(), object);
    }

    @Override
    public List<Country> createAll(List<Country> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(Country object) {
        super.update(object.getId(), object);

    }


    @Override
    public List<Country> readAll() {
        return super.readAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Country object) {
        super.delete(object);

    }

    @Override
    public Country readById(String id) {
        return super.readById(id);
    }
}
