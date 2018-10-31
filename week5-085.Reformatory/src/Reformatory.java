public class Reformatory {

    private int total;

    public int weight(Person person) {
        // return the weight of the person
        total++;
        return person.getWeight();
    }

    public void feed (Person person) {
        int i = person.getWeight() + 1;
        person.setWeight(i);

    }


    public  int totalWeightsMeasured() {
        return total;
    }

}
