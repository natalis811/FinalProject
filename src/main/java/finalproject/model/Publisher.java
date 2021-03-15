
package finalproject.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="publisher")
public class Publisher extends AbstractEntity {
    
    private String name;
    private String address;
    private String city;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
