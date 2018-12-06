package AbstractClasses;

import Interfaces.Box;

public class SweetBox implements Box {

    private Sweet[] sweetsInBox = new Sweet[0];

    private int last() {
        if (sweetsInBox.length > 1) {
            return (sweetsInBox.length - 1);
        } else {
            return 0;
        }
    }

    @Override
    public void putIn(Sweet newSweet) {
        Sweet[] tempSweetsArray = sweetsInBox;
        sweetsInBox = new Sweet[tempSweetsArray.length + 1];
        for (int i = 0; i < tempSweetsArray.length; i++) {
            sweetsInBox[i] = tempSweetsArray[i];
        }
        sweetsInBox[last()] = newSweet;
        System.out.println("Вы положили " + newSweet.getName() + " в коробочку");
        System.out.println("=====================================================");
    }

    @Override
    public void takeOut(int index) {
        System.out.println("Убираем из коробочки сладость с номером " + index + "...");
        if (index > sweetsInBox.length) {
            System.out.println("В коробочке нет сладости с номером " + index + "!");
        } else {
            Sweet[] tempSweetsArray = sweetsInBox;
            sweetsInBox = new Sweet[tempSweetsArray.length - 1];
            int innerIndex = 0;
            for (int i = 0; i < tempSweetsArray.length; i++) {
                if (index == (i + 1)) {
                    continue;
                }
                sweetsInBox[innerIndex] = tempSweetsArray[i];
                innerIndex++;
            }
            System.out.println("В коробочке больше нет сладости с номером " + index);
        }
        System.out.println("=====================================================");

    }

    @Override
    public void takeOutLast() {
        System.out.println("Убираем из коробочки последнюю сладость...");
        if (sweetsInBox.length == 0) {
            System.out.println("Нечего убирать из коробочки!");
        } else {
            Sweet[] tempSweetsArray = sweetsInBox;
            sweetsInBox = new Sweet[tempSweetsArray.length - 1];
            for (int i = 0; i < sweetsInBox.length; i++) {
                sweetsInBox[i] = tempSweetsArray[i];
            }
            System.out.println("Из коробочки убрали последнюю положенную сладость!");
        }
        System.out.println("=====================================================");
    }

    @Override
    public void lookInside() {
        System.out.println("Заглядываем в коробочку:");
        if (sweetsInBox.length == 0) {
            System.out.println("В коробочке нет сладостей!");
        } else {
            for (int i = 0; i <= last(); i++) {
                System.out.println((i + 1) + ") " + sweetsInBox[i].getName() + " с артикулом " + sweetsInBox[i].getVendorCode() +
                        ", по цене " + sweetsInBox[i].getPrice() + ", весом " + sweetsInBox[i].getWeight() + " г;");
            }
        }
        System.out.println("=====================================================");
    }

    @Override
    public void toWeight() {
        double currentWeight = 0;
        for (Sweet sweet : sweetsInBox) {
            currentWeight += sweet.getWeight();
        }
        System.out.printf("Общий вес сладостей в коробочке: %.2f г\n", currentWeight);
        System.out.println("=====================================================");
    }

    @Override
    public void getCurrentPrice() {
        double currentPrice = 0;
        for (Sweet sweet : sweetsInBox) {
            currentPrice += sweet.getPrice();
        }
        System.out.printf("В коробочке сладостей на %.2f рубл.\n", currentPrice);
        System.out.println("=====================================================");
    }
}
