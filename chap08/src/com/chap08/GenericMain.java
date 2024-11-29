package com.chap08;

public class GenericMain {
    public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setData("안녕");
        String data = stringInstance.getData();
        System.out.println(data);

        GenericClass<Integer> integerInstance = new GenericClass<>();
        integerInstance.setData(10);
        int i = integerInstance.getData();
        System.out.println(i);

        GenericClass<Custom> customInstance = new GenericClass<>();
        customInstance.setData(new Custom());
        Custom c = customInstance.getData();
        System.out.println(c);

        //번외(Object 사용)
        GenericClass<Object> objInstance = new GenericClass<>();
        objInstance.setData(10);
        objInstance.setData("Hello");

        String a = (String) objInstance.getData();
        System.out.println(a);
    }
}
