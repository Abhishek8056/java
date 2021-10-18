#include<iostream>
#include <bits/stdc++.h>
using namespace std;



bool cmp(pair<int, int> &a, pair<int, int> &b)
{
    return a.second < b.second;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
     int n, x;
        cin >> n;
        vector<pair<int, int>> arr;

        for (int i = 0; i < n; i++)
        {
            cin >> x;
            arr.push_back({x, i});
        }

        int k = 0;
        sort(arr.begin(), arr.end());

        for (int i = 0; i < n; i++)
        {
            if (arr[i].first > k)
            {
                arr[i].first = k;
                k++;
            }
            else if (arr[i].first == k)
            {
                arr[i].first = k;
            }
        }

        sort(arr.begin(), arr.end(), cmp);

        for (int i = 0; i < n; i++)
        {
            cout << arr[i].first << " ";
        }
        cout << endl;
    }
    
}