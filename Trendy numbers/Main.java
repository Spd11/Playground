#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,temp,digit;
  cin>>n;
  temp = n;
  string yo = to_string(n);
  if(yo.length() == 3){
    for (i=0 ; i <= 1; i++){
      digit = temp % 10;
      temp /= 10;
    }
    (digit%3 == 0)? cout <<"Trendy Number" : cout<< "Not a Trendy Number";
  }
  
  else{
    cout<< "Invalid Number";
  }
}