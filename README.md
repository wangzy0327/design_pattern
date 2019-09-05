# design_pattern

### design_principle

- 开闭原则
- 依赖倒置原则
- 单一职责原则
- 接口隔离原则
- 迪米特原则(最少知道原则)
- 里式替换原则
- 合成复用原则


### creational_pattern

- 简单工厂
```
定义：由一个工厂对象决定创建出哪一种产品类的实例
类型：创建型，但不属于GOF23种设计模式

适用场景：工厂类负责创建的对象较少
客户端（应用层）只知道传入工厂类的参数
对于如何创建对象（逻辑）不关心

优点：
只需要传入一个正确的参数，就可以获取你所需要的对象
而无须知道其创建细节
缺点：
工厂类的职责相对过重，增加新的产品
需要修改工厂类的判断逻辑，违背开闭原则
```
- 工厂方法
```
定义一个创建对象的接口
但让视线这个接口的类来决定实例化哪个类
工厂方法让类的实例化推迟到子类中进行

创建型

适用场景：
创建对象需要大量重复的代码
客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
一个类通过其子类来制定创建哪个对象

强调：产品等级

优点：
用户只需要关心所需产品对应的工厂，无须关心创建细节
加入新产品符合开闭原则，提高可扩展性

缺点；
类的个数容易过多，增加复杂度
增加了系统的抽象性和理解难度
```
- 抽象工厂
```
定义：抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
无需指定它们具体的类

创建型

适用场景：
客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码
提供一个产品类的库，所有产品以同样的接口出现，从而使客户端不依赖于具体实现

强调：产品族

优点：
具体产品在应用层代码隔离，无须关心创建细节
将一系列的产品族统一到一起创建

缺点：
规定了所有可能被创建的从产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
增加了系统的抽象性和理解难度
```

- 建造者模式
```
定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程
可以创建不同的表示

用户只需指定需要构造的类型就可以得到它们，构建过程及细节不需要知道

创建型

适用场景：
如果一个对象有非常复杂的内部结构（很多属性）
想把复杂对象的创建和使用分离
强调：
更注重方法调用顺序、部件


优点：
封装性好，创建和使用分离
扩展性好、建造类之间独立、一定程度上解耦

缺点：
产生多余的Builder对象
产品内部发生变化，建造者都要修改，成本较大
```

- 单例模式
```
定义：保证一个类仅有一个实例，并提供一个全局访问点
创建型

适用场景：想确保任何情况下都绝对只有一个实例

优点：
在内存里只有一个实例，减少了内存开销
可以避免对资源的多重占用
设置全局访问点，严格控制访问

缺点：
没有接口，扩展困难

重点：
私有构造器
线程安全
延迟加载
序列化和反序列化安全
反射
```

- 原型模式
```
定义：指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
        不需要知道任何创建的细节，不调用构造函数
创建型

适用场景：类初始化消耗较多资源
        new产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
        构造函数比较复杂
        循环体中生产大量对象时

优点：原型模式性能比直接new一个对象性能高
    简化创建过程
    
缺点：必须配备克隆方法
     对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
     深拷贝、浅拷贝要运用得当
     
扩展：深克隆、浅克隆
```

- 外观模式
```
定义：又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口
外观模式定义了一个高层接口，让子系统更容易使用

结构型

适用场景：子系统越来越复杂，增加外观模式提供简单调用接口
        构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
        
优点：
简化了调用过程，无需了解深入子系统，防止带来风险
减少系统依赖、松散耦合
更好的划分访问层次
符合迪米特法则，即最少知道原则

缺点：
增加子系统、扩展子系统行为容易引入风险
不符合开闭原则

相关设计模式：
外观模式 和 中介者模式

外观模式 和 单例模式

外观模式 和 抽象工厂模式
```