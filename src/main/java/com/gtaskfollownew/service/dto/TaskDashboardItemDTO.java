package com.gtaskfollownew.service.dto;

import java.time.LocalDate;

public class TaskDashboardItemDTO {
    private Long id;
    private String title;
    private String status;
    private LocalDate dueDate;

    public TaskDashboardItemDTO() {
        // Default constructor
    }

    public TaskDashboardItemDTO(Long id, String title, String status, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "TaskDashboardItemDTO{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", status='" + status + '\'' +
               ", dueDate=" + dueDate +
               '}';
    }
}