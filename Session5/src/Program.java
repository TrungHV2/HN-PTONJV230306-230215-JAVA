import com.rikkei.academy.model.Employee;
import com.rikkei.academy.model.Person;
import com.rikkei.academy.model.Student;

public class Program {
    public static void main(String[] args) {
        Student st = new Student();
        st.setFullName("Hoàng Văn Trung");
        st.setGender(true);

        Student st1 = new Student("SV01", "Name", true, "HN", "abc@gmail.com", "HN-PTONJV230306");

        st1.output();
        st1.output("TrungHV");
        st1.output(5);
        double result = st1.output(5f);

        Person pst;
        pst = new Student("SV02", "Student is a Person", true, "HN", "abc@gmail.com", "HN-PTONJV230306");
        Person pemp = new Employee();
        System.out.println(pemp instanceof Employee);
        pst.output();

        Student st2 = (Student)new Person();

        System.out.println(st1);
    }
}
