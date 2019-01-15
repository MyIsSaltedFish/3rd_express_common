package com.qf.express.common;

import java.util.List;
import java.util.Map;

//一个对象对应树上的一个节点
public class TreeNode {
	private	Integer	id;//绑定节点的标识值。
	private	String	text;//显示的节点文本。
	private	Boolean	checked;//该节点是否被选中。
	private	String	state;//节点状态，'open' 或 'closed'。
	private	Map<String,Object>	attributes;//绑定该节点的自定义属性。
	private	List<TreeNode> children;//目标DOM对象。
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

}
