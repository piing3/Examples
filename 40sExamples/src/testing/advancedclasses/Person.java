/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing.advancedclasses;

/**
 * Project:
 * Author: Davin
 * Date: 1-Mar-2016
 * Teacher: Mr. Wachs 
 */
public class Person {
    private String name;
    public int age;
    
    /**
     * Default constructor method
     */
    public Person() {
        age = 0;
        name = "John Doe";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }
    
    public void talk(String message){
        System.out.println(name+": "+message);
    }
    
    public void talk(){
        System.out.println(name+" is "+age);
    }
    
}
