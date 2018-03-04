package main.java.com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.socialreformer.model.Cause;

public interface CauseRepository extends JpaRepository<Cause,Integer> {

}
