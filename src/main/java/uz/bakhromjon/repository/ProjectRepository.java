package uz.bakhromjon.repository;

import uz.bakhromjon.entity.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {
}
