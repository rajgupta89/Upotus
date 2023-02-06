#include<iostream>
#include<vector>
using namespace std;
int weirdarray(int n,int a[]){
    if(n<2){
        return 0;
    }
    vector<int>li;
    int count=0;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(a[i]==a[j])
            count++;
            else{
                li.push_back(count);
                count=0;
                break;
            }}}
    int maxx=0;
    for(int num:li){
        if(num>maxx){
            maxx=num;
        }}
    return maxx;
}
int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<weirdarray(n,a)<<endl;
        return 0;
}