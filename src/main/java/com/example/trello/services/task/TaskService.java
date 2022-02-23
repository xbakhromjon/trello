package com.example.trello.services.task;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.task.TaskCreateDto;
import com.example.trello.dto.task.TaskDto;
import com.example.trello.dto.task.TaskUpdateDto;
import com.example.trello.entity.task.Task;
import com.example.trello.services.BaseService;
import com.example.trello.services.GenericCrudService;

public interface TaskService extends GenericCrudService<
        Task,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        GenericCriteria,
        Long>, BaseService {
}
