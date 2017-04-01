import java.util.Random;
public class test1 {
public static void main(String[] args){
	Random rand= new Random();
	int z= rand.nextInt(5);
	
	 String[] word_array= {"bright","deep","top","new","win"};
	  String[] syn_array= {"dull","shallow","bottoom","old","loose"};
	String word1= word_array[z];
	String the_answer= syn_array[z];
	
	 
		 System.out.println(word1);
	 
		 System.out.println(the_answer);
	 

}
}
