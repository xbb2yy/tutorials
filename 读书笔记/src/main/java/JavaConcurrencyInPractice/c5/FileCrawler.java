package JavaConcurrencyInPractice.c5;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

public class FileCrawler implements Runnable{

    private final BlockingQueue<File> fileBlockingQueue;
    private final FileFilter fileFilter;
    private final File root;

    public FileCrawler(BlockingQueue<File> fileBlockingQueue, FileFilter fileFilter, File root) {
        this.fileBlockingQueue = fileBlockingQueue;
        this.fileFilter = fileFilter;
        this.root = root;
    }

    @Override
    public void run() {

    }


    private void crawl(File root) throws InterruptedException{
        File[] files = root.listFiles(fileFilter);
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    crawl(file);
                } else {
                    fileBlockingQueue.add(file);
                }
            }
        }

    }
}
