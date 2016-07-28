package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Following the SPring Tutorial on JavaBrains.
 * {@link} https://javabrains.io/courses/spring_core/lessons/Writing-Code-Using-
 * the-Bean-Factory
 * 
 * @author Manglu
 *
 */
public class DrawingApp {

	/**
	 * 
	 * Started off with the XMLBeanFactory (which is deprecated) and then
	 * replaced that with the AplicationContext which is the replacement
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// XmlBeanFactory has been deprecated as I follow this tutorial, i
		// shodul also find the replacement component
		// Ideally I would move away from XML and use annotations only..

		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle aShape = (Triangle) context.getBean("triangle");

		aShape.draw();

	}

}
