package com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialreformer.model.Complaints;

public interface ComplaintsRepository extends JpaRepository<Complaints,Integer>  {


}
