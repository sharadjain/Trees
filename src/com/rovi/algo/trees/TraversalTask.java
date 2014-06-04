package com.rovi.algo.trees;

public class TraversalTask extends TreeTask{

	TraversalType type;
	public TraversalTask(TreeNode node,TraversalType type) {
		super(node);
		this.type = type;
	}

	@Override
	protected void execute() {
		this.traverse();
	}

	protected void traverse(){
		type.traverse();
	}

}