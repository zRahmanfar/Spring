package com.example.demo.model;


import java.util.Objects;

public class Person {

    private Long id ,codMli;
    private String name ,lastname;



    public Long getId() {
        return id;
    }

    public Long getCodMli() {
        return codMli;
    }

    public void setCodMli(Long codMli) {
        this.codMli = codMli;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId()) &&
                Objects.equals(getCodMli(), person.getCodMli()) &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getLastname(), person.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCodMli(), getName(), getLastname());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", codMli=" + codMli +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
