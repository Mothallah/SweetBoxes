package Interfaces;

import AbstractClasses.Sweet;

public interface Box {

    void putIn(Sweet sweet);

    void takeOut(int index);

    void takeOutLast();

    void lookInside();

    void toWeight();

    void getCurrentPrice();

}
