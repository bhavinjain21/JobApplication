package com.bhavin.JobApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhavin.JobApp.model.JobPost;
import com.bhavin.JobApp.service.JobService;

@Controller
public class JobController {

    @Autowired
    private JobService service;
  
    @GetMapping({"/","/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model m){
        List<JobPost> jobs = service.getAllJobPosts();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

    @GetMapping("/addjob")
    public String addJobs(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }
}
