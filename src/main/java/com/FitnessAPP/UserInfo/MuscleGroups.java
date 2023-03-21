package com.FitnessAPP.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "muscle_group_selection")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MuscleGroups {
    @GeneratedValue
    @Id
    long id;
    @Column
    public String chest;
    @Column

    public String frontDelt;
    @Column
    public String delt;
    @Column
    public String rearDelt;
    @Column
    public String traps;
    @Column
    public String biceps;
    @Column
    public String triceps;
    @Column
    public String foreArms;
    @Column
    public String hamstrings;
    @Column
    public String quads;
    @Column
    public String calves;
    @Column
    public String back;
    @Column
    public String core;
    @Column
    public String cardio;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
