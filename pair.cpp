#include<bits/stdc++.h>
using namespace std;
string anagram(string str){
   string a,b;
    int n=str.size();
    for(int k=1;k<n;++k)
    if(n%k==0){
    a=str.substr(0,k);
    sort(a.begin(),a.end());
    bool ok=true;
    for(int i=k;i<n;i+=k){
        b=str.substr(i,k);
        sort(b.begin(),b.end());
        if(a!=b){
            ok=false;
            break;
        }
    }
    if(ok){
        return str.substr(0,k);
        return 0;
    }
    }
    return "-1";
}
int main(){
    string str;
    cin>>str;
    cout<<anagram(str);
    
}