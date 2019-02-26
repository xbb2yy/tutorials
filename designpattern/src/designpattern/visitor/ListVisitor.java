package designpattern.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentDir = "";
    @Override
    public void visit(File f) {
        System.out.println(currentDir + "/" + f);
    }

    @Override
    public void visit(Directory d) {
        System.out.println(currentDir + "/" + d);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + d.getName();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
