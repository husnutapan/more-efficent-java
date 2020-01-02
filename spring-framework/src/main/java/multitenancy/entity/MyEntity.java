package multitenancy.entity;

import javax.persistence.*;

@Entity
@Table
public class MyEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;


    MyEntity() {
    }

    MyEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
