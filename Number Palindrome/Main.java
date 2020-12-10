#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n,revn,i,digit;
    cin>>n;
    int temp = n;
    for( i=0; temp >0; i++){
      digit = temp % 10;
      revn = revn*10 + digit;
      temp /= 10;
    }
  
    (n == revn) ? cout<<"Equal" : cout<< "Not equal";
  
      
    return 0;
}