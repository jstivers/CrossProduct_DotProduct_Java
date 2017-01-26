import java.util.Scanner;

public class CrossProduct_DotProduct{

    public static void main(String[] args) {
        DecisionFunction();
    }
    public  static void DecisionFunction(){
        System.out.println("Welcome to the Cross Product and Dot Product Calculator!");
        System.out.println("If you would like to calculate a cross product, enter /'Cross Product/', if you would like " +
                "to enter a dot product enter /'Dot Product/' or /'Exit/' to end the program.");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        Double[] VectorOne;
        Double[] VectorTwo;
        if (choice == "Quit") {
            System.exit(0);
        }
        else if (choice=="Cross Product"){
            System.out.println("Please enter the values of Vector one, separated by commas");
            String container1 = keyboard.nextLine();
            System.out.println("Please enter the values of Vector two, separated by commas");
            String container2 = keyboard.nextLine();
            CrossProduct(container1,container2);
            System.out.println(CrossProductResult);
        }
        else if (choice == "Dot Product"){
            System.exit(0);
        }
    }
    public static void CrossProduct(String container1 ,String container2){
        Double[] CrossProductResult = {0.0,0.0,0.0};
        String[] SplitStringOne = container1.split(",");
        Double[] VectorArrayDoubleOne = new Double[10];
        for(int i = 0; i < SplitStringOne.length; i++) {
            VectorArrayDoubleOne[i] = Double.parseDouble(SplitStringOne[i]);
        }
        String[] SplitStringTwo = container2.split(",");
        Double[] VectorArrayDoubleTwo = new Double[10];
        for(int i = 0; i < SplitStringTwo.length; i++) {
            VectorArrayDoubleTwo[i] = Double.parseDouble(SplitStringTwo[i]);
        }
        CrossProductResult[0] = (VectorArrayDoubleOne[1]*VectorArrayDoubleTwo[2]-VectorArrayDoubleOne[2]*VectorArrayDoubleTwo[1]);
        CrossProductResult[1] = (VectorArrayDoubleOne[0]*VectorArrayDoubleTwo[2]-VectorArrayDoubleOne[2]*VectorArrayDoubleTwo[0]);
        CrossProductResult[2] = (VectorArrayDoubleOne[0]*VectorArrayDoubleTwo[1]-VectorArrayDoubleOne[0]*VectorArrayDoubleTwo[1]);






    }

}

