package sep.arbeitspaket.rest.adress;


import javax.persistence.*;

@Entity
@Table(name = "Adress")
public class Adress
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String city;
    String street;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
