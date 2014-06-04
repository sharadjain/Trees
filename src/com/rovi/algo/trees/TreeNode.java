package com.rovi.algo.trees;

abstract public class TreeNode {

	private TreeNode leftChild;
	private TreeNode rightChild;
	private Object value;
	protected TreeNode getLeftChild() {
		return leftChild;
	}
	protected void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	protected TreeNode getRightChild() {
		return rightChild;
	}
	protected void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	protected Object getValue() {
		return value;
	}
	protected void setValue(Object value) {
		this.value = value;
	}	
}