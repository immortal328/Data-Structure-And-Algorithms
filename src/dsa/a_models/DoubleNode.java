package dsa.a_models;

public class DoubleNode {
	public int data;
	public DoubleNode next = null;
	public DoubleNode prev = null;

	public DoubleNode() {}
	public DoubleNode(int data, DoubleNode next) {
		super();
		this.data = data;
	}
}
