package homework.to_do.dao;

import java.time.LocalDate;

public interface ToDoOperations {
    void addTask(String task);

    boolean checkTask(String task);

    String getTaskByUserName(String userName);

    String getTaskByDate(LocalDate from, LocalDate to);

    String getTaskByKeyWord(String keyWord);

}
