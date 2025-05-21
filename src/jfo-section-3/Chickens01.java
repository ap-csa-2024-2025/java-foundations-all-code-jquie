public class Chickens01 {
    public static void main(String[] args) {
        int totalEggs = 0;
        int chickenCount = 3;
        int eggsPerChicken = 5;

        //Monday
        totalEggs += chickenCount * eggsPerChicken;
        
        //Tuesday
        totalEggs += ++chickenCount * eggsPerChicken;

        //Wednesday
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;

        System.out.println(totalEggs);
    }   
}
