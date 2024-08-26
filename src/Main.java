import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("-------------------------");
            System.out.println("Prekiu krepselis");
            System.out.println("1. Ivesti prekes");
            System.out.println("2. Rodyti prekes");
            System.out.println("3. Redaguoti prekes");
            System.out.println("4. Istrinti prekes");
            System.out.println("5. Iseiti is programos");
            System.out.println("-------------------------");
            int item = sc.nextInt();
            sc.nextLine();
            switch (item){
                case 1:
                    //padaroma galimybė įvesti skaičių
                    System.out.println("Ivesti preke: ");
                    String input = sc.nextLine();
                    shoppingList.add(input);
                    break;
                case 2:
                    //padaroma galimybė rodyti visas prekes
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(shoppingList.get(i));
                    }
                    break;
                case 3:
                    //padaroma galimybė redaguoti prekes
                    System.out.println("iveskite preke kuria norite redaguoti:");
                     input = sc.nextLine();
                    for (int i = 0; i < shoppingList.size(); i++) {
                        if(shoppingList.get(i).equals(input)){
                            System.out.println("iveskite nauja pavadinima:");
                            shoppingList.set(i, sc.nextLine());
                        }
                    }
                case 4:
                    //padaroma galimybė ištrinti prekes
                    System.out.println("Iveskite preke kuria norite istrinti");
                    input = sc.nextLine();
                    for (int i = 0; i < shoppingList.size(); i++) {
                        if (shoppingList.get(i).equals(input)){
                            System.out.println("istrinama");
                            shoppingList.clear();
                        }
                    }
                case 5:
                    //išėjimas iš programos
                    System.exit(1);
            }

        }
    }
}
















//        System.out.println("Pasirinkite kelione ");
//        System.out.println("Pasirinkite kelione ");
//        System.out.println("Pasirinkite kelione ");
//        System.out.println("Pasirinkite kelione ");
//
//
//
//
//        System.out.println("1. Norvegija");
//        System.out.println("2. UK");
//        System.out.println("3. JAV");
//        System.out.println("4. Turkija");
//        System.out.println("5. Tailandas");
//        System.out.println("6. Maldyvai");

//        while (true){
//            int item = sc.nextInt();
//            sc.nextLine();
//            switch (item) {
//                case 1:
//                    System.out.println("Norvegijos kaina 500eu");
//                    break;
//                case 2:
//                    System.out.println("UK kaina 300eu");
//                    break;
//                case 3:
//                    System.out.println("JAV kaina 2000eu");
//                    break;
//                case 4:
//                    System.out.println("Turkijos kaina 700eu");
//                    break;
//                case 5:
//                    System.out.println("Tailando kaina 1500eu");
//                    break;
//                case 6:
//                    System.out.println("Maldyvu kaina 2000eu");
//                    break;
//            }

//        System.out.println("Hello world!");
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> shoppingList = new ArrayList();
//        System.out.println();
//        shoppingList.add("kirvis")
//        while(true){
//            System.out.println("ivesk preke");
//            String input = sc.nextLine();
//            shoppingList.add(input);
//            System.out.println();
//            for (int i = 0; i < shoppingList.size(); i++) {
//                System.out.println(shoppingList.get(i));
//            }
//        }