package uz.bakhromjon.controllers;

import uz.bakhromjon.dto.project.ProjectDto;
import uz.bakhromjon.dto.task.TaskCreateDto;
import uz.bakhromjon.dto.task.TaskDto;
import uz.bakhromjon.dto.task.TaskUpdateDto;
import uz.bakhromjon.services.project.ProjectService;
import uz.bakhromjon.services.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/task/*")
public class TaskController extends AbstractController<TaskService> {

    private final ProjectService projectService;

    @Autowired
    public TaskController(TaskService service, ProjectService projectService) {
        super(service);
        this.projectService = projectService;
    }

    @RequestMapping(value = "create/", method = RequestMethod.GET)
    public String createPage() {
        return "task/create";
    }

    @RequestMapping(value = "create/", method = RequestMethod.POST)
    public String create(@ModelAttribute TaskCreateDto dto) {
        Long id = service.create(dto);
        return "redirect:/task/task_details/" + id;
    }

    @RequestMapping(value = "update/{id}/", method = RequestMethod.GET)
    public String updatePage(Model model, @PathVariable(name = "id") Long id) {
        model.addAttribute("task", service.get(id));
        return "task/update";
    }

    @RequestMapping(value = "update/{id}/", method = RequestMethod.POST)
    public String update(TaskUpdateDto dto) {
        service.update(dto);
        return "redirect:/task/task_details" + dto.getId();
    }

    @RequestMapping(value = "delete/{id}/", method = RequestMethod.GET)
    public String deletePage(Model model, @PathVariable(name = "id") Long id) {
//        model.addAttribute("project", service.get(id));
        return "task/delete";
    }

    @RequestMapping(value = "delete/{id}/", method = RequestMethod.POST)
    public String delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
//        return "redirect:/task/list";
        // TODO: 2/27/2022 task listga redirect qilish
        return "redirect:/home";
    }

    @RequestMapping(value = "list/{id}/", method = RequestMethod.POST)
    public String list(@PathVariable(name = "id") Long id, Model model) {
        List<TaskDto> all = service.getAllById(id);
        model.addAttribute("tasks", all);
        ProjectDto projectDto = projectService.get(id);
        model.addAttribute("project", projectDto);
        return "/task/list";
    }

}
