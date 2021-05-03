package com.example.controller;

import com.example.entity.Skill;
import com.example.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SkillController {

    private SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @RequestMapping(value = {"/addSkill"}, method = RequestMethod.GET)
    public String getAddSkill() {
        return "/skill/add-skill";
    }

    @RequestMapping(value = {"/editSkill/{id}"}, method = RequestMethod.GET)
    public String getEditSkill(Model model, @PathVariable String id)
    {
        model.addAttribute("skill", skillService.getSkill(Long.parseLong(id)));
        return "/skill/edit-skill";
    }

    @RequestMapping(value = {"/saveSkill"}, method = RequestMethod.POST)
    public RedirectView saveAddSkill(@ModelAttribute Skill newSkill) {
        skillService.saveSkill(newSkill);
        return new RedirectView("/admin");
    }

    @RequestMapping(value = {"/deleteSkill/{skillId}"}, method = RequestMethod.POST)
    public RedirectView deleteSkill(@ModelAttribute Skill skill,
                                     @PathVariable("skillId") Long skillId) {
        skillService.deleteSkill(skillId);
        return new RedirectView("/admin");
    }

    @RequestMapping(value = {"/postEditSaveSkill/{id}"}, method = RequestMethod.POST)
    public RedirectView postEditSaveSkill(@ModelAttribute Skill skill, @PathVariable String id) {
        skillService.editSkill(skill, id);
        return new RedirectView("/admin");

    }


}
