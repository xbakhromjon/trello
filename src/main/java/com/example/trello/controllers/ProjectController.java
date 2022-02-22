package com.example.trello.controllers;

import com.example.trello.services.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/project/*")
public class ProjectController extends AbstractController<ProjectService>{

    @Autowired
    public ProjectController(ProjectService service) {
        super(service);
    }
}
