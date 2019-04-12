package Client;

import Client.Controller.Client;
import Client.Controller.Listener;
import Client.View.UserGUI;

import java.io.IOException;

/**
 * this is the front end for the tool shop. ie. the client side
 */

public class FrontEnd {

    public static void main(String[] args) throws IOException {
//
        Client client = new Client("localhost", 5050);
        UserGUI gui = new UserGUI();
        gui.setListener(new Listener(client));
        gui.updateView(gui);
    }
}
