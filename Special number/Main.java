#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  for(int i=m; i<=n; i++){
  
    int sum = i/10 + i%10;
    int prod = (i/10)*(i%10);
    int sumdig = sum + prod;
    if(sumdig == i){
      cout << i<<endl;
    }
  }
}