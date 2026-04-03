package com.gtaskfollownew.service.dto;

import java.util.List;
import java.util.Map;

public class DashboardDTO {

    private Long totalActiveTasks;
    private Map<String, Long> tasksByStatus;
    private List<TaskDashboardItemDTO> recentUrgentTasks;

    // Getters

    public Long getTotalActiveTasks() {
        return totalActiveTasks;
    }

    public Map<String, Long> getTasksByStatus() {
        return tasksByStatus;
    }

    public List<TaskDashboardItemDTO> getRecentUrgentTasks() {
        return recentUrgentTasks;
    }

    // Setters

    public void setTotalActiveTasks(Long totalActiveTasks) {
        this.totalActiveTasks = totalActiveTasks;
    }

    public void setTasksByStatus(Map<String, Long> tasksByStatus) {
        this.tasksByStatus = tasksByStatus;
    }

    public void setRecentUrgentTasks(List<TaskDashboardItemDTO> recentUrgentTasks) {
        this.recentUrgentTasks = recentUrgentTasks;
    }
}