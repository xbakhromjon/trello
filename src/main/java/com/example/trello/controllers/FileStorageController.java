package com.example.trello.controllers;

import com.example.trello.services.file.FileStorageService;
import org.springframework.stereotype.Controller;


@Controller
public class FileStorageController extends AbstractController<FileStorageService> {

    public FileStorageController(FileStorageService service) {
        super(service);
    }
}
