from queue import *
class BinaryTree:
	def __init__(self, value):
		self.value = value;
		self.left_child = None
		self.right_child = None;
		
	def insert_left(self,value):
		if self.left_child is None:
			self.left_child = BinaryTree(value);
		else:
			node = BinaryTree(value)
			node.left_child = self.left_child;
			self.left_child = node;
			
	def insert_right(self,value):
		if self.right_child is None:
			self.right_child = BinaryTree(value);
		else:
			node = BinaryTree(value)
			node.right_child = self.right_child;
			self.right_child = node;
			
	def BFS(self):
		q = Queue()
		q.put(self)
		
		while not q.empty():
			curr = q.get()
			print(curr.value)
			
			if curr.left_child:
				q.put(curr.left_child)
				
			if curr.right_child:
				q.put(curr.right_child)	
	
				
a_node = BinaryTree('1')
a_node.insert_left('2')
a_node.insert_right('5')

b_node = a_node.left_child
b_node.insert_left('3')
b_node.insert_right('4')

c_node = a_node.right_child
c_node.insert_left('6')
c_node.insert_right('7')

d_node = b_node.right_child
e_node = c_node.left_child
f_node = c_node.right_child

a_node.BFS()
