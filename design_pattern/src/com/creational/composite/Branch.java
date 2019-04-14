package com.creational.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @module javaSE
 * @ClassName Branch
 * @Description
 * @Author superNove
 * @Date 2019/4/15 1:43
 * @Version 1.0
 */

public class Branch extends Component {
    private String name;

    public Branch(String name) {
        this.name = name;
    }
    private List<Leaf> leafList = new  ArrayList<>();
    private List<Branch> branchList = new ArrayList<>();
    @Override
    public void display() {
        System.out.println("我是"+name);

        for (int i = 0; i <leafList.size(); i++) {
           leafList.get(i).display();
        }
        for (int i = 0; i <branchList.size() ; i++) {
            branchList.get(i).display();
        }
    }

    public void add(Leaf leaf){
        leafList.add(leaf);
    }

    public void add(Branch branch){
        branchList.add(branch);
    }
}
