#include<stdio.h>
#include<stdlib.h>

struct node
{
	struct node *left;
	struct node *right;
	int data;
};

struct node* insert(struct node *temp,int data)
{
	struct node *ptr;
	int i;
	if(temp==NULL)
	{
		ptr->right=NULL;
		ptr->left=NULL;
		ptr->data=data;
		temp=ptr;
		return temp;
	}
	if(data > temp->data)
	temp->right=insert(temp->right,data);
	else
	temp->left=insert(temp->right,data);
return temp;
	
}
int main()
{
 struct node *root=NULL;
 insert(root,45);
 insert(root,5);
 insert(root,5);
 insert(root,47);
 insert(root,41);
return 0;
}


