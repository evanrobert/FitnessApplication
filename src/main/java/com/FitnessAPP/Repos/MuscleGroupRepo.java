package com.FitnessAPP.Repos;

import com.FitnessAPP.UserInfo.MuscleGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuscleGroupRepo extends JpaRepository<MuscleGroups ,  Long> {
}
