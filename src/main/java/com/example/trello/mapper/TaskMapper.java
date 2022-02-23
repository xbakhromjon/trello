package com.example.trello.mapper;

import com.example.trello.dto.task.TaskCreateDto;
import com.example.trello.dto.task.TaskDto;
import com.example.trello.dto.task.TaskUpdateDto;
import com.example.trello.entity.task.Task;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface TaskMapper extends BaseMapper<
        Task,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto> {
    @Override
    TaskDto toDto(Task task);

    @Override
    List<TaskDto> toDto(List<Task> e);

    @Override
    Task fromCreateDto(TaskCreateDto taskCreateDto);

    @Override
    Task fromUpdateDto(TaskUpdateDto d);
}
