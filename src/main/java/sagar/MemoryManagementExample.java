package sagar;


public class MemoryManagementExample {

    public static void main(String[] args) {

        int primitiveVariable=10;
        Person personObj=new Person();
        String stringLiteral="24";
        MemoryManagementExample memoryManagementExample=new MemoryManagementExample();
        memoryManagementExample.memoryManagementTest(personObj);

    }

    private void memoryManagementTest(Person personObj) {

        Person personObj2=personObj;
        String stringLiteral2="24";
        String stringLiteral3=new String("24");

    }
}
