import java.nio.charset.CoderResult;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Neşe Hoca", "FZK","0505...");
        Teacher t2 = new Teacher("Oğuz Hoca","TRH","0505..");
        Teacher t3 = new Teacher("Ela Hoca","BIO","0505.");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t2);
        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t1);
        Course bio = new Course("Biyoloji","103","BIO");
        bio.addTeacher(t3);




        Student s1 = new Student("Deniz","123","1",fizik,tarih,bio);
        s1.addBulkExamNote(55,29,62);
        s1.isPass();
        Student s2 = new Student("Ceren","321","1",fizik,tarih,bio);
        s2.addBulkExamNote(100,95,78);
        s2.isPass();
    }



}