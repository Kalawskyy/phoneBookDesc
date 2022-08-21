package Frames;

public class Person {
    String name,surname,city,number1,number2,number3;
    Person(String name,String surname,String numer1){

    }
    Person(String name,String surname,String city,String number1,String number2,String number3){
        this.name=name;
        this.surname=surname;
        this.city=city;
        this.number1=number1;
        this.number2=number2;
        this.number3=number3;
    }
    String fullName(){
        String fullName=name+" "+surname;
        return fullName;
    }
}
