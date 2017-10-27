package qa.pww.PmiLocators;

/**
 * Created by k.smotrov on 29.08.2017.
 */

//СТРАНИЦА РОЛИ

public abstract class RolePage {

    //кнопки
    public static String ADDROLEBTN = "//button[text() = 'Добавить']";
    public static String DELETEROLEBTN = "//button[text() = 'Удалить']";
    public static String SAVEROLEBTN = "//button[text() = 'Сохранить']";
    public static String ESCAPEROLEBTN = "//button[text() = 'Отменить']";

    //поля
    public static String NAMEROLE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[1]/table/tbody/tr/td[1]/div";
    public static String DESCRIPTIONROLE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[1]/table/tbody/tr/td[2]/div";
    public static String RULEROLE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[1]/table/tbody/tr/td[3]";

    //права
    public static String MAINPAGERULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[1]/div[1]/img[3]";
    public static String PATCHNOTERULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[1]/div[2]/div/div/img[3]";
    public static String TYPERULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/div/img[3]";
    public static String BOOKRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[1]/img[3]";
    public static String SKIPSECONDSTAGERULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/div/img[3]";
    public static String LOADRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[4]/div/img[3]";
    public static String SAVERULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[5]/div/img[3]";
    public static String INPUTRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[6]/div/img[3]";
    public static String KORRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[7]/div/img[3]";
    public static String STATSRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[8]/div/img[3]";
    public static String EDRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[9]/div/img[3]";
    public static String DISTRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[10]/div/img[3]";
    public static String ROLERULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[11]/div/img[3]";
    public static String USERRULE = "html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div[12]/div/img[3]";
}
