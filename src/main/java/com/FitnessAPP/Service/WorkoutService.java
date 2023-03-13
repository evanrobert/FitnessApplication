package com.FitnessAPP.Service;

import com.FitnessAPP.Repos.WorkoutRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkoutService {
    @Autowired
    WorkoutRepo workoutRepo;
}
