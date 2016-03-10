/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import testing.advancedclasses.Person;
import testing.advancedclasses.Student;

/**
 * Project:
 * Author: Davin
 * Date: 29-Feb-2016
 * Teacher: Mr. Wachs 
 */
public class AdvancedClassesTest {

    public AdvancedClassesTest() {
        Person dave = new Person();
        dave.age = 34;
        dave.setName("Dave");
        dave.talk();
        
        Student rick = new Student(10001);
        rick.age = 17;
        rick.setName("Rick");
        rick.talk();
        
        System.out.println(dave.toString());
        
        if (rick.equals(dave)) System.out.println("=");
        else System.out.println("!=");
    }

}
