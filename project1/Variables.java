package project1;

class Person {
    String name;
    int age;
    boolean gender;

    public Person (String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public Person (String name, int age, boolean gender) {
        this.name = name;
        this.age  = age;
    }

    // public void greet(){
    //     System.out.println(name + "is greeting you");
    // }
}

public class Variables {
    public static void main(String[] args) {

        //USING CONSTRUCTORS TO CREATE OBJECTS
        // Person human1 = new Person("Jack",30);
        // Person human2 = new Person("John",20);
        // System.out.println(human1.name + " is " + human1.age + " years old" );
        // System.out.println(human2.name + " is " + human2.age + " years old" );

        //VARIABLES
        // int myInt = 2;
        // byte myByte = 2;
        // short myShort = 2;
        // long myLong = 283893434;
        // float myFloat = 2.2F;
        // double myDouble = 2.2D;
        // char myChar = 'R';
        // boolean myBoolean = true;
        // final int HOURS = 24;

        //TYPE CASTING/TYPE CONVERSION
        // int num1 = 10;
        // int num2 = 2;
        // float results = (float)num1 / num2;
        // System.out.println("first type casting results: "+results);

        //TYPE CASTING/TYPE CONVERSION 2
        // short num3 = 20;
        // int num4 = num3;
        // float num5 = num4;
        // System.out.println("conversion to int " + num4);
        // System.out.println("conversion to float " + num5);


        // IF ELSE
        // int num1 = 30;
        // int num2 = 30;
        // if (num1 == num2) {
        //     System.out.println("Num1 is equal to Num2");
        // } else if (num1 < num2) {
        //     System.out.println("Okay");
        // }
        // else {
        //     System.out.println("Num1 is NOT equal to Num2");
        // }


        //FOR EACH LOOP
        // int[] myNo = {1,2,3,4,5,6,7,8};
        // for (int i: myNo){
        //     System.out.println(i);
        // }
    }

}
