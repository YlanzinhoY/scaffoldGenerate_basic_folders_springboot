import java.io.IOException;

public class Main {
    public static void main(String[] args) {
         
        try {
            GenerateFolder.Generate("Controller");
            GenerateFolder.Generate("Config");
            GenerateFolder.Generate("Repository");
            GenerateFolder.Generate("Services", "impl");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }    

    }
}