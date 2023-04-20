public class exercise {
    
    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;

    public static void main(String[] args) throws Exception {
        
         assert iWillBehave == true: "Makulit";

         College();

         assert iWillGraduate == true: "Naging janitor sa SM";

    }

    static void College() {
        
        iWillGraduate = false;
        System.out.println("Welcome to SM!");
    }
}

