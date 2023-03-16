package com.FitnessAPP.UserInfo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_information")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder




public class User {
    @Id
    @GeneratedValue
    public long id;
    @Column
    @NotNull
    public String first_name;
    @Column
    @Nullable
    public String last_name;
    @Column
    @Nullable
    public int age;
    @Column
    @Nullable
    public String email;
    @Column
    @Nullable
@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public String address;
    @OneToMany(mappedBy = "user")
    public List <MuscleGroups> muscleGroups;




// Two different classes 1 for http one for DB
    //Docker contain app. Spin up apache/ubuntu compile copy to jar run java command.
    // Container is isolated, expose port through docker.
    //Dockerize app


}
