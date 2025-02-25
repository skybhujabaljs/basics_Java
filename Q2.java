package basics_Java;

public class Q2 
{
    public static void main(String[] args) {
        String s_name="Akash";
        double s_Weight=60.5;
        double s_Height=150.5;

        double BMI= s_Weight/(s_Height*s_Height);
        System.out.println("The BMI of the student "+s_name+" with weight "+s_Weight+ " and height "+s_Height+" is "+BMI+".");
    }
}
