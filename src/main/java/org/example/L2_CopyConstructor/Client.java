package org.example.L2_CopyConstructor;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("Vishwa", 24);
        st.showDetails();

        // What does this do?
        // reference of st is copied to st1
        // Both refers same variable, changes in both affect data at both st and st1
        Student st1 = st;
        st1.setAge(30);

        st1.showDetails();
        st.showDetails();

        // To copy the details to a new object, use following
        Student st2 = new Student();
        st2.setName(st1.getName());
        st2.setAge(st1.getAge());
        st2.setAge(40);

        st1.showDetails();
        st2.showDetails();

        // If I have to copy to 100 objects will the above won't create code duplication
        // Solution: Copy Constructor
        Student st3 = new Student(st1);
        st3.showDetails();

        // Lets add a Exam object to Student Class

        // Now if you stop the code at debug point and check:
        // enrollment exam object at st1 and st3 will be same which is inconsistent right?
        // because copy constructor v0, the reference of exam is copied not new object is created

        // in copy constructor v1/v2 this issue will not happen


        // next
        // add re-exam object to exam and follow thr above
        // as per current constructor of re-exam. it again shallows copies

        // To make this work correctly, modify the copy constructor of EXAM class

        //Conclusion
        // Shallow copy : Whenever you want shallow copy at a particular level, you
        // just need to copy the references at that level

        // Deep copy : In deep copy you need to create new objects at every level
        // and copy the details instead of references


    }

}
