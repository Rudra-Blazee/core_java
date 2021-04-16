package Strings;

public class ArrayFunctions {
    public static void main(String[] args) {
         String name = "Sumit Anand";
         String name1 = new String("Sumit Anand");
         String name2 = "";
         System.out.println(name.charAt(0));
         System.out.println(name.length());
         System.out.println(name.substring(4));
         System.out.println(name.substring(4, 8));
         System.out.println(name.contains("Sumit"));
         System.out.println(name.equals(name1));
         System.out.println(name2.isEmpty());
         System.out.println(name.concat(" kumar"));
         System.out.println(name.replace('A', 'C'));
        String cars = "Hundai,Maruti,Swift,Wagonr";
        String allcars[] = cars.split(",");
        for (String e : allcars) {
            System.out.print(e);
        }
    }
}
