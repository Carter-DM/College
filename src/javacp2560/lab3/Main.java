package javacp2560.lab3;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();

        MatchingButton button1 = new MatchingButton();
        frame.add(button1);
        MatchingButton button2 = new MatchingButton();
        frame.add(button2);
        MatchingButton button3 = new MatchingButton();
        frame.add(button3);
        MatchingButton button4 = new MatchingButton();
        frame.add(button4);

        Game game = new Game(button1, button2, button3, button4);
        button1.addActionListener(e -> game.loop());
        button2.addActionListener(e -> game.loop());
        button3.addActionListener(e -> game.loop());
        button4.addActionListener(e -> game.loop());

        frame.setVisible(true);
    }
}
