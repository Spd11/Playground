#include<iostream>
using namespace std;
#include<math.h>
int main()
{
    int x1,x2,y1,y2,r1,r2,d;
    cin>>x1>>y1>>r1>>x2>>y2>>r2;
    d=sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    if((r1+r2)==d)
        cout<<"Tangential";
    else if((r1+r2)>d)
        cout<<"Overlap";
    else if((r1+r2)<d)
        cout<<"Do not Overlap";
    return 0;
}