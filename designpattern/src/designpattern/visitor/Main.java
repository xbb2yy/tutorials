package designpattern.visitor;

public class Main {
    public static void main(String[] args) {
              System.out.println("making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(usrDir);
        rootDir.add(tmpDir);

        binDir.add(new File("vi", 100));
        binDir.add(new File("latex", 200));

        rootDir.accept(new ListVisitor());
    }
}
