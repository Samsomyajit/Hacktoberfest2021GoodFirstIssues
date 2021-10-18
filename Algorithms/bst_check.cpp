#include <bits/stdc++.h>
using namespace std;

/* A binary tree node has data, pointer to left child
and a pointer to right child */
struct Node {
	int data;
	struct Node *left, *right;
	Node(int data)
	{
		this->data = data;
		left = right = NULL;
	}
};

/* Given a binary tree, print its nodes according to the
"bottom-up" postorder traversal. */


/* Given a binary tree, print its nodes in inorder*/
void printInorder(struct Node* node, vector<int>& v)
{
	if (node == NULL)
		return;

	/* first recur on left child */
	printInorder(node->left,v);

	/* then print the data of node */
	v.push_back(node->data);

	/* now recur on right child */
	printInorder(node->right,v);
}

/* Given a binary tree, print its nodes in preorder*/

/* Driver program to test above functions*/
int main()
{
	struct Node* root = new Node(2);
	root->left = new Node(1);
	root->right = new Node(3);
    vector<int> v;
	printInorder(root,v);
  int t=0;
    for(int i=0;i<v.size()-1;i++)
    {
      if(v[i]>v[i+1])
      {
        t=1;
        break;
      }
    }
  if(t==0)
  {
    cout<<"It is a bst";
  }
  else
  {
    cout<<"It is not a bst";
  }
  
  

	return 0;
}
