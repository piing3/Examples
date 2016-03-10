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
public class Student extends Person{
    private int studentNumber;

    public Student() {
        studentNumber = -1;
    }  
    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public Student(int studentNumber, String name, int age) {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    @Override
    public void talk() {
        System.out.println(this.getName()+" is "+age+" and is student number "+this.studentNumber);
    }
}
