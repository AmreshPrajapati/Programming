#include<stdio.h>
#include<stdlib.h>
struct node
{
struct node *prev;
int data;
struct node *next;
};

void insertatstart(struct node **s, int d);
void insertatlast(struct node **s, int d);
void insertafter(struct node **s,struct node *n, int d);
void display(struct node **s);
struct node* find(struct node **s,int d);
int main()
{
int x,n;
struct node *start=NULL;
start=(struct node*)malloc(sizeof(struct node));
struct node *ptr;
jump:
printf("Choose the option:-\n1. Insert at first\n2. Insert at last\n3. Insert after a node\n4. Display\n5. Exit\n");
scanf("%d",&x);
switch(x)
{
case 1:printf("Enter a number to insert\n");
	scanf("%d",&n);
	insertatstart(&start,n);
	break;
case 2:printf("Enter a number to insert\n");
	scanf("%d",&n);
	insertatlast(&start,n);
	break;
case 3:printf("Enter the number after which you want to insert\n");
	scanf("%d",&n);
	ptr=find(&start,n);
	if(ptr==NULL)
	break;
	printf("Enter a number to insert\n");
	scanf("%d",&n);
	insertafter(&start,ptr,n);
case 4:display(&start);
case 5:goto last;
	break;
default:printf("You have choosen wrong option\n");
}
goto jump;
last:
return 0;
}

void insertatstart(struct node **s, int d)
{
struct node *p=(struct node*)malloc(sizeof(struct node));
p->prev=NULL;
p->data=d;
if(*s!=NULL)
{
p->next=*s;
*s=p;
}
else
{
p->next=NULL;
*s=p;
}
}
void insertatlast(struct node **s, int d)
{
struct node *t;
struct node *p=(struct node*)malloc(sizeof(struct node));
p->data=d;
p->next=NULL;
if(*s==NULL)
{
p->prev=NULL;
*s=p;
}
else
{
t=*s;
while(t->next!=NULL)
{
t=t->next;
}
p->prev=t;
t->next=p;
}
}
struct node* find(struct node **s,int d)
{
struct node *t;
t=*s;
while(t->data!=d)
{
t=t->next;
}
if(t->data==d)
return t;
else
{
printf("%d not found",d);
t=NULL;
return t;
}
}

void insertafter(struct node **s,struct node *n, int d)
{
if(n==NULL)
{
printf("invalid insertion");
}
struct node *p=(struct node*)malloc(sizeof(struct node));
p->data=d;
p->prev=n;
n->next=p;
if(n->next==NULL)
{
p->next=NULL;
}
else
{
p->next=n->next;
n->next->prev=p;
}
}
void display(struct node **s)
{
struct node *p;
p=*s;
if(*s==NULL)
printf("\nlink list is emply right now\n");
while(p->next!=NULL)
{
printf("%d ",p->data);
}
}





