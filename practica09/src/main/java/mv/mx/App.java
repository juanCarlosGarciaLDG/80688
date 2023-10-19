package mv.mx;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
         get("/", 
         (request, response) -> "<h1>Hola mundo!</h1>"
         );
         
         System.out.println( "Hello World!" );
         get("/hola", 
         (request, response) -> "<h1>Bienvenidos</h1>"
         );

         System.out.println( "Hello World!" );
         get("/adios", 
         (request, response) -> "<h1>adios mundo!</h1>"
         );

         System.out.println( "Hello World!" );
         get("/fin", 
         (request, response) -> "<h1>fin mundo!</h1>"
         );
    }
}
