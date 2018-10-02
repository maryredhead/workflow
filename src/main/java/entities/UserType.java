package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


//бизнес-роль пользователя - директор, секретарь, бухгалтер. хранит роли доступа работы с документом
@Entity
public class UserType {
    public UserType(){

    }

    public UserType(String name) {
        this.name = name;
    }

    public UserType(String name, List<AccessRole> accessRoles) {
        this.name = name;
        this.accessRoles = accessRoles;
    }

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usertype", cascade = CascadeType.ALL)
    private List<AccessRole> accessRoles;
}
