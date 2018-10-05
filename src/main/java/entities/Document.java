package entities;

import javax.persistence.ManyToOne;

public class Document {

    public Document(){

    }

    @ManyToOne
    private CustomFlow docflow;

}
