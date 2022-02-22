package com.example.trello.controllers;

import com.example.trello.services.BaseService;

public abstract class AbstractController<S extends BaseService> {
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}
