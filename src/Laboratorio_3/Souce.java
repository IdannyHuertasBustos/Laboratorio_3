package Laboratorio_3;

import Controlador.Controlador;


public class Souce {

    public static void main(String[] args) {

        //Schedule a job for the event-dispatching thread:

        //creating and showing this application's GUI.
        Controlador controller = new Controlador();
        // Start the application
        controller.startApplication();
        }
}
