### Factory Patterns


#### 简单工厂模式

![](https://gitee.com/kaybee/markdown_pics/raw/master/img/simple-factory-ex.png)

如上所示，SimplePizzaFactory 作为一个简单的对象工厂，将所有的产品(Pizza)的生产封装在内部，提供给外部调用。

严格来说，简单工厂模式并不是一种设计模式，而是一种编程习惯。
它将对象的创建过程封装了起来，不必显示地在使用对象时直接`new`出对象，这样做一是可以重用对象，不需要每次都创建新的对象(比如单例模式)，另外可以动态地改变所使用的对象而不修改调用代码。




#### 工厂方法模式 Factory Method Pattern
工厂方法模式建立了一种生产对象的模板，将简单工厂中由一个对象负责所有具体类实例化的任务，分给了不同的子类来实现。
工厂方法将实际创建对象的代码与客户使用的代码解耦出来。

![](https://gitee.com/kaybee/markdown_pics/raw/master/img/factory-method-ex.png)
如上图所示为对应代码中工厂方法，PizzaStore 作为一个抽象创建者定义了一个抽象方法，让子类实现类生产具体的对象实例。






#### 抽象工厂模式 Abstract Factory Pattern
提供一个接口，用于创建相关或依赖的家族，而不需要明确指定具体类。如下为抽象工厂的UML示意图。

![抽象工厂UML-维基百科](https://gitee.com/kaybee/markdown_pics/raw/master/img/Abstract_factory_UML.svg)



对应示例代码中的类图如下：
![对应代码中的结构](https://gitee.com/kaybee/markdown_pics/raw/master/img/absract-factory-ex.png)



*（以上，详见示例代码）*