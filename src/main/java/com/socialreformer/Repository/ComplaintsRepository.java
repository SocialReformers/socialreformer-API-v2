package main.java.com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.socialreformer.model.Complaints;

public interface ComplaintsRepository extends JpaRepository<Complaints,Integer>  {


}
