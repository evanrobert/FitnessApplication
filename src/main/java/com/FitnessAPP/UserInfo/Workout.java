package com.FitnessAPP.UserInfo;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Workouts")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Workout {
    @GeneratedValue
    @Id
    private Long id;
@Column
public String Monday;
@Column
 public String Tuesday;
@Column
 public String Wensday;
@Column
 public String Thursday;
@Column
 public String Friday;
@Column
 public String Saturday;
@Column
 public String Sunday;


}
