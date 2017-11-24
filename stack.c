#include<stdio.h>
#include<stdlib.h>
//using namespace std;

struct node
{
int data;
struct node *next;
};
struct node *top=NULL;

int push(int);
int pop();
int display();

int main()
{
int x,n;
jump:
printf("\n\nchoose 1 2 3 4 any to do\n1)pop\n2)push\n3)display\n4)exit\n");
scanf("%d",&x);
switch(x)
{
case 1:pop();
	break;
case 2:printf("Enter the number which you want to insert:-\n");
	scanf("%d",&n);	
	push(n);
	break;
case 3:display();
	break;
case 4:return 0;
default:printf("You hava choosen incorrect option");
	break;
}
goto jump;
return 0;
}

int push(int n)
{
struct node *ptr=malloc(sizeof(struct node));
ptr->data=n;
ptr->next=top;
top=ptr;
printf("the number %d is inserted successfully\n",n);
return 0;
}

int pop()
{
if(top==NULL)
printf("Stack is already empty\n");
else
{
int temp;
temp=top->data;
top=top->next;
printf("number %d is deleted successfully",temp);
}
return 0;
}

int display()
{
printf("\nthe stack is :-\n");
struct node *temp;
temp=top;
printf("\n--------------------------------\n");
while(temp!=NULL)
{
printf("\t\t| %d |\n",temp->data);
temp=temp->next;
}
printf("\n--------------------------------\n");
return 0;
}






