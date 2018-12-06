import AbstractClasses.Sweet;
import AbstractClasses.SweetBox;
import Interfaces.Box;
import Sweets.Chocolate;
import Sweets.Lollipop;
import Sweets.Сrustula;

public class Main {
    public static void main(String[] args) {
        Sweet alpenGold = new Chocolate("Альпен голд", "qwe", 100, 100);
        Sweet yubileynoye = new Сrustula("Юбилейное", "asd", 50, 250);
        Sweet chupaShups = new Lollipop("Чупа-чупс", "zxc", 12, 20);
        Box newYearBox = new SweetBox();
        newYearBox.putIn(alpenGold);
        newYearBox.putIn(yubileynoye);
        newYearBox.putIn(chupaShups);
        newYearBox.lookInside();
        newYearBox.toWeight();
        newYearBox.getCurrentPrice();
        newYearBox.takeOut(1);
        newYearBox.lookInside();
        newYearBox.takeOutLast();
        newYearBox.lookInside();
        newYearBox.takeOutLast();
        newYearBox.lookInside();
        newYearBox.takeOutLast();
    }

}
