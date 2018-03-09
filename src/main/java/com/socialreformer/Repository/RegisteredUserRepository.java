package com.socialreformer.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.socialreformer.model.RegisteredUser;

@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUser,Integer>{
	public long countByEmailAddrAndPassword(String emailAddr,String password);
	@Query("Select usr.id from RegisteredUser usr where usr.emailAddr=:emailAddr")
	public Integer findByEmailAddr(@Param("emailAddr") String emailAddr);

}
