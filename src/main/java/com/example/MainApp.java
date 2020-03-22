package com.example;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello World");

        /**/
        CamelContext ctx = new DefaultCamelContext();
        ctx.addRoutes(new MyRouteBuilder());
        ctx.addRoutes(new RESTRouteBuilder());
        ctx.start();
        Thread.sleep(10000);
        ctx.stop();
        /**/

        /**
        import org.apache.camel.main.Main;

        Main main = new Main();
        //main.addRouteBuilder(new MyRouteBuilder());
        main.addRoutesBuilder(new MyRouteBuilder());
        main.run(args);
        **/
    }

}

