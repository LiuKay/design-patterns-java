
 >Decorator Pattern: attaches additional responsibilities to an object dynamically.
 Decorators provide a flexible alternative to subclassing for extending functionality.
 
 装饰器模式: 动态地给对象添加额外的职责，提供一种优于继承的可灵活扩展的方式。
 
 组合优于继承，通过组合的方式扩展原有接口的功能。
 
 
Q: Wouldn’t it be easy for some client of a beverage to end up with a decorator 
that isn’t the outermost decorator? Like if I had a DarkRoast with Mocha, Soy, and Whip, 
it would be easy to write code that somehow ended up with a reference to Soy instead of Whip,
which means it would not include Whip in the order.
  
A: You could certainly argue that you have to manage more objects with the Decorator Pattern
and so there is an increased chance that coding errors will introduce the kinds of problems you suggest.
However, decorators are typically created by using other patterns like Factory and Builder.
Once we’ve covered these patterns, you’ll see that the creation of the concrete component with
its decorator is “well encapsulated” and doesn’t lead to these kinds of problems.