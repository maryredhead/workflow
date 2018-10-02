package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


//пользователи, которых заводит админ. логин, пароль, бизнес-роль

@Entity
public class User {

    public User(){

    }
    public User(String login, String password){
        this.login = login;
        this.password = password;

    }

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private String login;

    @Column
    @NotNull
    private String password;

    private UserType userType;



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
