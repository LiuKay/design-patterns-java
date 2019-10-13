package com.kay.designpatterns.builder.ex2;

/**
 * @author kay
 * @date 2019/10/13
 */
abstract class AbstractBuilder {

    public abstract AbstractBuilder addHotel(Hotel hotel);

    public abstract AbstractBuilder addDining(Dining dining);

    public abstract AbstractBuilder addAttractions(Attractions attractions);

    public abstract VacationPlan buildVacationPlan();

}
