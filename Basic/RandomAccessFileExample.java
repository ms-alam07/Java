import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    
    public static void main(String[] args) throws Exception{
        RandomAccessFile rf = new RandomAccessFile("D:/Coll/Data.txt","rw");
        // byte b[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N'};

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());// after printing 'C' pointer moves to position 4
        rf.write('d'); // write 'd' to pointer 4
        System.out.println((char)rf.read()); // pointer at 'E'
        rf.skipBytes(3); // skipping 3 bytes after 'E' (FGH)
        System.out.println((char)rf.read()); // pointer at 'I'
        rf.seek(3); // pointer at 'C'
        System.out.println((char)rf.read()); // 'd will be printed'
        rf.close();
    }
}
