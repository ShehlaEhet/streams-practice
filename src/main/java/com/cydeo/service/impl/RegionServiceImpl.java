package com.cydeo.service.impl;

import com.cydeo.model.Region;
import com.cydeo.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegionServiceImpl extends CrudServiceImpl<Region, Long> implements RegionService {

    @Override
    public Region create(Region object) {
        return super.create(object.getId(), object);
    }

    @Override
    public List<Region> createAll(List<Region> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(Region object) {
        super.update(object.getId(), object);

    }

    @Override
    public List<Region> readAll() {
        return super.readAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Region object) {
        super.delete(object);

    }

    @Override
    public Region readById(Long id) {
        return super.readById(id);
    }
}
