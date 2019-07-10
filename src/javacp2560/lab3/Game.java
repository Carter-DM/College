package javacp2560.lab3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Game class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Game {
    private List<MatchingButton> buttons;
    private List<ImageIcon> images;
    private List<String> imageDescription;

    public Game(MatchingButton button1, MatchingButton button2, MatchingButton button3, MatchingButton button4) {
        buttons = new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        addImagesToArray();
        updateImages();
    }

    private void addImagesToArray(){
        images = new ArrayList<>();
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo1.png"));
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo1.png"));
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo2.png"));
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo2.png"));
        imageDescription = new ArrayList<>();
        imageDescription.add("java_logo1");
        imageDescription.add("java_logo1");
        imageDescription.add("java_logo2");
        imageDescription.add("java_logo2");
    }

    public void loop(){
        if (twoButtonsSelected()){
            if (imagesAreTheSame()){
                JOptionPane.showMessageDialog(null, "Correct!");
                resetButtons();
                loop();
            }
            else{
                JOptionPane.showMessageDialog(null, "Oops, that was incorrect!");
                resetButtons();
                loop();
            }
        }
    }

    private void resetButtons(){
        for (MatchingButton button: buttons){
            button.setSelected(false);
        }
        addImagesToArray();
        updateImages();
    }

    private boolean twoButtonsSelected(){
        int selected = 0;
        for (MatchingButton button: buttons) {
            if (selected >= 2) {
                return true;
            }
            else if (button.isSelected()) {
                selected++;
            }
        }
        if (selected >= 2) {
            return true;
        }
        return false;
    }

    private boolean imagesAreTheSame(){
        List<String> imageDescriptions = new ArrayList<>();
        for (MatchingButton button: buttons) {
            if (button.isSelected()) {
                imageDescriptions.add(button.getImageDescription());
            }
        }
        if (imageDescriptions.get(0).equals(imageDescriptions.get(1))){

            return true;
        }
        else {
            return false;
        }
    }

    private void updateImages(){
        Random random = new Random();
        int rand;
        for (int i = 3; i >= 0; i--){
            rand = random.nextInt(i + 1);
            buttons.get(i).updateImageIcon(images.get(rand));
            buttons.get(i).setImageDescription(imageDescription.get(rand));
            images.remove(rand);
            imageDescription.remove(rand);
        }
    }
}
