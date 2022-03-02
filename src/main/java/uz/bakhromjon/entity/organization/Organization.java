package uz.bakhromjon.entity.organization;


import uz.bakhromjon.entity.Auditable;
import uz.bakhromjon.entity.auth.AuthUser;
import uz.bakhromjon.entity.project.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Organization extends Auditable {

    private String name;

    private String logo;

    private String email;

    private String code;

    private String location;

    private boolean blocked;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id")
    private List<AuthUser> users;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id")
    private List<Project> projects;

}
