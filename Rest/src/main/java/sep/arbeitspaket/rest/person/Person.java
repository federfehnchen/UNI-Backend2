package sep.arbeitspaket.rest.person;

import sep.arbeitspaket.rest.adress.Adress;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String firstName;
    String lastName;
    int yearOfBirth;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse")
    Adress adresse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Adress getAdresse() {
        return adresse;
    }

    public void setAdresse(Adress adresse) {
        this.adresse = adresse;
    }
}
