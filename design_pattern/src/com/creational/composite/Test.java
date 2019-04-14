package com.creational.composite;

/**
 * @module javaSE
 * @ClassName Test
 * @Description
 * @Author superNove
 * @Date 2019/4/15 1:42
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Branch root = new Branch("主干");
        root.add(new Leaf("主干的叶子"));
        root.add(new Leaf("主干的叶子"));
        Branch branch1 = new Branch("树干1");
        Branch branch2= new Branch("树干2");

        branch1.add(new Leaf("树干1的叶子"));
        branch1.add(new Leaf("树干1的叶子"));
        branch2.add(new Leaf("树干2的叶子"));
        branch2.add(new Leaf("树干2的叶子"));
        branch2.add(new Leaf("树干2的叶子"));

        Branch branch3 = new Branch("树枝2的分枝");
        branch3.add(new Leaf("树干3的叶子"));
        branch2.add(branch3);
        root.add(branch1);
        root.add(branch2);

        root.display();
    }
}
