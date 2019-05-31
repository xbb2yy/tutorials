package designpattern.command.command;

import java.awt.*;

public class DrawCommand implements Command {

    protected Drawable drawable;
    protected Point point;

    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = drawable;
        this.point = point;
    }

    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}
