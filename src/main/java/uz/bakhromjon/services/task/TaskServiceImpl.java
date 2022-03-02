package uz.bakhromjon.services.task;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.task.TaskCreateDto;
import uz.bakhromjon.dto.task.TaskDto;
import uz.bakhromjon.dto.task.TaskUpdateDto;
import uz.bakhromjon.entity.task.Task;
import uz.bakhromjon.mapper.TaskMapper;
import uz.bakhromjon.repository.TaskRepository;
import uz.bakhromjon.services.AbstractService;
import uz.bakhromjon.utils.validators.task.TaskValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractService<TaskRepository, TaskMapper, TaskValidator>
        implements TaskService {
    public TaskServiceImpl(TaskRepository repository, @Qualifier(value = "taskMapper") TaskMapper mapper, TaskValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public Long create(TaskCreateDto createDto) {
        Task task = mapper.fromCreateDto(createDto);
        repository.save(task);
        return task.getId();
    }

    @Override
    public Void update(TaskUpdateDto updateDto) {
        Task task = mapper.fromUpdateDto(updateDto);
        repository.save(task);
        return null;
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<TaskDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public List<TaskDto> getAllById(Long id) {
        List<Task> allByProject_id = repository.findAllByProject_Id(id);
        return mapper.toDto(allByProject_id);
    }

    @Override
    public TaskDto get(Long id) {
        Task task = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Not found");
        });
        return mapper.toDto(task);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
