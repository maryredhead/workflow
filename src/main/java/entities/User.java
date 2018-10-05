package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


//пользователи, которых заводит админ. логин, пароль, бизнес-роль

@Entity
public class User extends Human {

    public User(){

    }

    public User(String login, String password, UserType userType) {
        super(login, password);
        this.userType = userType;
    }

    @ManyToOne
    private CustomFlow custompath;

    @Column
    @NotNull
    private UserType userType;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
