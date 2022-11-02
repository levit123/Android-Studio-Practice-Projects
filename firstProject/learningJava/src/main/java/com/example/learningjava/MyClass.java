package com.example.learningjava;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hewwo OwO!");

        String name = "Levi";
        int age = 25;

        System.out.println(name + " is " + age + " years old.");

        boolean iAmCool = false;

        if (iAmCool == true)
        {
            System.out.println("This is true\n");
        }
        else
        {
            System.out.println("This is false!\n");
        }

        String[] dogNames = new String[]{"Fido", "Charlie", "Koko", "Roxie", "Ruby"};
        //System.out.println(dogNames[3]);

        for (int i = 0; i < dogNames.length; i++)
        {
            sayHelloToDog(dogNames[i]);
        }
    }

    public static void sayHelloToDog(String dogName)
    {
        System.out.println("Oh hai " + dogName);
    }
}