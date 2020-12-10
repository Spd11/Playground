#include<iostream>
using namespace std;


int main()
{

  
  //Type your code here.
  int n;
  cin>>n;
  int i,f,f1=0,f2=1;
  for(i=2;i<n;i++)
    {
        f=f1+f2;
        f1=f2;
        f2=f;
    }
  cout<<f;
  
  return 0;
  

    
  }