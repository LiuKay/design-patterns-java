

## Design Patterns Practice


>如何正确地使用设计模式？ - 知乎
https://www.zhihu.com/question/23757906


设计模式是为了封装变化，让各个模块可以独立变化。精准地使用设计模式的前提是你能够精准的预测需求变更的走向。我们都知道大部分人是做不到的，所以大部分人就算精通设计模式也多少会做错点什么东西。所以这其实不怪设计模式<del>，怪产品狗</del>。所以说如何避免过度设计，这就要求你深入的理解你的程序所在的领域的知识，了解用户使用你的软件是为了解决什么问题，这样你预测用户的需求才会比以前更加准确，从而避免了你使用设计模式来封装一些根本不会发生的变化，也避免了你忽视了未来会发生的变化从而发现你使用的模式根本不能适应需求的新走向。所以，在你满足了【知道所有设计模式为什么要被发明出来】的前提之后，剩下的其实都跟编程没关系，而跟你的领域知识和领域经验有关系

作者：vczh
链接：https://www.zhihu.com/question/23757906/answer/25566837
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


-----

项目结构：
- ex1,2... ： 示例1,2...
- template 模板
- jdk JDK里面的实现

### 设计模式的六大原则
For those who are not aware of this, SOLID is an acronym for the first 5 principles of object-oriented design:

- SRP The Single Responsibility Principle: -- a class should have one, and only one, reason to change.
- OCP The Open Closed Principle: -- you should be able to extend a class's behavior, without modifying it.
- LSP The Liskov Substitution Principle: -- derived classes must be substitutable for their base classes.
- ISP The Interface Segregation Principle: -- make fine grained interfaces that are client specific.
- DIP The Dependency Inversion Principle -- depend on abstractions not on concrete implementations.

1、开闭原则（Open Close Principle）

开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

2、里氏代换原则（Liskov Substitution Principle）

里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

3、依赖倒转原则（Dependence Inversion Principle）

这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4、接口隔离原则（Interface Segregation Principle）

这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

5、迪米特法则，又称最少知道原则（Demeter Principle）

最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

6、合成复用原则（Composite Reuse Principle）

合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。

-----
### 创建型模式

- 简单工厂模式
- 工厂方法模式
- 抽象工厂模式
- 建造者模式
- 单例模式

### 结构型模式

- 适配器模式
- 桥接模式
- 装饰模式
- 外观模式
- 享元模式
- 代理模式

### 行为型模式

- 命令模式
- 中介者模式
- 观察者模式
- 状态模式
- 策略模式


