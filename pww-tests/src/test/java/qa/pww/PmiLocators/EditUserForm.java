package qa.pww.PmiLocators;

/**
 * Created by k.smotrov on 29.08.2017.
 */

//ФОРМА РЕДАКТИРОВАНИЯ ПОЛЬЗОВАТЕЛЯ

public abstract class EditUserForm {

    //поля
    public static String EDITUSERLNAME = "html/body/div[8]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/form/div/fieldset[2]/div/div[1]/div[1]/div/input";

    //роли
    public static String EDITUSERROLE = "//tr/td[2]/div";

    //кнопки
    public static String SAVEEDITUSERBTN = "//button[text() = 'Сохранить изменения']";
    public static String EXITEDITUSERBTN = "//button[text() = 'Закрыть']";

    public static String OKEDITBTN = "html/body/div[9]/div[2]/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/em/button";
}
