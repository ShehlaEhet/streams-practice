package com.cydeo.service.impl;

import com.cydeo.model.JobHistory;
import com.cydeo.service.JobHistoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobHistoryServiceImpl implements JobHistoryService {

    private final List<JobHistory> list = new ArrayList<>();

    @Override
    public JobHistory create(JobHistory object) {
        list.add(object);
        return object;
    }

    @Override
    public List<JobHistory> createAll(List<JobHistory> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(JobHistory object) {
        for (JobHistory jobHistory : list){
            if(jobHistory.getEmployee().getId().equals(object.getEmployee().getId()) && jobHistory.getJob().getId().equals(object.getJob().getId())){
                jobHistory.setEmployee(object.getEmployee());
                jobHistory.setStartDate(object.getStartDate());
                jobHistory.setEndDate(object.getEndDate());
                jobHistory.setJob(object.getJob());
                jobHistory.setDepartment(object.getDepartment());
            }
        }

    }

    @Override
    public List<JobHistory> readAll() {
        return list;
    }

    @Override
    public List<JobHistory> readByEmployeeId(Long id) {
        return list.stream().filter(jobHistory -> jobHistory.getEmployee().getId().equals(id)).collect(Collectors.toList());
    }

    @Override
    public void delete(JobHistory object) {
        list.remove(object);

    }

    @Override
    public void deleteByEmployeeId(Long id) {
        list.removeIf(jobHistory -> jobHistory.getEmployee().getId().equals(id));

    }
}
