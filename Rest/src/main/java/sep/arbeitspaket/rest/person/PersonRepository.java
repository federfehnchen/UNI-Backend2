package sep.arbeitspaket.rest.person;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    @Query(value = "select p from Person p where p.yearOfBirth>=:lowerAge and p.yearOfBirth<=:higherAge")
    public List<Person> findByAge(@Param("lowerAge") int lowerAge, @Param("higherAge") int higherAge);

    @Query(value = "select p from Person p inner join p.adresse ad where ad.city=:city")
    public List<Person> findByCity(@Param("city") String city);
}
