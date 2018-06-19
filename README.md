## MvpDemo
> 这个demo以普通的登录逻辑为例，将普通的LoginActivity里面的登录逻辑改成 MVP模式来进行设计。使得登录的逻辑能够高效的复用且能在脱离View的情况下进行单元测试。

## MVP的优点
1. 模型与视图完全分离，我们可以修改视图而不影响模型
2. 可以更高效地使用模型，因为所有的交互都发生在一个地方——Presenter内部
3. 我们可以将一个Presenter用于多个视图，而不需要改变Presenter的逻辑。这个特性非常的有用，因为视图的变化总是比模型的变化频繁。
4. 如果我们把逻辑放在Presenter中，那么我们就可以脱离用户接口来测试这些逻辑（单元测试）

## MVP类结构图
![](https://github.com/liuzhanta/MvpDemo/blob/master/MVP.jpg)

## 运行截图
![](https://github.com/liuzhanta/MvpDemo/blob/master/screenshot.png)
