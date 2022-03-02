package uz.bakhromjon.repository;

import uz.bakhromjon.entity.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long>, AbstractRepository{

    @Query("from todo t where t.project_id =: id ")
    List<Task> findAllByProject_Id(@Param("id") Long id);
}

