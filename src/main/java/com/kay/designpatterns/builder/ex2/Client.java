package com.kay.designpatterns.builder.ex2;

/**
 * @author kay
 * @date 2019/10/13
 */
class Client {

    private AbstractBuilder builder;

    private Client() {
        this.builder = new VacationBuilder();
    }

    public static void main(String[] args) {
        Client client = new Client();

        VacationPlan planA = client.getPlanA();
        System.out.println(planA);

        VacationPlan planB = client.getPlanB();
        System.out.println(planB);
    }

    private VacationPlan getPlanA() {
        return builder.addHotel(new Hotel())
                .addAttractions(new Attractions())
                .buildVacationPlan();
    }

    private VacationPlan getPlanB() {
        return builder.addDining(new Dining())
                .addAttractions(new Attractions())
                .buildVacationPlan();

    }
}
