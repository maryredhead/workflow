package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.File;

public class Document {

    public Document(){

    }

    public Document(StatusDoc statusDoc, String content, CustomFlow docflow) {
        this.statusDoc = statusDoc;
        this.content = content;
        this.docflow = docflow;
    }

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private StatusDoc statusDoc;

    private String content;

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public User getState() {
        return State;
    }

    public void setState(User state) {
        State = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusDoc getStatusDoc() {
        return statusDoc;
    }

    public void setStatusDoc(StatusDoc statusDoc) {
        this.statusDoc = statusDoc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CustomFlow getDocflow() {
        return docflow;
    }

    public void setDocflow(CustomFlow docflow) {
        this.docflow = docflow;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document", cascade = CascadeType.ALL)
    private User State;



    @ManyToOne
    private CustomFlow docflow;

}
