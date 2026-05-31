package oops;

public class student {
    String name;
    int rollno;
    double percent;

    // public student(String name, int rollno, double percent) {
    //     this.name = name;
    //     this.rollno = rollno;
    //     this.percent = percent;
    // }
    public student(String name,int rollno,double percent) {
        this.name = name;
        this.rollno = rollno;
        this.percent = percent;
    }

    public int getrollno(){ //geter
        return rollno;
    }
    public void setrollno(int rollno){ //seter
        this.rollno = rollno;
    }

}
