package org.example.patternState;

public class TaskAtWork implements TaskState{
    /**
     * Функция состояния задачи
     * @return возвращает название состояния задачи
     */
    @Override
    public String getSNameState() {
        return "Задача в работе";
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public TaskInReady taskInReady(){
        return new TaskInReady();
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public DeleteTask deleteTask(){
        return new DeleteTask();
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public DraftTask draftTask(){
        return new DraftTask();
    }
}
