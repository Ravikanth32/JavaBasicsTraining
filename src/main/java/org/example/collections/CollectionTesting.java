package org.example.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionTesting {

    public static void main(String[] args) {
        Student student1= new Student();
        student1.setName("raja");
        student1.setRollNum(1);

        Student student2= new Student();
        student2.setName("ram");
        student2.setRollNum(2);

        Student student3= new Student();
        student3.setName("ravi");
        student3.setRollNum(3);

        // stu stu null
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

//        for (Student student: students) {
//            if(student != null)
//                System.out.println(student.getName());
//        }

        // Collections  //
        // LIST SET MAP
        // Collections  ARRAYS

        /// WRAPPER classes

        double x = 10;

//        Integer integer = 10;
//
//        System.out.println(x);
//        System.out.println(integer);


//        float f = (float) x;
//        long l = 20;
//
//        Long l1 = 20L;
//
//
//        String salary = "20000";
//        try {
//            double v = Double.parseDouble(salary);
//            int newSalary = Integer.parseInt(salary) + 1000;
//            System.out.println(v);
//        }catch (NumberFormatException exception){
//            System.out.println("Invalid number "+ exception.getMessage());
//        }
        // 0   1
        // 34 45
        // 34 55 45
        List<Integer> ages = new ArrayList<>();
        ages.add(34);
        ages.add(45);

        List<Integer> ages1 = new ArrayList<>();
        ages1.add(1);
        ages1.add(2);
//        for (int i = 0; i < ages.size(); i++) {
//            System.out.println(ages.get(i));
//        }
//        ages.remove(0);
//        ages.addAll(ages1);
//        System.out.println(ages);
        ages.add(1,55);
        ages.set(0,100);
        ages.clear();
        for(Integer age: ages){
            System.out.print(age +" ");
        }

        Set<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(30);
//        System.out.println(integers);

        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("zer");
        names.add("ravi");
        names.add("ram");
        names.add("raja");
        names.add("ravi");
        names.add("venkat");

        StringBuffer buffer = new StringBuffer();
//        for (String name: names){
//            buffer.append(name +", ");
//        }

        // 5 --> 0 1 234
//        int size = names.size();
//        for (int i = 0; i < names.size(); i++) {
//            if(size-1 == i){
//                buffer.append(names.get(i));
//            }else {
//                buffer.append(names.get(i) + ", ");
//            }
//        }
//
//        System.out.println(buffer.toString());

//        String collect = names.stream().collect(Collectors.joining(","));
//        System.out.println(collect);


//        int leftLimit = 48; // numeral '0'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;

//        for (int i = 0; i < 100; i++) {
//            Random random = new Random();
//            String generatedString = random.ints(leftLimit, rightLimit + 1)
//                    .filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
//                    .limit(targetStringLength)
//                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                    .toString();
//            names.add(generatedString);
//        }

//        System.out.println(names.size());
//
//        boolean isStringContains = names.contains("ZQpRIdQ5cY");
//        System.out.println(isStringContains);


//        Map<Boolean, Set<String>> z = names.stream()
//                .collect(Collectors.groupingBy(name -> name.startsWith("z"), Collectors.toSet()));
//        System.out.println(z);

//        List<String> startsWithZList = names.stream()
//                .map(name -> name.toLowerCase())
//                .filter(name -> name.startsWith("z"))
//                .collect(Collectors.toList());
//
//        startsWithZList.forEach(System.out::println);
//
//        System.out.println(startsWithZList.size());


//        ArrayList<Student> studentsList = new ArrayList<>();
//        studentsList.add(student1);
//        studentsList.add(student2);
//        studentsList.add(student3);

//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("ravi",30,"Lead Developer"));
//        employees.add(new Employee("ram",35,"Manager"));
//        employees.add(new Employee("abc",32,"Manager"));
//        employees.add(new Employee("raja",30,"Scrum Master"));
//        employees.add(new Employee("Sowmya",30,"Java Developer"));
//        employees.add(new Employee("xyz",30,"Lead Developer"));
//
////        Map<String, Set<Employee>> collect = employees.stream()
////                .collect(Collectors.groupingBy(employee -> employee.getRole(), Collectors.toSet()));
////        System.out.println(collect);
//
//        OptionalInt max = employees.stream()
//                .mapToInt(Employee::getAge).min();
////        Integer sumOfAges = (Integer) max;
//        System.out.println(max.getAsInt());



//        for (Student student : studentsList) {
//            if(student != null){
//                if(student.getRollNum() > 2){
//                    System.out.println(student.getName());
//                }
//            }
//        }

//        studentsList.stream()
//                .filter(student -> student.getRollNum()>= 2)
//                .forEach(student -> System.out.println(student.getName()));

//        ArrayList<String> withOutDuplicates = new ArrayList<>();
//
//        for (String name : names) {
//            if(!withOutDuplicates.contains(name)){
//                withOutDuplicates.add(name);
//            }
//        }
//
//        System.out.println(withOutDuplicates);

//        HashSet<String> noDupes = new HashSet<>();
//        noDupes.addAll(names);
//        System.out.println(noDupes);



//        ArrayList friendsList = new ArrayList<>();
//
//        friendsList.add("ravi");
//        friendsList.add("ram");
//        friendsList.add("raja");
//        friendsList.add("sowmya");
//        friendsList.add("venkat");
//        friendsList.add(23);
//
//        System.out.println(friendsList);
//        for (Object friendName: friendsList) {
//            if (friendName.toString().startsWith("r")){
//                System.out.println(friendName.toString());
//            }
//
//        }






//        String name = "ravi,ram,raja";
//
//        String[] names = name.split(",");
//
//        for (String n: names) {
//            if (n.equals("ram")) System.out.println("I am RAM");
//            System.out.println(n);
//        }



//        Map<String, List<Employee>> map = new HashMap<>();
//        map.put("one",1);
//        map.put("two",2);
//        map.put("three",3);
//
//        System.out.println(map);


        List<Employee> highPayEmployees = new ArrayList<>();
        highPayEmployees.add(new Employee("ravi",30,"Lead Developer"));
        highPayEmployees.add(new Employee("ram",35,"Manager"));
        List<Employee> mediumPayEmployees = new ArrayList<>();
        mediumPayEmployees.add(new Employee("abc",32,"Manager"));
        mediumPayEmployees.add(new Employee("raja",30,"Scrum Master"));
        List<Employee> lowPayEmployees = new ArrayList<>();
        lowPayEmployees.add(new Employee("Sowmya",30,"Java Developer"));
        lowPayEmployees.add(new Employee("xyz",30,"Lead Developer"));


        Map<String,List<Employee>> mapOfEmps = new HashMap<>();
        mapOfEmps.put("greaterThan100KSal",highPayEmployees);
        mapOfEmps.put("mediumPayEmployees",mediumPayEmployees);
        mapOfEmps.put("lowPayEmployees",lowPayEmployees);
        mapOfEmps.put("lowPayEmployees",new ArrayList<>());

        List<Employee> employees = mapOfEmps.get("lowPayEmployees");
        System.out.println(employees);
//        mapOfEmps.entrySet().stream().


//        System.out.println(mapOfEmps);



    }
}
