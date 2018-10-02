package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

//упорядоченный список, состоящий из списка юзеров, с учетом шаблона абстрактного флоу
@Entity
public class CustomFlow {

    public CustomFlow(){

    }

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private AbstractFlow tempalteId;


    private List<User> flow;


}
