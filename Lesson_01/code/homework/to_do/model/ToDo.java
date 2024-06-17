package homework.to_do.model;

import java.time.LocalDate;
import java.util.Objects;

public class ToDo {
    private String task;
    private String user;
    private LocalDate date;

    public ToDo(String task, String user, LocalDate date) {
        this.task = task;
        this.user = user;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return Objects.equals(task, toDo.task) && Objects.equals(user, toDo.user) && Objects.equals(date, toDo.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, user, date);
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "task='" + task + '\'' +
                ", user='" + user + '\'' +
                ", date=" + date +
                '}';
    }
}
