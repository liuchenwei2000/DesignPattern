## 原型（Prototype）模式 ##

原型模式属于对象的创建模式。通过给出一个原型对象来指明所要创建的对象的类型，然后用复制这个原型对象的方法创建出更多同类型的对象。

一个使用了原型模式的系统和它的产品对象是怎么创建出来的，以及这些产品对象之间的结构是怎样的，以及这个结构会不会发生变化是没有关系的。


### 再论变量、对象以及对象的引用

在 Java 语言中，对象就是类的实例。在一般情况下，当把一个类实例化时，此类的所有成员，包括变量和方法，都被复制到属于此数据类型的一个新的实例中去。

比如：

	Panda panda = new Panda();

上面的语句做了如下的事情：

* 创建了一个 Panda 类型的变量，称为 panda。
* 创建了一个 Panda 类的对象。
* 使变量 panda 指向这个新的对象。

可以将上面的语句分成两个步骤：
	
	Panda panda;
	panda = new Panda();

可以看到，第一行建立了一个变量 panda，可以指向 Panda 类对象上。但在第一行结束时并没有指到 Panda 对象上（实际上指向 null），只是在第二行才真正指向了一个 Panda 对象。因此，对象的创建和对它们的引用是独立的。


### 原型模式的优缺点

优点如下：

* 允许动态的增加或减少产品类。由于创建产品类实例的方法是产品类内部具有的，因此，增加新产品对整个结构没有影响。
* 提供简化的创建结构。工厂方法模式常常需要一个与产品类等级结构相同的等级结构，而原型模式就不需要这样。
* 产品类不需要非得有任何事先确定的等级结构，因为原型模式适用于任何的等级结构。

缺点是每一个类都必须配备一个克隆方法。配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类来说不是很难，而对于已经有的类不一定很容易，特别是当一个类引用不支持克隆的间接对象，或者引用含有循环结构的时候。


JDK 里的应用：
	
	java.lang.Object#clone()
	java.lang.Cloneable
