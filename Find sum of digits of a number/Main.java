#include <iostream>
using namespace std;

int main() 
{
  int a;
  cin >> a;
  float sum = 0;
  while(a != 0){
    sum = sum + a%10;
    a = a/10;
  }
 
  cout <<sum;
  
  
}