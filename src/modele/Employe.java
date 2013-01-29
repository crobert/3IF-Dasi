package modele;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author crobert
 */
@Entity
public class Employe {

    @Id
    private int id;
    protected String code;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Client> clients;

    public Employe() {
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
}
