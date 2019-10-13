package com.kay.designpatterns.builder.ex2;

/**
 * @author kay
 * @date 2019/10/13
 */
class VacationBuilder extends AbstractBuilder {

    private VacationPlan plan;

    VacationBuilder() {
        this.plan = new VacationPlan();
    }

    @Override
    public AbstractBuilder addHotel(Hotel hotel) {
        this.plan.addItem(hotel);
        return this;
    }

    @Override
    public AbstractBuilder addDining(Dining dining) {
        this.plan.addItem(dining);
        return this;
    }

    @Override
    public AbstractBuilder addAttractions(Attractions attractions) {
        this.plan.addItem(attractions);
        return this;
    }

    @Override
    public VacationPlan buildVacationPlan() {
        return this.plan;
    }
}
