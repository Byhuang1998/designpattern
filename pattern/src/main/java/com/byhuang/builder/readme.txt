建造者模式

优点：
1 封装性好。使用建造者模式可以有效封闭变化。在使用建造者模式的场景中，一般产品类和建造者类是比较稳定的，因此，将主要的业务逻辑封装在
指挥者类中对整体而言取得比较好的稳定性。
2 在建造者模式中，客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象
3 可以更加精细地控制产品的创建过程。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程
4 建造者模式很容易进行扩展。如果有新需求，通过实现一个新的建造者类就可以完成，基本不用修改之前已经测试通过的代码，因此也就不会对原有
功能引入风险，符合开闭原则

缺点：
建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间差异性很大，则不适合使用建造者模式，因此使用范围受到一定的限制。

使用场景：
建造者模式创建的是复杂对象，其产品的各个部分经常面临着剧烈的变化，但将它们组合在一起的算法却相对稳定，所以它通常在以下场合使用。
1 创建的对象较复杂，由多个部件构成，各部件面临着复杂的变化，但构件的建造顺序是稳定的
2 创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式，即产品的构建过程和最终的表示是独立的。