package com.rovi.algo.trees;

import java.util.Iterator;

public class SimpleTree<E> extends Tree<E>{

	
	public SimpleTree(TreeNode root) {
		super(root);
	}

	@Override
	protected void buildTree(Iterator<E> listIterator) {
		while(listIterator.hasNext()){
			E value = listIterator.next();
			TreeNode root = getRoot();
			System.out.println("building tree");
		}
	}

}
