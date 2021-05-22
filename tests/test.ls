def int check (int k, float b, int c)
{
    int d = 7;
    if(d==7){
        if (k<5){
            print('k');
        }
    d = 8;
    }
    print(c);
    print(d);
    print(k);
    print (b);

    return d;

}

def int tryr (int k, int b, int c)
{
    int d = 7;
    if(d==7){
    d = 14;
    }
    print(c);
    print(d);
    print(k);

    return d;

}

__main__(){

int d = 1;
int e = 1;
while(d==e){
    if (d>3){
        e = e+1;
        break;
    }
    d = d+1;
    e = e+1;
    print(e);
    print(d);
    print('e');
}
int r = 4-24;
int re = r+20;
print(r);
print(re);
print('g');
int out =1;
out = check(1,1.2,2);
print(out);
out = tryr(out,r,2);
print(out);
}
