package com.example.LibraryManagementSystem.Model;

import com.example.LibraryManagementSystem.Enums.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String transactionId= UUID.randomUUID().toString();
    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties("books")
    private Card card;
    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties("transactions")
    private Book book;
    private int fineAmount;
    @Column(columnDefinition = "TINYINT(1)")
    private boolean isIssueOperation;
    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;
    @CreationTimestamp
    private Date createdOn;

}
