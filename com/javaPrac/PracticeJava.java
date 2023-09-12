package javaPrac;

public class PracticeJava {
    public static void main ( String[] args ) {

    }
    public static void printAgeIfPerson(Object obj){
        if( obj instanceof Person person ){
            System.out.println ( person.getAge() );
        }
    }
}
