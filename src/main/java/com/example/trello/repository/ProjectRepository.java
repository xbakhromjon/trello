package com.example.trello.repository;

import com.example.trello.entity.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {
}
