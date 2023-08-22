
#include<bits/stdc++.h>
using namespace std;
#define   fast() ios_base :: sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
int main()
{
fast();
string s [] = {"sujan","akash","batash","shahin","lamin","summm"};
int size = sizeof(s)/sizeof(s[0]);
for(int i=0;i<size-1;i++)
{
  for(int j=0;j<size-1;j++)
  {
      if(s[j]> s[j+1])
      {
          string temp = s[j];
        s[j] = s[j+1];
        s[j+1] = temp;
      }
  }
}
for(int j=0;j<size-1;j++)
{
    cout<<s[j]<<" ";
}
cout<<endl;
return 0;
}
