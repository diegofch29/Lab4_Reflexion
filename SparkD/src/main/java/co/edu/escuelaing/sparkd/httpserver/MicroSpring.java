/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.httpserver;

import static java.lang.System.out;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class MicroSpring implements URIProcessor{
    
    Map<String,Method> webservices=new HashMap<>();
   public  void mapService(String ComponetnName) throws Exception {
       

      int nMethods=0;

      for (Method m : Class.forName(ComponetnName).getMethods()) {
          if (m.isAnnotationPresent(RequestMapping.class)) {
              System.out.println("Tiene anotacion @Requestmapping");
              RequestMapping rm = m.getAnnotation(RequestMapping.class);
              webservices.put(rm.value(), m);
              nMethods++;
            }
         }

      System.out.printf("No of Web Services %d %n", nMethods);

   }
   
   public String executeService (String theuri){
        try {
            return webservices.get(theuri).invoke(null).toString();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
}

