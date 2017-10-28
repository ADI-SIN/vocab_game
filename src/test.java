import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class test extends JFrame {
	private JList answer;
	private JList antonyms;
	private JButton move;
	private JButton submit;
	
	private JTextField text1;
	private JTextField text2;
	
	
	//private JTextField text3;
	//private JTextField text4;
	
	
	Random rand= new Random();
	int z= rand.nextInt(10);
	
	
	
	private static String[] word_array= {"bright","deep","accept","abundant","victory","bless","bold","hope","giant","guest","love","up"};
	private static String[] syn_array= {"dull","shallow","refuse","scarce","defeat","curse","timid","despair","dwarf","host","hate","down"};
	String word1= word_array[z];
	String the_answer= syn_array[z];
	
	
	
	
	
	
	
	   test()
	   {
		   super("This is a PICK ANTONYM game !!");
		   setLayout(new FlowLayout());
		   
		   text1 = new JTextField("                                                You have to move the Antonym(/s) of the given word to the right box                 ");
		   text1.setBackground(Color.ORANGE);
		   text2 = new JTextField("                      "+word1,25);
		   text2.setBackground(Color.MAGENTA);
		   add(text1);
		   add(text2);
		   //text3 = new JTextField("if background color change will show your Result",40);
		   //text4 = new JTextField("if GREEN..YOU WON else, if RED..YOU LOSE",40);
		   
		   
		   
		   antonyms= new JList(syn_array);
		   antonyms.setVisibleRowCount(6);
		   antonyms.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		   add(new JScrollPane(antonyms));
		   
		   move= new JButton("MOVE  YOUR ANSWER TO RIGHT --->");
			move.addActionListener(
					new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							answer.setListData(antonyms.getSelectedValues());
						}
					}
					);
			add(move);
			
			answer= new JList();
			answer.setVisibleRowCount(2);
			answer.setFixedCellHeight(15);
			answer.setFixedCellWidth(90);
			answer.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			add(new JScrollPane(answer));
			
	       // String compare= antonyms.getSelectedValue().toString();
	       
	        
			handler handle= new handler();
			
			submit= new JButton("Submit your answer");
			submit.addActionListener(handle);
			add(submit);
			
			 
			//add(text3);
			//add(text4);
			
			
			
				
					
	   }
	   
	   private class handler implements ActionListener{
		   
		  private JTextField result;
		   
		   public void actionPerformed(ActionEvent event1){
			   
			   Object ob=  answer.getModel().getElementAt(0);                     //this is to get the string of JList answer at 0th position(i.e first string)...u have to create object
			   String compare=ob.toString();
			   
			   
			   
			   if(compare.equals(the_answer))
				{
				   getContentPane().setBackground(Color.GREEN);
				  JOptionPane.showMessageDialog(getParent(), " CONGRATULATIONS !!! ........CORRECT CHOICE");
				   
				   
			    }
			   else
			   {
				   getContentPane().setBackground(Color.RED);
				   JOptionPane.showMessageDialog(getParent(), " OOPS!!.....WRONG CHOICE\nThe correct answer was "+the_answer);
				  
				   
			   }
			   add(result);
			}
			  
			   
		 
		  
		   }
		   
		  
		   
	   }
			
			
		
			
			
			 
			
			
			
			
		   
		   
		   
	   
	
	


