package com.example.service;

import com.example.entity.Skill;
import com.example.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getSkillList()
    {
        return skillRepository.findAll();
    }

    public Skill getSkill(Long id){
        return skillRepository.findById(id).orElse(null);
    }

    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }

    public void saveSkill(Skill skill) {
        skillRepository.save(skill);
    }

    public Skill findById(Long id) {
        return skillRepository.findById(id).get();
    }

/*
    public void editTask(Task task, Person person) {
        Task editedTask = new Task(
                task.getId(),
                task.getDeadline(),
                task.getDescription(),
                task.getColor(),
                task.getCreationDate(),
//                task.getPerson()
                person
        );
        taskRepository.save(editedTask);
    }
*/
}
