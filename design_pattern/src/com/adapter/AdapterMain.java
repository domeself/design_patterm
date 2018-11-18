package com.adapter;

public class AdapterMain {
    public static void main(String[] args) {
       /* TargetInterface clazzAdapter = new ClazzAdapter();
        clazzAdapter.method1();
        clazzAdapter.method2();*/
      /* Source source = new Source();
        TargetInterface objectAdapter = new ObjectAdapter(source);
       objectAdapter.method1();
       objectAdapter.method2();*/
      TargetInterface method1Adater = new Method1Adapter();
      method1Adater.method1();
      method1Adater.method2();

      TargetInterface method2AdaPter = new Method2Adapter();
      method2AdaPter.method1();
      method2AdaPter.method2();
    }
}
