package workingWithAbstraction.studentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void getTheStudent(String[] args) {
        String name = args[1];

        StringBuilder sb = new StringBuilder();

        if (args[0].equals("Create")) {
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);

            if (!repo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                repo.put(name, student);
            }
        } else if (args[0].equals("Show")) {
            if (repo.containsKey(name)) {
                Student student = repo.get(name);
                sb.append(String.format("%s is %s years old.", student.getName(), student.getAge()));

                if (student.getGrade() >= 5.00) {
                    sb.append(" Excellent student.");
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    sb.append(" Average student.");
                } else {
                    sb.append(" Very nice inheritanceExercise.person.");
                }

                System.out.println(sb);
            }
        }
    }
}
