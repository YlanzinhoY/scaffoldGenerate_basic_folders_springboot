import java.io.File;
import java.io.IOException;
public class GenerateFolder {
    
    public static void Generate(String name) throws IOException {
         File mkdir = new File("./", name);
            
            if (!mkdir.mkdir()) {
                System.out.println("wrong with create dir");
            } 
            System.out.printf("Create %s with successfully\n", name);
        }

        public static void Generate(String name, String childName) throws IOException {
            var pathParent = String.format("./%s", name);
            File mkdir = new File("./", name);
            File child = new File(pathParent, childName);

            if (!mkdir.mkdir()) {
                System.out.println("wrong with create dir");
            }
            if (!child.mkdir()) {
                System.out.println("wrong with create child dir");
            }

            System.out.printf("Create %s with successfully ", name);
            System.out.printf("%s create with successfully inside the %s%n", childName, name);
            
        
        }
    }
