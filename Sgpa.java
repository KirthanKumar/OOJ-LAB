import java.util.Scanner;
class Student{
    String name;
    String usn;
    int marks[]=new int[3];
    int credit[]=new int[3];
    int tcredits()
    {
        int t=0,i;
        for(i=0;i<3;i++)
        {
            t=t+credit[i];
        }
        return t;
    }
}
 class Sgpa{
    public static void main(String args[])
    {
        System.out.println("enter the student name, usn\n");
        int i;float sgpa=0,t;
        Scanner sc=new Scanner (System.in);
        Student s1=new Student();
        s1.name=sc.nextLine();
        s1.usn=sc.nextLine();
        System.out.println("marks and credit of each subjects are\n");
        for(i=0;i<3;i++)
        {
            s1.marks[i]=sc.nextInt();
            if(s1.marks[i]==100)
                s1.marks[i]=(s1.marks[i]/10) ;
            else
            s1.marks[i]=(s1.marks[i]/10)+1;
            s1.credit[i]=sc.nextInt();
            sgpa=sgpa+s1.marks[i]*s1.credit[i];
        }
        t=s1.tcredits();
        sgpa=sgpa/(t);
        System.out.println("sgpa of "+s1.name+" is\n "+sgpa);
    }
}