package example;

import javax.xml.ws.Endpoint;

public class BookPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new BookService());
    }


}
