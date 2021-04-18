package com.example.entity;

import javax.persistence.*;

@Entity
//@Table
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String skillName;
    private Integer level;

    public Skill() {
    }

    public Skill(String skillName, Integer level) {
        this.skillName = skillName;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(/*Long*/ String id) {
        this.id = Long.parseLong(id);
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
