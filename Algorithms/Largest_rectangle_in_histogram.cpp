/*Given an array , each element represents the height to the histogram's bar and the width of each bar is 1.Find the area of the largest rectangle in the histogram
Sample Input:[2,1,5,6,2,3]
Sample Otput:10
#####################################################################################################################################################################
We wouls us the concept that we first push in a stack untill we get a number less than the last number and when it is so we start popping */
// CODE//

#include<bits/stdc++.h>
using namespace std;
int get_max_area(vector<int> a)
{
    int n=a.size();
    int ans=0,i=0;
    a.push_back(0);
    stack<int> st;
    //st.push(0);
    while(i<n)
    {
        while(!st.empty() && a[st.top()]>a[i])
        {
            int t=st.top();// Collecting the index
            int h=a[t];// getting the height
            st.pop();
            if(st.empty())
            {
                ans=max(ans,h*i);
            }
            else{
                int len=i-st.top()-1;
                ans=max(ans,h*len);
            }
        }
        st.push(i);
        i++;
    }
    return ans;
}
int main()
{
    vector<int> a1={2,1,5,6,2,3};
    
    int answer=get_max_area(a1);
    cout<<answer;
    return 0;
}
