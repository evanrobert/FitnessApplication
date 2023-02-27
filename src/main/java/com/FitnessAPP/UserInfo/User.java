package com.FitnessAPP.UserInfo;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

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
    @Nullable
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
    public String address;





}
