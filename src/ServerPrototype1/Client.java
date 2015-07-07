package ServerPrototype1;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Tom_Bryant on 7/7/15.
 * Client class for sending/recieving messages from the server
 */
public class Client {

    public ServerConnection server;


    public Client(int port){
        this.server = new ServerConnection(port);
        /**
         * Automatically sends messages recieved from the server
         * back to the server. (HeartBeat).
         */
        Thread reply = new Thread(){
            public void run() {
                while (true) {
                    server.write(server.getMessage());
                }
            }
        };
        reply.setDaemon(true);
        reply.start();
    }


    public static void main(String[] args){
        Client test = new Client(4001);
        while(true){

        }

    }
}
