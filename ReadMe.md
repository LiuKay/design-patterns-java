

## Design Patterns Practice

> [ https://github.com/LiuKay/design-patterns]( https://github.com/LiuKay/design-patterns )

#### 问题：为什么要学习和使用设计模式？

就我个人而言，设计模式相当于一种软件开发设计的“套路”，是现成的一套由前人总结而成的“轮子”，大多数的时候使用它们可以写出容易重用和可维护得高质量代码，这对于我们这些写代码的来说，提供了一种便利，当然你可以理解为“偷懒”。另外一个方面是，大多数优秀的框架或多或少地都使用了这些原则来进行编码( 比如 Spring )，熟悉这些“套路”，你可以知道为什么他们要这么设计和编码，好处是什么。知道 Why 才能从更高的视角去理解 Code。




#### 问题：如何正确地使用设计模式？ - 知乎
https://www.zhihu.com/question/23757906


设计模式是为了封装变化，让各个模块可以独立变化。精准地使用设计模式的前提是你能够精准的预测需求变更的走向。我们都知道大部分人是做不到的，所以大部分人就算精通设计模式也多少会做错点什么东西。所以这其实不怪设计模式<del>，怪产品狗</del>。所以说如何避免过度设计，这就要求你深入的理解你的程序所在的领域的知识，了解用户使用你的软件是为了解决什么问题，这样你预测用户的需求才会比以前更加准确，从而避免了你使用设计模式来封装一些根本不会发生的变化，也避免了你忽视了未来会发生的变化从而发现你使用的模式根本不能适应需求的新走向。所以，在你满足了【知道所有设计模式为什么要被发明出来】的前提之后，剩下的其实都跟编程没关系，而跟你的领域知识和领域经验有关系

作者：vczh
链接：https://www.zhihu.com/question/23757906/answer/25566837
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

-----

![编写高质量的代码](https://gitee.com/kaybee/markdown_pics/raw/master/img/High%20quality%20code.png)

-----

### [1 设计模式之美笔记](https://github.com/LiuKay/design-patterns-java/blob/master/doc/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E4%B9%8B%E7%BE%8E%E7%AC%94%E8%AE%B0.md)

### 2 设计模式总结
#### 创建型模式：关于如何创建实例

- [工厂方法模式-Factory Method pattern](./doc/Factory.md)
- [抽象工厂-Abstract Factory](./doc/Factory.md)
- [建造者模式-Builder pattern](./doc/Builder.md)
- 单例模式-Singleton pattern
- 原型模式-Prototype pattern

#### 结构型模式：关于类及对象的复合关系

- 适配器模式-Adapter pattern
- 桥接模式-Bridge pattern
- [装饰模式-Decorator](./doc/Decorator.md)
- 外观模式-Facade pattern
- 享元模式-Flyweight pattern
- 代理模式-Proxy pattern
- 组合模式-Composite pattern

#### 行为型模式：对象之间如何通讯

- 命令模式-Command pattern
- 中介者模式-Mediator pattern
- [观察者模式-Observer pattern](./doc/Observer.md)
- 状态模式-State pattern
- [策略模式-Strategy pattern](./doc/Strategy.md)
- 责任链模式-Chain-of-responsibility pattern
- 解释器模式-Interpreter pattern
- 迭代器模式-Iterator pattern
- 备忘录模式-Memento pattern
- 模板方法模式-Template method pattern
- 访问者模式-Visitor

#### 学习计划
参考资料：
《Head First设计模式》
《敏捷软件开发：原则、模式与实践》
《设计模式之美》