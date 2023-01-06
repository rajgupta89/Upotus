#include<bits/stdc++.h>
using namespace std;
int solve(int m, int arr[],int num){
    unordered_set<int> safal;
    unordered_set<int> shreya;
    int count=0;
    
    for(int i=0;i<m;i++){
        if(safal.find(num-arr[i])!=safal.end() && shreya.find(arr[i])==shreya.end()){
            count++;
            shreya.insert(arr[i]);
            shreya.insert(num-arr[i]);
        }
        safal.insert(arr[i]);
    }
    return count;
}
int main(){
    int m,num;
    cin>>m;
    int arr[m];
    for(int i=0;i<m;i++){
        cin>>arr[i];
    }
    cin>>num;
    cout<<solve(m,arr,num);
}