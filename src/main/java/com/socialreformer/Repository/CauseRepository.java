package com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialreformer.model.Cause;

public interface CauseRepository extends JpaRepository<Cause,Integer> {

}
