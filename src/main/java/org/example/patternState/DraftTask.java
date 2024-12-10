package org.example.patternState;

public class DraftTask implements TaskState {
    /**
     * Функция состояния задачи
     * @return возвращает название состояния задачи
     */
    @Override
    public String getSNameState() {
        return "Черновик задачи";
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public NewTask newTask(){
        return new NewTask();
    }
}
