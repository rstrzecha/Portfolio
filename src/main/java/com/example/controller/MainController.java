package com.example.controller;

import com.example.entity.Skill;
import com.example.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    private SkillService skillService;

    public MainController(SkillService skillService) {
        this.skillService = skillService;
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        List<Skill> skillList = skillService.getSkillList();
        model.addAttribute("skills", skillList);
        return "/index";
    }

    @RequestMapping(value = { "/admin"}, method = RequestMethod.GET)
    public String getAdminPanel(Model model) {
        List<Skill> skillList = skillService.getSkillList();
        model.addAttribute("skills", skillList);
        return "/admin/admin";
    }




}
