package uz.bakhromjon.services.task;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.task.TaskCreateDto;
import uz.bakhromjon.dto.task.TaskDto;
import uz.bakhromjon.dto.task.TaskUpdateDto;
import uz.bakhromjon.entity.task.Task;
import uz.bakhromjon.services.BaseService;
import uz.bakhromjon.services.GenericCrudService;

public interface TaskService extends GenericCrudService<
        Task,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        GenericCriteria,
        Long>, BaseService {
}
