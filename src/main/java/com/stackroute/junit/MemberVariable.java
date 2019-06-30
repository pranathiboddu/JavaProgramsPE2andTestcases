/*Create a class named Member with Name, age, Salary as its variable, write an other
class named Member Variable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.*/


package com.stackroute.junit;

class Member {
    String name;
    int age;
    double salary;

}

public class MemberVariable{
    Member member=new Member();
    String result="";
    public String set(String name,int age,double salary)
    {
        member.name=name;
        member.age=age;
        member.salary=salary;
        result=result+"Members Name: "+member.name+"\n";
        result=result+"Members Age: "+member.age+"\n";
        result=result+"Members Salary: "+member.salary+"\n";
        System.out.println(result);
        return result;
    }

}