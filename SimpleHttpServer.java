import com.sun.net.httpserver.*;

import java.io.IOError;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.*;


public class SimpleHttpServer {

    public static void main(String[] args) {
        try{
        HttpServer server= HttpServer.create(new InetSocketAddress(8080),0);
        server.createContext("/",new MyHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server stared on port 8080");
        
        }
        catch(IOException e){
System.out.println("Error in starting server"+e.getMessage());
        }
        
    }
    static class MyHandler implements HttpHandler{
        @Override
        public void handle (HttpExchange exchange) throws IOException{
            String respone="Simple http server ";
         
                     
            exchange.sendResponseHeaders(200, respone.length());
            OutputStream os=exchange.getResponseBody();
            os.write(respone.getBytes());
            os.close();
        }
    }
}