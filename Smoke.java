import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Smoke 
{
   private JFrame frame, mainFrame, searchFrame, addFrame, deleteFrame;
      
   private Smoke create() 
   {
      frame = createFrame();
      frame.getContentPane().add(createContent());
      return this;
   }

   private JFrame createFrame() 
   {
      JFrame frame = new JFrame("Smoke");
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      return frame;
   }
    
   private JFrame createFrame2() 
   {
      JFrame mainFrame = new JFrame(getClass().getName());
      mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      return mainFrame;
   }
   
   private JFrame createFrame3() 
   {
      JFrame searchFrame = new JFrame(getClass().getName());
      searchFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      return searchFrame;
   }
    
    private JFrame createFrame4() 
   {
      JFrame addFrame = new JFrame(getClass().getName());
      addFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      return addFrame;
   }
    
   private JFrame createFrame5() 
   {
      JFrame deleteFrame = new JFrame(getClass().getName());
      deleteFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      return deleteFrame;
   } 
   
   private void show()
   {
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.setVisible(true);
   }

  
   public void mainFrame(String access)
   {
      mainFrame = createFrame2();
      mainFrame.getContentPane().add(createContent2(access));
      mainFrame.pack();
      mainFrame.setLocationRelativeTo(null); 
      mainFrame.setResizable(false);
      try
      {
         Thread.sleep(500); 
      }catch (Exception e)
      {}     
      mainFrame.setVisible(true);
   }

   
   public void searchFrame(String access)
   {
      searchFrame = createFrame3();
      searchFrame.getContentPane().add(createContent3(access));
      searchFrame.pack();
      searchFrame.setLocationRelativeTo(null); 
      searchFrame.setResizable(false);
      searchFrame.setVisible(true);
      
   }
   
   public void addFrame(String access)
   {
      addFrame = createFrame4();
      addFrame.getContentPane().add(createContent4(access));
      addFrame.pack();
      addFrame.setLocationRelativeTo(null); 
      addFrame.setResizable(false);
      addFrame.setVisible(true);
      
   }
   
   public void deleteFrame(String access)
   {
      deleteFrame = createFrame5();
      deleteFrame.getContentPane().add(createContent5(access));
      deleteFrame.pack();
      deleteFrame.setLocationRelativeTo(null); 
      deleteFrame.setResizable(false);
      deleteFrame.setVisible(true);

   }

   private JPanel createContent() 
   {
      LoginPanel login = new LoginPanel(frame);
      return login ;
   }// end create component

   private Component createContent2(String Access) 
   {
      MainPanel main = new MainPanel(mainFrame,Access);
      return main;  
   }// end create component2
 
   private Component createContent3(String Access) 
   {
      SearchPanel search = new SearchPanel(searchFrame, Access);
      return search;
   }
         
   private Component createContent4(String Access) 
   {
      AddPanel add = new AddPanel(addFrame, Access) ;
      return add;
   }
   
    private Component createContent5(String Access) 
   {
      DeletePanel delete = new DeletePanel(deleteFrame, Access) ;
      return delete;
   }
 
   public static void main(String[] args) throws Exception 
   {
      java.awt.EventQueue.invokeLater(new Runnable() 
      {
         @Override
         public void run() 
         {
            new Smoke().create().show();
         }
      });
   }
}