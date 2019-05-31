package designpattern.command.command;

import java.awt.*;

public class Drawcanvas extends Canvas implements Drawable {

    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;

    public Drawcanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x- radius, y - radius, radius * 2, radius * 2);
    }

    public void paint() {
        history.execute();
    }
}
