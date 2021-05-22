def  int fib (int num)
{
    num = num -1;
    int a = 0;
    int b = 1;
    int c = 0;
    int i = 0;
    while (i<num)
    {
        c = b;
        b = a + b;
        a = c;
        i = i + 1;
    }
    return a;
}

__main__()
{
    int out = fib(8);
    print(out);

}