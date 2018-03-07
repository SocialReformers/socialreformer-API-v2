package com.socialreformer.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialreformer.model.RegisteredUser;

@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUser,Integer>{
	public long countByEmailAddrAndPassword(String emailAddr,String password);

}
