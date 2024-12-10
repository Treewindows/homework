package org.example.patternState;

public class TaskInReady implements TaskState{
    /**
     * Функция состояния задачи
     * @return возвращает название состояния задачи
     */
    @Override
    public String getSNameState() {
        return "Готовая задача";
    }
}
