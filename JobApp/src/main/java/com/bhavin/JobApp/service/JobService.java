package com.bhavin.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavin.JobApp.model.JobPost;
import com.bhavin.JobApp.repository.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
       
    }

    public List<JobPost> getAllJobPosts(){
        return repo.getAllJobPosts();
    }
   
}
