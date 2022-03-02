package uz.bakhromjon.controllers;

import uz.bakhromjon.dto.project.ProjectCreateDto;
import uz.bakhromjon.dto.project.ProjectUpdateDto;
import uz.bakhromjon.services.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project/*")
public class ProjectController extends AbstractController<ProjectService>{

    @Autowired
    public ProjectController(ProjectService service) {
        super(service);
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createPage() {
        return "project/create";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String create(@ModelAttribute ProjectCreateDto dto) {
        service.create(dto);
        return "redirect: project/list";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String updatePage(Model model, @PathVariable(name = "id") Long id) {
        model.addAttribute("project",service.get(id));
        return "project/update";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public String update(ProjectUpdateDto dto) {
        service.update(dto);
        return "redirect: project/list";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deletePage(Model model,@PathVariable(name ="id") Long id) {
        model.addAttribute("project",service.get(id));
        return "project/delete";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public String deletePage(@PathVariable(name ="id") Long id) {
        service.delete(id);
        return "redirect: project/list";
    }

    @RequestMapping(value = "/archive/{id}",method = RequestMethod.POST)
    public String archive(@PathVariable(name ="id") Long id) {
        service.archive(id);
        return "redirect: project/list";
    }

    @RequestMapping(value = "/archive/{id}",method = RequestMethod.POST)
    public String unarchive(@PathVariable(name ="id") Long id) {
        service.archive(id);
        return "redirect: project/list";
    }

    @RequestMapping(value = "/archive/{id}",method = RequestMethod.POST)
    public String close(@PathVariable(name ="id") Long id) {
        service.archive(id);
        return "redirect: project/list";
    }
}
