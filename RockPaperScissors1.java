package RockPaperScissors;

// Author: Yash Patel
// Creation Date: May 6th, 2021
// Purpose: To create a final project that allows the user to play Rock Paper Scissors using JavaFX

// Test Data: Please see the project summary and write-up document for full testing details. 
// A link to the document is pasted after the program code if needed.

//importing statements
import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;



public class RockPaperScissors1 extends Application 
{
	// Creating private labels 
	  
	   private Label greeting1;
	   private Label greeting2;
	   private Label greeting3;
	   private Label greeting4;
	   private Label greeting5;
	   private Label greeting6;
	   private Label resultText;
	   private Label points; 
	   static Label opponent; //this is the only static label which allowed my DisplayBot class to function correctly
	   // private variables to hold user turns and bot turns
	   private int random = 0 ;
	   private int user = 0 ;
	   
	   //creating private variables to hold the points for  player and bot
	   private int player = 0 ;
	   private int bot = 0 ;
	   
	   // int var to hold the upperbound number for the random number generator
	   private int upperbound = 3 ;
	  
	
	public static void main(String[] args) 
	{
		// Launch the application.
	      launch(args);	

	}
	
	@Override
	public void start(Stage primaryStage)
	{
		
		//picking a random number from 0 to 2 (upperbound = 3 and upperbound-1 = 2)
		Random rand = new Random(); //instance of random class 
		//making the picked number equal the var random
		random = rand.nextInt(upperbound);  
		
		// Create a Label to display greeting messages.
	      Label greeting1 = new Label("WELCOME TO ROCK PAPER SCISSORS!");
	      Label greeting2 = new Label("The rules are: Rock Defeats Scissors, Paper Defeats Rock, and Scissors Defeats Paper.");
	      Label greeting3 = new Label("You will be playing against the computer.");
	      Label greeting4 = new Label("Click one of the three images to select your option."); 
	      Label greeting5 = new Label("When you are done, click the FIGHT button below to play.");
	      Label greeting6 = new Label("To reset the points counter, click the 'Reset' button below.");
	      
	      //setting the font and size of the labels. 
	      greeting1.setFont(new Font("Arial", 26));
	      greeting2.setFont(new Font("Arial", 18));
	      greeting3.setFont(new Font("Arial", 18));
	      greeting4.setFont(new Font("Arial", 18));
	      greeting5.setFont(new Font("Arial", 18));
	      greeting6.setFont(new Font("Arial", 18));
	      
	      
	   // Put the HBoxs, calcButton, and points in a VBox.
	      VBox greetingVBox = new VBox(greeting1, greeting2, greeting3, greeting4, greeting5, greeting6);
	      
	      //align vbox in the center
	      greetingVBox.setAlignment(Pos.CENTER);
	      
	   // Create Image objects for the 3 game options.
	      Image rock = new Image("rock.png");
	      Image paper = new Image("paper.png");
	      Image scissors = new Image("scissors.png");
	      Image fight = new Image ("fight.jpeg");
	      
	   // Create an ImageView object.
	      ImageView imageView1 = new ImageView(rock);
	      
	      // Resize the ImageView, preserving its aspect ratio.
	      imageView1.setFitWidth(200);
	      imageView1.setPreserveRatio(true);
	      
	      
	      // Create an ImageView object.
	      ImageView imageView2 = new ImageView(paper);
	      
	      // Resize the ImageView, preserving its aspect ratio.
	      imageView2.setFitWidth(200);
	      imageView2.setPreserveRatio(true);
	      
	      
	      
	      // Create an ImageView object.
	      ImageView imageView3 = new ImageView(scissors);
	      
	      // Resize the ImageView, preserving its aspect ratio.
	      imageView3.setFitWidth(200);
	      imageView3.setPreserveRatio(true);
	      
	   // Create an ImageView object.
	      ImageView imageView4 = new ImageView(fight);
	      
	      // Resize the ImageView, preserving its aspect ratio (made it a bit smaller)
	      imageView4.setFitWidth(120);
	      imageView4.setPreserveRatio(true);
	      
	      
	      
	   // Put the ImageView in an HBox.
	      HBox imageHBox = new HBox( imageView1, imageView2, imageView3);
	      
	      // Center the HBox contents.
	      imageHBox.setAlignment(Pos.CENTER);
	      
	      //registering an event handler for mouse clicks for the corresponding imageView object
	      imageView1.setOnMouseClicked(event -> 
	        {
	         user = 0;
	      });
	    //registering an event handler for mouse clicks for the corresponding imageView object  
	      imageView2.setOnMouseClicked(event -> 
	      {
	         user = 1;
	      });
	    //registering an event handler for mouse clicks for the corresponding imageView object  
	      imageView3.setOnMouseClicked(event -> 
	      {
	         user = 2;
	      });
	      
	   // creating bank label that can be changed based on the output from the if statement below
	      resultText = new Label();
	      
	   // creating bank label that can be changed based on the output from the if statement below
	      points = new Label();
	      
	    //registering an event handler for mouse clicks for the corresponding label object
	      imageView4.setOnMouseClicked(event -> 
	      {
	    	  
	    	  
	        //if statements to check and see who won the game
	         if (user == 0 && random == 0)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You tied! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	           
	         }
	        
	         
	         if (user == 1 && random == 1)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You tied! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         
	         if (user == 2 && random == 2)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You tied! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         
	         if (user == 0 && random == 1)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You lost! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	           
	           bot += 1 ;
	           
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         if (user == 1 && random == 0)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You won! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	           
	           player += 1 ;
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         if (user == 1 && random == 2)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You lost! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	           
	           bot += 1 ;
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         if (user == 2 && random == 1)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You won! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	           
	           player += 1 ;
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         
	         if (user == 0 && random == 2)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You won! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	           player += 1 ;
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         if (user == 2 && random == 0)
	         {
	         // Create a Label to display a prompt.
	           resultText.setText("You lost! "+
	                        "Click the images to play again.");
	           resultText.setFont(new Font("Arial", 14));
	           
	           bot += 1 ;
	        // Create a Label to display a prompt.
	 	      points.setText("Player Points: " + player + "      Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	         }
	         
	         //sends the value of random to the main method of the DisplayBot class
	        DisplayBot.main(random);
	        // picks new random variable for the computer's next turn
	        random = rand.nextInt(upperbound); 
	        
	        
	      });
	      
	   // creating bank label that can be changed based on the output from random number generator
	      opponent = new Label();
	     
	     opponent.setText("The computer played: ");
    	 opponent.setFont(new Font("Arial", 14));
           
	      
	   // Create a Button to perform the calculation.
	      Button resetButton = new Button("Reset Point Counter");
	      
	      resetButton.setFont(new Font("Arial", 14));
	      
	      // Register the event handler
	      resetButton.setOnAction(new ResetButtonHandler());
	      
	  
	   
	     
	    	  
	   // Put the HBoxs, calcButton, and points in a VBox.
	      VBox vbox = new VBox( greetingVBox,imageView4, imageHBox, opponent, resultText, points, resetButton);
	      
	      //align vbox in the center
	      vbox.setAlignment(Pos.CENTER);
	      

	            
	            
	      // Create a scene to hold all the objects
	      Scene scene = new Scene(vbox, 850, 650);


	      // Add the Scene to the Stage.
	     primaryStage.setScene(scene);
	      
	      // Set the stage title.
	      primaryStage.setTitle("Final Project: Rock, Paper, Scissors");
	      
	      // Show the window.
	      primaryStage.show();  
	      
	      

	
	
	}
	
	
	
	//unique class that extends another class
	
	public static class DisplayBot extends RockPaperScissors1
	{   
		
		/** The method main is used to display the computer's turn for the player to see. 
	      
        @param The int variable random is to hold the computer's turn in number form that is passed through to this method.
               
              
        @return n/a
        */


		public static void main (int random)
	      {
			
	    	 //if random = 0, computer picks rock
	    	  if (random == 0)
	          {
	          // Create a Label to display a prompt.
	    	 opponent.setText("The computer played: ROCK.");
	    	 opponent.setFont(new Font("Arial", 14));
	           
	            
	          }
	  		
	    	//if random = 1, computer picks paper
	  		if (random == 1)
	          {
	          // Create a Label to display a prompt.
	  		opponent.setText("The computer played: PAPER.");
		    opponent.setFont(new Font("Arial", 14));
	            
	          }
	  		
	  	//if random = 2, computer picks scissors
	  		if (random == 2)
	          {
	          // Create a Label to display a prompt.
	  			opponent.setText("The computer played: SCISSORS.");
			    opponent.setFont(new Font("Arial", 14));
	           
	          } 
	      }
		
	}
	
	public class ResetButtonHandler implements EventHandler<ActionEvent> 
	   {
		
		
		/** The method handle is used to handle the action of pressing the reset button. 
	      
        @param The parameter is event which is triggered when the reset button is clicked.
               
              
        @return n/a
        */

	      @Override
	      public void handle(ActionEvent event)
	      {
	    	  //resets the points for bot and player to 0
	    	  bot = 0 ;
	    	  player = 0 ;
	    	  
	    	// Create a Label to display a prompt and effectively update the points to 0
	 	      points.setText("Player Points: " + player + "     Bot Points: "+ bot);
	 	      points.setFont(new Font("Arial", 14));
	    		
	    	  
	      }
	        
	      
	   }

	
}

// Testing Data Link Below:
// https://docs.google.com/document/d/18eG4Kszu5gI5fs2oszMpALHQ3vIuZPD1l0IBV7JNabk/edit?usp=sharing 
