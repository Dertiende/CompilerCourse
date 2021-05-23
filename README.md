# CompilerCourse
Курсовая работа студента группы ИСБ-118 Емельянова Алексея

## Запуск

*Main* класс принимает на вход название файла для считывания кода и выдаёт на выходе файл *test.class* с байт-кодом для JVM

### Библиотеки

*antlrv4* - для  генерации грамматики.

*asm-8.0.1*  - для генерации байт-кода

### 1. Грамматика языка
Файл LangSi.g4 предсталяющий грамматику находится в *src/LangSi/*

Пример программы на созданном языке:

```
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
    int out = fib(4);
    print(out);

}
```

### 2. Пример дерева разбора с помощью ***#grun***

![grun tree](https://github.com/Dertiende/CompilerCourse/blob/master/parseTree.png)


