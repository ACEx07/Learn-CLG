import java.util.Scanner;


class hello2
{
    public static void main(String[] args){
        String name, dept, college, blood;
        int age;
        char gender;
        float weight;
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name:");
            name = sc.nextLine();
            System.out.println("name:"+ name);

            
            System.out.println("Enter dept:");
            dept = sc.nextLine();
            System.out.println("Dept:"+ dept);
            System.out.println("Age:");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("AGE:"+ age);
    
            
            System.out.println("Gender:");
            gender = sc.nextLine().charAt(0);
            System.out.println("Gender:"+ gender);
    
            
            System.out.println("Blood group:");
            blood = sc.nextLine();
            System.out.println("Blood:"+ blood);
    
            
            System.out.println("CLG:");
            college = sc.nextLine();
            System.out.println("CLG:"+ college);

            
            System.out.println("Weight:");
            weight = sc.nextFloat();
            System.out.println("wt:"+ weight);
    
        }
    }
