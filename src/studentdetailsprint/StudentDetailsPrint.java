package studentdetailsprint;

/**
 * @author Manvir Sohi
 */

public class StudentDetailsPrint {

    public static void main(String[] args) {
        Student[] list = new Student[3];
        Student s1 = new Student();
        s1.setName("Manvir");
        s1.setSid(991576065);
        Student s2 = new Student();
        s2.setName("Bob");
        s2.setSid(653875345);
        Student s3 = new Student();
        s3.setName("Enzo");
        s3.setSid(985452876);
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for (int i=0; i<list.length; i++) {
            System.out.println(list[i].getName() + " " + list[i].getSid());
        }
    }
    
}
