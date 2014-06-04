package com.rovi.algo.trees;

public abstract class TreeTask {

	private TreeNode root;

	protected TreeNode getRoot() {
		return root;
	}

	protected void setRoot(TreeNode root) {
		this.root = root;
	}
	
	
	public TreeTask(TreeNode root) {
		super();
		this.root = root;
	}

	protected abstract void execute();

}
