
### Builder Patterns

> Use the Builder Pattern to encapsulate the construction of a product and allow it to be constructed in steps.

- Encapsulates the way a complex object is constructed.
- Allows objects to be constructed in a multistep and varying process (as opposed to one-step factories).
- Hides the internal representation of the product from the client.
- Product implementations can be swapped in and out because the client only sees an abstract interface.

建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

目的：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。

主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。

Question:
Builder 承担着一个什么样的角色？
Director 呢？
谁是负责真正对接 Client 的接口？

建造者模式和链式写法注意区别。一个是设计模式，一个是编码方式。


我在想，可能并不用太拘于具体的实现细节，设计的原则应该是围绕着面向对象的六大基本原则来展开，
至于一定要对照某个具体的设计模式那样就太刻板了，真实的场景中一定是混合在一起的。
