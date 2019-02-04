public class Person implements Weighable{
    final static String species = "Homo Sapien";
    static int population = 0;


    private String firstName;
    private String lastName;
    private int age;
    private double weight;

    public Person(String lName,String fName, int newAge, double userWeight)
    {
        firstName = fName;
        lastName = lName;
        age = newAge;
        weight=userWeight;
        increasePopulation();
    }

    public Person(String lName,String fName, String newAge, String strWeight)
    {
        firstName = fName;
        lastName = lName;
        try
        {
            age = Integer.parseInt(newAge);
        }
        catch (Exception e)
        {
            age=-1;
        }
        try
        {
            weight = Double.parseDouble(strWeight);
        }
        catch (Exception e)
        {
            weight=-1;
        }
        increasePopulation();
    }

    public Person(String lName)
    {
        firstName = "";
        lastName = lName;
        age = -1;
        increasePopulation();
    }

    public Person(String lName,String fName)
    {
        firstName = fName;
        lastName = lName;
        age = -1;
        increasePopulation();
    }
    public Person(String lName,int newAge)
    {
        firstName = "";
        lastName = lName;
        age = newAge;
        increasePopulation();
    }

    public double getWeight()
    {
        return weight;
    }

    @Override
    public void addWeight(double pounds) {
        weight+=pounds;
    }

    @Override
    public void loseWeight(double pounds) {
        weight-=pounds;
    }

    private static void increasePopulation()
    {
        population++;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static String getSpecies() {
        return species;
    }

    public static int getPopulation() {
        return population;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
