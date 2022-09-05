package com.cydeo.service.impl;

import com.cydeo.model.Job;
import com.cydeo.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl extends CrudServiceImpl<Job, String> implements JobService {
    @Override
    public Job create(Job object) {
        return super.create(object.getId(), object);
    }

    @Override
    public List<Job> createAll(List<Job> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(Job object) {
        super.update(object.getId(), object);

    }

    @Override
    public List<Job> readAll() {
        return super.readAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Job object) {
        super.delete(object);

    }

    @Override
    public Job readById(String id) {
        return super.readById(id);
    }
}
