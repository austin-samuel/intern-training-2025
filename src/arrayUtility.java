
import java.util.Scanner;
    //it is a template class that contains all the repeated code like array input a declaration
    public class arrayUtility {
        protected static Object inputArray() {
            Scanner sc = new Scanner(System.in);
            System.out.println("please select the type of array to input: ");
            System.out.println("1. Integer Array");
            System.out.println("2. Double Array");
            System.out.println("3. Float Array ");
            System.out.println("4. string or character");


            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(" Selected Integer Array.");
                    System.out.println("-------------------------------------------------------------");
                    return inputIntArr(sc);
                case 2:
                    System.out.println("Selected Double Array.");
                    System.out.println("-------------------------------------------------------------");
                    return inputDoubleArr(sc);
                case 3:
                    System.out.println("Selected Float Array.");
                    System.out.println("-------------------------------------------------------------");
                    return inputFloatArr(sc);
                case 4:
                    System.out.println("character string not supported or not a valid array");

                default:
                    System.out.println("Invalid choice. Exiting...");
                    return null;
            }
        }

        public static int[] inputIntArr(Scanner sc) {
            System.out.println("enter the number of elements:");
            int n = sc.nextInt();
            int[] numb = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i=0;i<n;i++) {
                numb[i] = sc.nextInt();
            }
            return numb;
        }

        public static double[] inputDoubleArr(Scanner sc) {
            System.out.println("enter the number of elements:");
            int n = sc.nextInt();
            double[] numb = new double[n];
            System.out.println("Enter the elements of the array:");
            for (int i=0;i<n;i++) {
                numb[i] = sc.nextDouble();
            }
            return numb;
        }
        public static float[] inputFloatArr(Scanner sc) {
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();
            float[] numb = new float[n];
            System.out.println("Enter the elements of the array:");
            for (int i=0;i<n;i++) {
                numb[i]=sc.nextFloat();
            }
            return numb;
        }


    }

