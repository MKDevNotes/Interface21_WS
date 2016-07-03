package com.dn.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * "The Developers Notes" BeanFactory Example Spring 3.0.5
 *
 * @author muthukumar thangavinayagam
 *
 */
public class DrawingApplication 
{ 
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("beanFactory.xml"));
        Triangle triangle = (Triangle)beanFactory.getBean("triangleBean");
        triangle.draw();
    }
}
