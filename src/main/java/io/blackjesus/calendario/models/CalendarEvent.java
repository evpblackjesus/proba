package io.blackjesus.calendario.models;

import io.blackjesus.calendario.enums.CalendarEventType;

import java.time.LocalDate;
import java.util.UUID;

public class CalendarEvent {

    private String uuid;
    private String title;
    private LocalDate date;
    private CalendarEventType type;
    private boolean isCompleted;

    public CalendarEvent(String title, LocalDate date, CalendarEventType type, boolean isCompleted) {
        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.date = date;
        this.isCompleted = isCompleted;
        this.title = title;
    }

    @Override
    public String toString() {
        return "CalendarEvent{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", type=" + type +
                ", isCompleted=" + isCompleted +
                '}';
    }

    public String getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public CalendarEventType getType() {
        return type;
    }

    public void setType(CalendarEventType type) {
        this.type = type;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
