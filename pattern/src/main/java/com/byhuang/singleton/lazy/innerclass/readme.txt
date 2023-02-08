静态内部类方式：
静态内部类单例模式中实例由内部类创建，由于JVM在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性/方法
被调用时才会被加载，并初始化其静态属性。静态属性被static修饰，保证只被实例化一次，并且严格保证实例化顺序。

这种方式同样利用了classloader机制来保证初始化 instance 时只有一个线程，
而这种方式是Singleton类被装载了，instance不一定被初始化。因为SingletonHolder类没有被主动使用，
只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在Singleton类加载时就实例化，
因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。