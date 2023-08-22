#include<bits/stdc++.h>
using namespace std;
#define   fast() ios_base :: sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
int main()
{
fast();
int a [] = {6,6,4,3,65,99,78,66,56,77,4,44,22,22,2334,556,7,8,8};
int size = sizeof(a)/sizeof(a[0]);
for(int i=0;i<size-1;i++)
{
   for(int j=0;j<size-1;j++)
   {

       if(a[j] > a[j+1])
       {
           int temp =a[j];
           a[j] = a[j+1];
           a[j+1] = temp;
       }
   }
}

for(int i=0;i<size;i++)
{
    cout<<a[i]<<" ";
}
cout<<endl;
return 0;
}

