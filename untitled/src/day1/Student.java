package day1;

public class Student {
    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;


    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public int getTotal() {
      return this.kor + this.eng + this.math;
    }

  public int getAverage() {
      return (this.kor + this.eng + this.math) / 3;
    }
  public String info() {
      return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," +
          this.eng + "," + this.math + "," + "," + getTotal() + "," + getAverage();
  }
}
