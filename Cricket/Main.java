#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
  //Type your code here.
    int a,b,c,d;
  cin >> a >>b >>c >>d;
  
  cout << fixed <<setprecision(1)<< int(a/6 + 0.1*(a%6)) <<endl;
  cout << d/6 + 0.1*(d%6) <<endl;
  float e =d/6 + 0.1*(d%6);
  float f = a/6;
  cout << float(c)/e <<endl;
  cout << float(b)/f <<endl;
  float g = c/e;
  float h = b/f;
  (g > h) ? cout << "Eligible to Win" : cout << "Not Eligible to Win";
}