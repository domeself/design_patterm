package com.structural.decorator;

/**
 * 1.为了扩展功能
 * 2.动态扩展不修改原类代码
 * 3.嵌套式，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Swimmers swimmers = new Swimmers();
        System.out.println("豹子头游戏玩家---");
        swimmers.swim();

        System.out.println("冲了10元礼包---");
        ButterflyDecorator butterflyDecorator = new ButterflyDecorator();
        butterflyDecorator.setSwimmer(swimmers);
        butterflyDecorator.swim();

        System.out.println("体验不错，又冲了10000元以后---");
        BreaststrokeDecorator breaststrokeDecorator = new BreaststrokeDecorator();
        breaststrokeDecorator.setSwimmer(butterflyDecorator);
        breaststrokeDecorator.swim();

    }
}
