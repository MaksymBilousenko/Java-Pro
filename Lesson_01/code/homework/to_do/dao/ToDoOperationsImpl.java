package homework.to_do.dao;

import java.time.LocalDate;

public class ToDoOperationsImpl implements ToDoOperations{

    int amountTasks;
    @Override
    public void addTask(String task) {

    }

    @Override
    public boolean checkTask(String task) {
        return false;
    }

    @Override
    public String getTaskByUserName(String userName) {
        return null;
    }

    @Override
    public String getTaskByDate(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public String getTaskByKeyWord(String keyWord) {
        return null;
    }
}
