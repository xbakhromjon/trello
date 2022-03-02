package uz.bakhromjon.entity.project;

import uz.bakhromjon.entity.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class ProjectColumn extends Auditable {
    private String name;

    @ManyToOne
    private Project project;
}
