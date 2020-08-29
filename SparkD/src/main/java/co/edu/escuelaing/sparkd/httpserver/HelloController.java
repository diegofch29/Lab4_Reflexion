/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.httpserver;

/**
 *
 * @author diego
 */
public class HelloController {
    
    @RequestMapping("/hello")
    public static String hell(){
        return "Greetings from Sppirng boot";
    }
    

    
    @RequestMapping("/E")
    public static String thevalueofE(){
        String outputLine =
                 "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>the value of EULER is</h1>\n"
                +"<p>"+Math.E+"</p>"
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }
    
    @RequestMapping("/pi")
    public static String page(){
        String outputLine =
                 "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>the value of PI is</h1>\n"
                +"<p>"+Math.PI+"</p>"
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }
}
