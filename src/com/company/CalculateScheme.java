package com.company;
//Подкласс который наследует схему расчета от абстрактного класса, а так же формулу и сообщения
// от соответсвующих интерфейсов
public class CalculateScheme extends AbstractClassScheme implements  InterfaceCalculateFormulas{
    private String message = "Анализ рентабельности за ";
    private String title = "Анализ рентабельности";
    Message newmessage = new Message();
    //Конечный метод вывода сообения о задании
    public final void ShowMessage(String message) {
        this.message += message;
        //Использование  метода по умолчанию служащего для вывода результата из интерфеса.
        // Статическое(раннее) связывание
        newmessage.Show(this.message, title);
    }
    //Метод ввода доходов
    double income;
    public final double InputIncome(int quantityMonths) {
        message = "Введите даходы след диалоговых окнах";
        //Цикл воода дохода в зависимости от колтчествло месяцев (периода)
        for (int i = 0; i < quantityMonths; i++){
            title = "Ввод доходов за месяц №" + (i + 1);
            income += (Integer.parseInt(newmessage.InputDate(message, title)));
        }
        return income;
    }
    //Метод ввода расходов
    double costs;
    public final double InputCosts(int quantityMonths) {
        message = "Введите расходы в след диалоговых окнах";
        for (int i = 0; i < quantityMonths; i++){
            title = "Ввод расходов за месяц №" + (i + 1);
            costs += (Double.parseDouble(newmessage.InputDate(message, title)));
        }
        return costs;
    }
    //Метод расчета показателей рентабельности
    public final double CalculateProfitability(double income, double costs) {
        return InterfaceCalculateFormulas.super.Calculate(income,costs);
    }
    //Метод вывода результатов
    public final void ShowResult(String period, double result) {
        message = "Процент рентабельности вашего предприятия за " + period
                + " составил: " + ((Math.round(result) * 100)/100) + "%\n";
        if (result >= 80) {
            message += "Ваш бизнес является рентабельным";
        }
        else {
            message += "Бизнес не рентабелен :(";
        }
        newmessage.Show(message);
    }
}
