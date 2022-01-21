 class Person{
    String name;
    int grade;
    double meetingsAverage;

    Person(String name, int grade, double meetingsAverage) {
        this.name = name;
        this.grade = grade;
        this.meetingsAverage = meetingsAverage;
    }

    boolean likelyToAttend(){
        if (this.grade < 9 || this.grade > 12){
            return false;
        }
        if (this.meetingsAverage < 1){
            return false; 
        }
        return true; 
    }

public static void main(String[] args){
    Person ben = new Person("Ben", 11, 1);
    Person martin = new Person("Martin", 11, 0);
    Person marc = new Person("Marc", 11, 1);
    Person ian = new Person("Ian", 11, 1);
    Person daniel = new Person("Daniel", 9, 0);

    System.out.println(ben.likelyToAttend());
    System.out.println(martin.likelyToAttend());
    System.out.println(marc.likelyToAttend());
    System.out.println(ian.likelyToAttend());
    System.out.println(daniel.likelyToAttend());  
}
}