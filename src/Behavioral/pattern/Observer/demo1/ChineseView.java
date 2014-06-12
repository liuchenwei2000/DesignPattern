/**
 * 
 */
package pattern.Observer.demo1;

/**
 * 中文视图
 * <p>
 * 具体观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class ChineseView implements View {

	@Override
	public void update(Model model) {
		StringModel smodel = (StringModel) model;
		System.out.println("中文：" + smodel.getContent());
	}
}