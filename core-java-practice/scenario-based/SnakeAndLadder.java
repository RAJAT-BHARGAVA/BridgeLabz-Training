import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String [] args ){
        // uc1 
        System.out.println("Enter the number of Players to play 1 for single and 2 for team");
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if(player == 1){
            singlePlayer();
        }else if (player == 2){
            twoPlayers();
        }else{
            System.out.println("Please enter the valid value 1 or 2");
        }
        scanner.close();

    }
    // function for the two player 
    public static void twoPlayers(){
        int player1Position = 0;
        int player2Position = 0;
        while (player1Position!=100 && player2Position!=100) {
            player1Position =cal(player1Position);
            player2Position =cal(player2Position);
        }
        if(player1Position==100){
            System.out.println("player 1 won the game ");
        }else{
            System.out.println("player 2 won the game ");
        }
    }
    // use in the two player 
    public static int cal(int startPosition){
        int diceVal= diceRoll();
        String option = play();
        switch(option){
            case "No Play":
                break;
            case "Ladder":
                if(startPosition+diceVal>100)break;
                startPosition+=diceVal;
                cal(startPosition);
                break;
            case "Snake":
                startPosition-=diceVal;
                if(startPosition<0)startPosition=0;
                break;       
        }
            return startPosition;
    }

    // function when only single player is playing 
    public static void singlePlayer(){
        int startPosition = 0;
        System.out.println("the position before rolling dice :  "+startPosition);
        int count = 0;
        while(startPosition!=100){
            int diceVal= diceRoll();
            String option = play();
            count++;
            switch(option){
                case "No Play":
                    break;
                case "Ladder":
                    if(startPosition+diceVal>100)break;
                    startPosition+=diceVal;
                    break;
                case "Snake":
                    startPosition-=diceVal;
                    if(startPosition<0)startPosition=0;
                    break;
                    
            }
            System.out.println("You are at the :    " + startPosition + " Position after role the dice ");
        }
        System.out.println("the dice roles totaly " + count);
    }
    // function tu roll the dice randomly
    public static int diceRoll(){
        return (int)(Math.random()*6)+1;
    }
    // function to define the state 
    public static String play(){
        int val = (int)(Math.random()*3);
        return val==0?"No Play":val==1?"Ladder":"Snake";
    }   
}
