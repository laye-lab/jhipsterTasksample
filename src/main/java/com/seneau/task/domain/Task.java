package com.seneau.task.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A Task.
 */
@Entity
@Table(name = "task")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "completed")
    private String completed;

    @Column(name = "duedate")
    private LocalDate duedate;

    @Column(name = "name")
    private String name;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompleted() {
        return completed;
    }

    public Task completed(String completed) {
        this.completed = completed;
        return this;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public Task duedate(LocalDate duedate) {
        this.duedate = duedate;
        return this;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    public String getName() {
        return name;
    }

    public Task name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }
        return id != null && id.equals(((Task) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Task{" +
            "id=" + getId() +
            ", completed='" + getCompleted() + "'" +
            ", duedate='" + getDuedate() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}
