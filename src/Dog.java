class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Simba", "Baladi");
        Dog dog2 = new Dog("Max", "German Shepherd");
        dog1.setName("Zizo");
        dog1.setBreed("Husky");

        System.out.println("Dog 1: Name - " + dog1.getName() + ", Breed - " + dog1.getBreed());
        System.out.println("Dog 2: Name - " + dog2.getName() + ", Breed - " + dog2.getBreed());
    }
}
