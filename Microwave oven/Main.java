#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
  //Type your code here.
  int nitems;
  float ht;
  cin >> nitems >>ht;
  float newht;
  
  if (nitems == 1) {
    cout << ht;
  }
  else if (nitems == 2){
    newht = ht + 0.50*ht;
    cout << fixed << setprecision(2) << newht;
  }
  else if (nitems == 3){
    newht = 2*ht ;
    cout << newht;
  }
  else if (nitems >3){
    cout << "Number of items is more";
  }
  
 return 0;
  
}