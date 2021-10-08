/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;

/**
 *
 * @author LENOVO
 */
import config.SequenceGeneratorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args){
        //ApplicationContext context=new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
        ApplicationContext context=new AnnotationConfigApplicationContext("sequence");
        SequenceDao generator=context.getBean(SequenceDao.class);
        System.out.println(generator.getNextValue("IT"));
        System.out.println(generator.getNextValue("IT"));
    }
}
