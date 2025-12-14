public class People {
    private final int age;
    private final String name;
    private final String lastName;
    private final String city;
    private final String job;
    private static final String GREET = "hello";
    private final String greet = GREET;
​
​
​
    private People(PeopleBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.city = builder.city;
        this.job = builder.job;
    }
    
    public int getAge() {
        return age;
    }
​
    public String getName() {
        return name;
    }
​
    public String getLastName() {
        return lastName;
    }
​
    public String getCity() {
        return city;
    }
​
    public String getJob() {
        return job;
    }
​
    public String getGreet() {
        return greet;
    }
​
    public String greet() {
        return greet + " my name is " + name;
    }
​