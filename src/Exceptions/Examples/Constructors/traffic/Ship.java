package Exceptions.Examples.Constructors.traffic;

import java.io.IOException;

public class Ship {
    private String name;

//    {
//        try {
//            throw new IOException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    {
        if (7 == 7 ) {
        throw new IOException();
        }
    }

    public Ship() throws IOException{
    }

    public Ship(String name) throws IOException{
        this.name = name;
    }
}
