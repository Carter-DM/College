package javacp2560.lab5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric
 */
public class ServerConnection implements Runnable {

    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Socket connection;
    private List<String> hands;
    
    public ServerConnection(Socket _connection) {
        hands = Arrays.asList("Rock", "Paper", "Scissors");
        connection = _connection;
        try {
        getStreams();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    // get streams to send and receive data
   private void getStreams() throws IOException
   {
      // set up output stream for objects
      output = new ObjectOutputStream( connection.getOutputStream() );
      output.flush(); // flush output buffer to send header information

      // set up input stream for objects
      input = new ObjectInputStream( connection.getInputStream() );

      //displayMessage( "\nGot I/O streams\n" );
   } // end method getStreams
    
    
    @Override
    public void run() {
        try {
         processConnection();
        }
        catch( IOException ex) {
            ex.printStackTrace();
        }
        closeConnection();
    }
    
    // process connection with client
   private void processConnection() throws IOException
   {
      String message = "Connection successful";
      sendData( message ); // send connection successful message
      // enable enterField so server user can send messages
      //setTextFieldEditable( true );

      do // process messages sent from client
      { 
         try // read message and display it
         {
             message = ( String ) input.readObject(); // read new message
             sendData(getRandomRockPaperScissorsHand());
            //displayMessage( "\n" + message ); // display message
         } // end try
         catch ( ClassNotFoundException classNotFoundException ) 
         {
            //displayMessage( "\nUnknown object type received" );
         } // end catch

      } while ( !message.equals( "CLIENT>>> TERMINATE" ) );
   } // end method processConnection

    // Get random rock paper scissors hand
    private String getRandomRockPaperScissorsHand() {
        Random random = new Random();
        int rand = random.nextInt(3);
        return hands.get(rand);
    }

   // close streams and socket
   private void closeConnection() 
   {
      //displayMessage( "\nTerminating connection\n" );
      //setTextFieldEditable( false ); // disable enterField

      try 
      {
         output.close(); // close output stream
         input.close(); // close input stream
         connection.close(); // close socket
      } // end try
      catch ( IOException ioException ) 
      {
         ioException.printStackTrace();
      } // end catch
   } // end method closeConnection
   
    // send message to client
   private void sendData( String message )
   {
      try // send object to client
      {
         output.writeObject( "SERVER>>> " + message );
         output.flush(); // flush output to client
         //displayMessage( "\nSERVER>>> " + message );
      } // end try
      catch ( IOException ioException ) 
      {
         //displayArea.append( "\nError writing object" );
      } // end catch
   } // end method sendData
}
