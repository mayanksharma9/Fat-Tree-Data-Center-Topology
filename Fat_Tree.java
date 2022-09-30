public import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactoryException;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
class Research_Project_Fat_Tree
{

         public static int K;
         public static int CORESWITCHES;
         public static int NUMBEROFPODS;
         public static int AGGSWITCHES;
         public static int EDGESWITCHES;
         public static int PMACHINE;

         
  public static void main(String args[])
  {
     
     Scanner in = new Scanner(System.in);
     System.out.println("Enter value of K: ");
     
     while(true){
      K = in.nextInt();
      if(K%2 == 0){
         System.out.println("Entered value of K is " + K);
         break;
      } 
      else
      System.out.println("Entered value of K is odd. Please enter again: ");
      continue;
      }    
      arrayOfswitch();
      listOfNodes();
  }

private static void listOfNodes() {
   Scanner scanner = new Scanner(System.in);
   int i;
   int CORESWITCHES = (K/2)*2 , NUMBEROFPODS = K , AGGSWITCHES = (K*K)/2 , EDGESWITCHES =(K*K)/2 ,  PMACHINE = (K*K*K)/4;
   ArrayList<String> nodes = new ArrayList<String>();
            
            
            for(i=0;i<CORESWITCHES;i++)
            {
                String CS = "CORE_SWITCHES-"+Integer.toString(i);
                System.out.print(CS + " " + "\n");
                nodes.add(CS);
            }
            for(i=0;i<NUMBEROFPODS;i++)
            {
                String POD = "POD-"+Integer.toString(i);
                System.out.print(POD + " "+"\n");
                nodes.add(POD);
            }
            for(i=0;i<AGGSWITCHES;i++)
            {
                String AGG = "AGG_SWITCHES-"+Integer.toString(i)+"-"+Integer.toString(i/(K/2));
                System.out.print(AGG + " "+"\n");
                nodes.add(AGG);
            }
            for(i=0;i<EDGESWITCHES;i++)
            {
                String EGG = "EDGE_SWITCHES-"+Integer.toString(i)+"-"+Integer.toString(i/(K/2));
                System.out.print(EGG + " "+"\n");
                nodes.add(EGG);
            }
            for(i=0;i<PMACHINE;i++)
            {
                String PM = "PMACHINE-"+Integer.toString(i)+"-"+Integer.toString(i/CORESWITCHES)+"-"+Integer.toString(i/(K/2));
                System.out.print(PM + " "+"\n");
                nodes.add(PM);
            }

            System.out.println("Please enter two nodes.");
            String first;
            String second;
            while(true)
           {
            
                String[] S = scanner.nextLine().split(" ");
                first = S[0].toUpperCase();
                second = S[1].toUpperCase();                
                
                if(nodes.contains(first) && nodes.contains(second) && !first.equals(second))
                break;
                System.out.println("Please enter correct nodes ");
                
           }
               String[] fs= first.split("-"), ss =second.split("-");
         
               if (fs[0].equals("PMACHINE") && ss[0].equals("PMACHINE")) {
               if (fs[3].equals(ss[3])) {
                  System.out.print("Distance = 2");
               }
               else if (fs[2].equals (ss[2])) {
                  System.out.println("Distance = 4");                  
               }
               else{
                  System.out.println("Distance = 6");
               }
            }
               else if(fs[0].equals("PMACHINE") && ss[0].equals("EDGE_SWITCHES")) 
            {
                if(fs[3].equals(ss[1])) 
                {
                  System.out.println("distance : 1");
                }
                else if(fs[2].equals(ss[2])) 
                {
                  System.out.println("distance : 3");
                }
                else System.out.println("distance : 5");
            }
            else if(fs[0].equals("PMACHINE") && ss[0].equals("AGG_SWITCHES"))
            {
                if(fs[2].equals(ss[2])) System.out.println("distance : 2");
                else System.out.println("distance : 4");
            }
            else if(fs[0].equals("PMACHINE") && ss[0].equals("CORE_SWITCHES"))
            {
                System.out.println("distance : 3");
            }
            else if(fs[0].equals("EDGE_SWITCHES") && ss[0].equals("PMACHINE"))
            {
                if(fs[1].equals(ss[3])) System.out.println("distance : 1");
                else if(fs[2].equals(ss[2])) System.out.println("distance : 3");
                else System.out.println("distance : 5");
            }
            else if(fs[0].equals("EDGE_SWITCHES") && ss[0].equals("EDGE_SWITCHES")) 
            {
                if(fs[2].equals(ss[2])) System.out.println("distance : 2");
                else System.out.println("distance : 4");
            }
            else if(fs[0].equals("EDGE_SWITCHES") && ss[0].equals("AGG_SWITCHES")) 
            {
                if(fs[2].equals(ss[2])) System.out.println("distance : 1");
                else System.out.println("distance : 3");
            }
            else if(fs[0].equals("EDGE_SWITCHES") && ss[0].equals("CORE_SWITCHES"))
            {
                System.out.println("distance : 2");
            }
            else if(fs[0].equals("AGG_SWITCHES") && ss[0].equals("PMACHINE"))
            {
                if(fs[2].equals(ss[2])) System.out.println("distance : 2");
                else System.out.println("distance : 4");
            }
            else if(fs[0].equals("AGG_SWITCHES") && ss[0].equals("EDGE_SWITCHES")) 
            {
                if(fs[2].equals(ss[2])) System.out.println("distance : 1");
                else System.out.println("distance : 3");
            }
            else if(fs[0].equals("AGG_SWITCHES") && ss[0].equals("AGG_SWITCHES")) 
            {
                if((Integer.parseInt(fs[1])-Integer.parseInt(ss[1]))%(K/2)==0) 
                {
                  System.out.println("distance : 2");
                }
                else System.out.println("distance : undefined");
            }
            else if(fs[0].equals("AGG_SWITCHES") && ss[0].equals("CORE_SWITCHES")) 
            {
                System.out.println("distance : 1");
            }
            else if(fs[0].equals("CORE_SWITCHES") && ss[0].equals("PMACHINE"))
            {
                System.out.println("distance : 3");
            }
            else if(fs[0].equals("CORE_SWITCHES") && ss[0].equals("EDGE_SWITCHES"))
            {
                System.out.println("distance : 2");
            }
            else if(fs[0].equals("CORE_SWITCHES") && ss[0].equals("AGG_SWITCHES")) 
            {
                System.out.println("distance : 1");
            }
            else if(fs[0].equals("CORE_SWITCHES") && ss[0].equals("CORE_SWITCHES"))
            {
                System.out.println("distance : 4");
            }
               
            }
   

private static void arrayOfswitch() {
         int CORESWITCHES = (K/2)*2;
         int NUMBEROFPODS = K;
         int AGGSWITCHES = (K*K)/2;
         int EDGESWITCHES =(K*K)/2;
         int PMACHINE = (K*K*K)/4;
         // int AGGSWITCHESPerPod = K/2;
         // int EDGESWITCHESPerPod =K/2;

         System.out.println("Number of Core Switch is "+ CORESWITCHES);
         System.out.println("Number of Pods is "+ NUMBEROFPODS);
         System.out.println("Number of Aggregation Switch is "+ AGGSWITCHES);
         System.out.println("Number of Edge Switch is "+EDGESWITCHES);
         System.out.println("Number of Physical Machine is "+PMACHINE);
         // System.out.println("Number of Aggregation Switch within POD is "+AGGSWITCHESPerPod);
         // System.out.println("Number of Edge Switch within POD is "+EDGESWITCHESPerPod);
}
}
 {
    
}
