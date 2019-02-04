public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0]=new Person("Samis","Larry",21,200);
        people[1]=new Person("Polics","Irene",1,9);
        people[2]=new Person("Wiley","Noah",19,150);
        System.out.println("Last Name, First Name: Age, Weight");
        for(int i=0;i<people.length;i++)
        {
            System.out.printf("%s, %s: %d, %.2flb\n",people[i].getLastName(),people[i].getFirstName(),people[i].getAge(),displayWeight(people[i]));
        }

        System.out.printf("Population: %d\n",Person.getPopulation());
        System.out.printf("Species: %s\n",Person.getSpecies());
    }
    private static double displayWeight(Weighable w)
    {
        return w.getWeight();
    }
}

