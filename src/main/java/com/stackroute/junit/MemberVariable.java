/*Create a class named Member with Name, age, Salary as its variable, write an other
class named Member Variable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.*/


package com.stackroute.junit;

class Member //initialized name,age and salary
{
    String name;
    int age;
    double salary;

}

public class MemberVariable{
    Member member=new Member(); //creation of object for member class
    String result="";
    public String set(String name,int age,double salary)
    {
        member.name=name;
        member.age=age;
        member.salary=salary;
        result=result+"Members Name: "+member.name+"\n"; //storing the name into result
        result=result+"Members Age: "+member.age+"\n";  //storing the age into result
        result=result+"Members Salary: "+member.salary+"\n"; //storing the salary into result
        System.out.println(result);
        return result;
    }

}