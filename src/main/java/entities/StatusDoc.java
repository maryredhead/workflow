package entities;

import javax.persistence.Entity;

@Entity
public enum StatusDoc {
    crestedby,
    changedby,
    checkedby,
    movedfrom,
    closedby;
}
