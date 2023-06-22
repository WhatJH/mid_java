package mid;

import java.util.Scanner;

public class pjh20220788_mid2 {


			// switch 버전
			    public static void main(String[] args){
			      


			      Scanner in = new Scanner(System.in);
			      System.out.println("컴퓨터와 가위바위보 게임을 해봅시다! 가위: 1, 바위:2, 보:3");
			      int live = 3;

			     //가위바위보 for 루프

			      
			     for(;;){
			      
			      System.out.print("\n 안내면 진다 가위(1), 바위(2), 보(3)! \n");
			      int hand = in.nextInt();
			      String handString =""; 


			      //가위바위보 switch
			      switch (hand) {
			        case 1: 
			             handString = "가위";
			             break;
			        case 2: 
			             handString = "바위";
			             break; 
			        case 3: 
			             handString = "보";
			             break;
			}
			      
			     }
			    }
	}


}
