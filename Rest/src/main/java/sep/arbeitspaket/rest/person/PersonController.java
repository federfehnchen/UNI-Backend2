package sep.arbeitspaket.rest.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController
{
    @Autowired
    PersonRepository repo;

    @GetMapping("")
    public List<Person> findAll() {
        List<Person> list = new ArrayList<Person>();
        repo.findAll().forEach(list::add);
        return list;
    }

    @GetMapping("/findByAge")
    public List<Person> findByAge(@RequestParam(defaultValue = "-1") int lowerAge, @RequestParam(defaultValue = "-1") int higherAge) {
        return repo.findByAge(2022-lowerAge, 2022-higherAge);
    }

    @GetMapping("/findByCity")
    public List<Person> findByCity(@RequestParam(defaultValue = "Essen") String city)
    {
        return repo.findByCity(city);
    }

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person) {
        repo.save(person);
        return person;
    }

}
