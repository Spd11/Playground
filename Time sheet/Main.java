#include<iostream>
using namespace std;
int main()
{
  		int sun,mon,tue,wed,thurs,fri,sat;
  		cin>>sun>>mon>>tue>>wed>>thurs>>fri>>sat;
 		int rate1= sun * 150;
	  	int rate7=sat*125;
      	int rate2,rate3,rate4,rate5,rate6,rate8,bonus,bonusrate,edays;
		if(mon <= 8)
		{
    		rate2 = mon * 100;
		}
else 
{
  	bonus = mon - 8;
    bonusrate = bonus * 115;
    rate2 = bonusrate + 800;
}
if(tue <= 8)
{
  rate3 = tue * 100;
}
else
{
    bonus = tue - 8;
    bonusrate = bonus * 115;
    rate3 = bonusrate + 800;
}
if(wed <= 8)
{
  rate4 = wed * 100;
}
else
{
    bonus = wed - 8;
    bonusrate = bonus * 115;
    rate4 = bonusrate + 800;
}
if(thurs <= 8)
{
  rate5 = thurs * 100;
}
else
{
    bonus = thurs - 8;
    bonusrate = bonus * 115;
    rate5 = bonusrate + 800;
}
if(fri <= 8)
{
  rate6 = fri * 100;
}
else
{
    bonus = fri - 8;
    bonusrate = bonus * 115;
    rate6 = bonusrate + 800;
}
int totaldays = mon + tue + wed + thurs + fri;
if(totaldays > 40)
{
  edays = totaldays - 40;
  rate8 = edays * 25;
}
int totalrate = rate1 + rate2 + rate3 + rate4 + rate5 + rate6 + rate7;
cout<<totalrate;
}

