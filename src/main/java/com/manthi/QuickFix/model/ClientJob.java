package com.manthi.QuickFix.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client_job")
public class ClientJob {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "nic_number", nullable = false)
    private String nicNumber;

    @Column(name = "contact_number", nullable = false)
    private String contactNumber;

    @Column(name = "job_status", length = 1, nullable = false)
    private String jobStatus;

    @Column(name = "job_note", length = 500, nullable = false)
    private String jobNote;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobNote() {
        return jobNote;
    }

    public void setJobNote(String jobNote) {
        this.jobNote = jobNote;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
