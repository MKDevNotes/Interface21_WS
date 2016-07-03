package org.dn.aop.example;

import org.dn.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppMain 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("aopExampleContext.xml");
       
       ShapeService service = context.getBean("shapeService",ShapeService.class);
       
       System.out.println(service.getCircle().getName());
    }
}
