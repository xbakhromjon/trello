package uz.bakhromjon.controllers;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.organization.OrganizationCreateDto;
import uz.bakhromjon.dto.organization.OrganizationUpdateDto;
import uz.bakhromjon.services.organization.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/organization/*")
public class OrganizationController extends AbstractController<OrganizationService> {


    @Autowired
    public OrganizationController(OrganizationService service) {
        super(service);
    }

    @RequestMapping(value = "create/", method = RequestMethod.GET)
    public String createPage() {
        return "organization/create";
    }

    @RequestMapping(value = "create/", method = RequestMethod.POST)
    public String create(@ModelAttribute OrganizationCreateDto dto) {
        service.create(dto);
        return "redirect: organization/list";
    }


    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deletePage(Model model, @PathVariable(name = "id") Long id) {
        model.addAttribute("organization", service.get(id));
        return "organization/delete";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "organization/list";
    }


    @RequestMapping(value = "update/{id}/", method = RequestMethod.GET)
    public String updatePage(Model model , @PathVariable (name = "id") Long id) {
        model.addAttribute("organization",service.get(id));
        return "organization/update";
    }

    @RequestMapping(value = "update/", method = RequestMethod.POST)
    public String update(@ModelAttribute OrganizationUpdateDto dto) {
        service.update(dto);
        return "redirect:/";
    }

    @RequestMapping("detail/{id}/")
    public String detail(@PathVariable Long id) {
        return "organization/detail";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPage(Model model) {
        model.addAttribute("organizations", service.getAll(new GenericCriteria()));
        return "organization/list";
    }

    @RequestMapping(value = "block/{id}",method = RequestMethod.POST)
    public String block(@PathVariable (name = "id") Long id) {
        service.block(id);
        return "organization/list";
    }

    @RequestMapping(value = "unblock/{id}",method = RequestMethod.POST)
    public String unblock(@PathVariable (name = "id") Long id) {
        service.unblock(id);
        return "organization/list";
    }
}
