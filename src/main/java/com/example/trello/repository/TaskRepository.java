package com.example.trello.repository;

import com.example.trello.entity.project.Project;
import com.example.trello.entity.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long>, AbstractRepository{

    @Query("from todo t where t.project_id =: id ")
    List<Task> findAllByProject_Id(@Param("id") Long id);
}

