package com.rovi.algo.trees;

import java.util.Iterator;

public abstract class Tree<E> {

	private TreeNode root;
	protected abstract void buildTree(Iterator<E> listIterator);
	
	
	protected TreeNode getRoot() {
		return root;
	}


	protected void setRoot(TreeNode root) {
		this.root = root;
	}


	public Tree(TreeNode node) {
		super();
		this.root = node;
	}

}
