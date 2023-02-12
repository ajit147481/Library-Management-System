package com.example.LibraryManagementSystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String email;
    private String name;
    private int  age;
    private String Country;
    @OneToOne
    @JoinColumn
    @JsonIgnoreProperties("student")
    private Card card;
    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date UpdatedOn;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Country='" + Country + '\'' +
                ", card=" + card +
                ", createdOn=" + createdOn +
                ", UpdatedOn=" + UpdatedOn +
                '}';
    }
}
