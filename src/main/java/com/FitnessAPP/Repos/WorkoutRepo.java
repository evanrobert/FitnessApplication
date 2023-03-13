package com.FitnessAPP.Repos;

import com.FitnessAPP.UserInfo.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepo extends JpaRepository<Workout,Long> {
}
