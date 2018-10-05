package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class SysUser extends Human {
    public SysUser(){

    }


    public SysUser(String login, String password, SystemRole role) {
        super(login, password);
        this.role = role;
    }

    @Column
    @NotNull
    private SystemRole role;

    public SystemRole getRole() {
        return role;
    }

    public void setRole(SystemRole role) {
        this.role = role;
    }
}
