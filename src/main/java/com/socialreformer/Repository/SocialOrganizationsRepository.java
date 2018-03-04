package main.java.com.socialreformer.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import main.java.com.socialreformer.model.SocialOrganizations;
@Repository
public interface SocialOrganizationsRepository extends JpaRepository<SocialOrganizations, Integer> {

@Query("Select org from SocialOrganizations org where org.cause like %:cause%  AND LOWER(org.city) = LOWER(:city)")
public List<SocialOrganizations> searchByNGOCauseAndCity(@Param("cause") String cause,@Param("city") String city);
}
