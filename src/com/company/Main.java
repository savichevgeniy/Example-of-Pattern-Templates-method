package com.company;
import static javax.swing.JOptionPane.*;
public class Main {
//Блок №2. Интерфесы Савич Евгений Михайлович.
// В данной программме продемонстрирована работа интерфейсов на примере паттерна проектирования "Шаблонный метод".
    //Шаблонный метод - это поведенческий паттерн, который определяет скелет (поведение) алгоритма,
    // перекладывая оновну логику на подклассы. Паттерн позволяет упростить работу кода за счет наследования
    //методов и других данных (поведения) от общего интерфейса (абстрактного класса), позволяя выполнять общие задачи
    //(общее поведение).

    public static void main(String[] args) {
        String [] text = {"Месяц" , "Квартал", "Год"};
        String period;
	    period = (String)showInputDialog(null,
                "Выберите период расчета рентабельности",
                "Расчет рентабельности предприятия",
                PLAIN_MESSAGE,
                null,
                text,
                text[0]
        );
	    //Пример вывода конкретного расчета рентабельности.
	    for (int i = 0; i < text.length; i++) {
            if (period.equals(text[0])) {
                ProfitabilityForMounth profitabilityForMounth =new ProfitabilityForMounth();
                profitabilityForMounth.ShowProfitability();
                break;
            }
            else if (period.equals(text[1])) {
                ProfitabylityForQuartet profitabylityForQuartet = new ProfitabylityForQuartet();
                profitabylityForQuartet.ShowProfitability();
                break;
            }
            else if (period.equals(text[2])) {
                ProfitabilityForYear profitabilityForYear = new ProfitabilityForYear();
                profitabilityForYear.ShowProfitability();
            }
        }
    }
}
