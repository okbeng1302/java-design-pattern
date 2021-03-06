### 建造者模式

#### 场景

- 我们要建造一个复杂的产品。
	创建子组件是不是有步骤问题
	
#### 建造模式的本质

- 分离对象子组件的单独构造（由Builder来负责）和装配（由Director负责）。从而构造复杂的对象。这个模式适用于：某个对象的构建过程复杂的情况下使用。

- 由于实现了构建和装配的解耦。不同的构建器，相同的装配，也可以做出不同的对象；相同的构建器，不同的装配顺序也可以做出不同的对象。也就是实现了构建算法、装配算法的解耦，实现了更好的复用。


#### 开发中的应用场景

1. StringBuilder类的 append 方法

2. Sql 中的 PreparedStatement

3. JDOM	中，DomBuilder、SAXBuilder


创建者模式又叫建造者模式，是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。创建者模式隐藏了复杂对象的创建过程，它把复杂对象的创建过程加以抽象，通过子类继承或者重载的方式，动态的创建具有复合属性的对象。

创建者模式通常包括如下几种角色：

1. 建造者角色（Builder）

对复杂对象的创建过程加以抽象，给出一个抽象接口，以规范产品对象的各个组成部分的建造。这个接口规定了要实现复杂对象的哪个部分的创建，但并不涉及具体对象不见的创建。

2. 具体创建者角色（ConcreateBuilder）

实现Builder接口，针对不同的业务逻辑，具体化复杂对象的各个部分的创建。在建造过程完成后，提供产品的实例。

3. 指导者（Director）

调用具体建造者来创建复杂对象的各个部分，在指导者中不设计具体产品的信息，只负责保证对象各部分完整创建或者按某种顺序创建。

4. 产品（Product）

要创建的复杂对象，一般来说包含多个部分。


1）使用建造者模式的好处：

①使用建造者模式可以使客户端不必知道产品内部组成的细节。

②具体的建造者类之间是相互独立的，这有利于系统的扩展。

③具体的建造者相互独立，因此可以对建造的过程逐步细化，而不会对其他模块产生任何影响。

2）建造者模式的使用场景：

①创建一些复杂对象时，这些对象的内部组成部分之间的建造顺序是稳定的，但对象的内部组成构建面临着复杂的变化。

②要创建的复杂对象的算法，独立于该对象的组成部分，也独立于组成部分的装配方法时。