package com.company;

import static javax.swing.JOptionPane.*;

public class Message implements InterfaceMessage {
    //Все методы данного класса конечные (для использования раннего связывания)
    //final - служит для раннего связывания, так как методы конечные.
    public final void Show(String message, String title) {
        showMessageDialog(null,
                message,
                title,
                PLAIN_MESSAGE);
    }
    //Перегрузка метода Show для вывода
    public final void Show(String message) {
        showMessageDialog(null,
                message,
                "Результат рентабельности",
                PLAIN_MESSAGE);
    }
    //Общий для ввода расходов и доходов
    public final String InputDate(String title, String message) {
        return showInputDialog(null,
                message,
                title,
                PLAIN_MESSAGE);
    }
}
