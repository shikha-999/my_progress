// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //create database - based on type(file, mysql)
//        Database fileDatabase = new FileDatabase();
//        fileDatabase.write("Fresh Data");
//        String result = fileDatabase.read();
//        System.out.println("Returned: " + result);

//        Database fileDatabase = new FileDatabase();
//        Database encryptedDatabase = new EncryptionDecorator(fileDatabase);
//        encryptedDatabase.write("Fresh Data");
//        System.out.println(encryptedDatabase.read());

//        Database fileDatabase = new FileDatabase();
//        Database compressedDatabase = new CompressionDecorator(fileDatabase);
//        compressedDatabase.write("Fresh Data");
//        System.out.println(compressedDatabase.read());
//---------------------------------------------------------------------------------------------------------
        Database fileDatabase = new FileDatabase(); //inner - main database

        //CompressionDecorator just outside main decorator, so it will have reference to FileDatabase
        Database compressedDatabase = new CompressionDecorator(fileDatabase);

        //EncryptionDecorator will have reference to CompressionDecorator
        Database encryptedDatabase = new EncryptionDecorator(compressedDatabase);


        encryptedDatabase.write("Fresh Data");
        System.out.println(encryptedDatabase.read());
    }
//        FileDatabase <innermost layer>
//        compressedDatabase(FileDatabase) <secondlast inner layer>
//        encryptedDatabase(compressedDatabase) <outermost layer>

}