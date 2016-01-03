## 备忘录（Memento）模式 ##

备忘录模式又叫做快照（Snapshot）模式或 Token 模式，是对象的行为模式。

备忘录（Memento）对象是一个用来存储另外一个对象内部状态快照（snapshot）的对象。备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉（capture）住，并外部化存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态。

常见的软件系统往往不止存储一个状态，而是需要存储多个状态。这些状态常常是一个对象历史发展的不同阶段的快照，存储这些快照的备忘录对象叫做此对象的历史；某一个快照所处的位置叫做检查点（Check Point）。

备忘录模式所涉及的角色有：

备忘录（Memento）角色、发起人（Originator）角色、负责人（Caretaker）角色。


### 备忘录模式的优点

* 有时一些发起人对象的内部信息必须保存在发起人对象以外的地方，但是必须要由发起人对象自己读取。这时，使用备忘录可以把复杂的发起人内部信息对其他的对象屏蔽起来，从而可以恰当的保持封装的边界。

* 本模式简化了发起人类。发起人不再需要管理和保存其内部状态的一个个版本，客户端可以自行管理它们所需要的这些状态的版本。

* 当发起人角色的状态改变的时候，有可能这个状态无效，这时候就可以使用暂时存储起来的备忘录将状态复原。

### 备忘录模式的缺点

* 如果发起人角色的状态需要完整的存储到备忘录对象中，那么在资源消耗上面备忘录对象会很昂贵。

* 当负责人角色将一个备忘录存储起来的时候，负责人可能并不知道这个状态会占用多大的存储空间，从而无法提醒用户一个操作是否会很昂贵。

* 当发起人角色的状态改变的时候，有可能这个状态无效。如果状态改变的成功率不高的话，不如采取假如协议模式。

备忘录模式常常与命令模式和迭代子模式一同使用。

JDK 里的应用：

	java.util.Date
	java.io.Serializable