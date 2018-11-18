package com.decorator;

/**
 * 1.为了扩展功能
 * 2.动态扩展不修改原类代码
 * 3.嵌套式，热插拔
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
