package com.mycompany.a1.Starter;
import com.codename1.ui.Form;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Label;

/**
 * Created by Varun on 2/16/16.
 */
public class Game extends Form {
    private GameWorld gw;

    public Game() {
        gw = new GameWorld();
        gw.initLayout();
        play();
    }

    private void play()
    {
        //fuck this shitty thing i might have to change it to addComponent
        Label myLabel=new Label("Enter a Command:");
        this.addComponent(myLabel);
        final TextField myTextField=new TextField();
        this.addComponent(myTextField);
        this.show();
        myTextField.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent evt) {

                  String sCommand=myTextField.getText().toString();
                  myTextField.clear();
                  switch (sCommand.charAt(0)) {
                      case 'e':
                          gw.netExpand();
                          break;
                      //add code to handle rest of the commands
                      case 'c':
                          System.out.print("Net has been decreased\n");
                          gw.netDecrease();
                          break;
                      case 's':
                          System.out.print("Animals in net scooped\n");
                          gw.scoop();
                          break;
                      case 'r':
                          System.out.print("Net moved right\n");
                          gw.moveRight();
                          break;
                      case 'l':
                          System.out.print("Net moved left\n");
                          gw.moveLeft();
                          break;
                      case 'u':
                          System.out.print("Net moved up\n");
                          gw.moveUp();
                          break;
                      case 'd':
                          System.out.print("Net moved down\n");
                          gw.moveDown();
                          break;
                      case 'k':
                          System.out.print("Cat added\n");
                          gw.catPopulate();
                          break;
                      case 'f':
                          System.out.print("Fight occurred!\n");
                          gw.fight();
                          break;
                      case 't':
                          System.out.print("Game clock has ticked\n");
                          gw.tick();
                          break;
                      case 'p':
                          System.out.print("Printing Points\n");
                          gw.printPoints();
                          break;
                      case 'm':
                          System.out.print("Printing Map\n");
                          gw.printMap();
                          break;
                      case 'q':
                          gw.quit();
                          break;
                      default:
                          System.out.print("Invalid Command, insert another command!\n");
                  } //switch

              } //actionPerformed
          } //new ActionListener()
        ); //addActionListener
    } //play
}
