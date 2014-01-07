Kompilator kuboj
=============

Syntax
-------------

c like - curly braces, okruhle zatvorky pri riadiacich strukturach a volaniach fcii
bodkociarky na konci, oddelovac prikazov je bodkociarka.

Struktura programu
-------------

najprv **import**-y externych funkcii, potom definicie vlastnych funkcii a napokon funkcia **main**

Premenne
-------------

* deklaracia klucovym slovom **var**
* scope premennych sa vztahuje na celu funkciu, nie blok
* najprv sa deklaruje, az potom dalsim prikazom priradi hodnota, resp. sa inicializuje
* povolene typy su: **int** a **int[]**
* string ako typ podporovany nie je, pre vypisovanie na standardny vystup sluzia specialne funkcie **writestr** a **writestrnl**
* int[] sa inicializuje pomocou funkcie **mallocint(int)**. pristup do "pola" je potom Cckovsky. priklad:

```
var int[] array;
array = mallocint(10);
array[4] = 47;
```

Operatory
-------------

* ||, &&, \*, +, -, /, %, !, ==, =>, =<. !=, >, <

Funkcie
-------------

* definicia kazdej funkcie zacina klucovym slovom **function** nasleduje navratovy typ, meno funkcie
 a v okruhlych zatvorkach parametre funkcie s typmi
* je povinna funkcia **main()**, ktora je bez parametrov a musi vracat **int**
* kazda funkcia musi mat return, prave jeden a musi byt na konci
* povolene navratove typy pre funkcie su **int** aj **int[]**

Riadiace struktury
-------------

* **for** - riadiacu premennu musi mat dopredu deklarovanu. priklad:

```
var int i;
i = 0;
for (i < 10; i = i + 1) {
  ...
}
```

* **if** - vyhodnocuje, ci je vyraz v zatvorke nenulovy. **else** vetva nie je povinna

Kniznicne funkcie
-------------

* *int* readint() - nacita int zo standardneho vstupu
* *int* writeint(*int*) - vypise int na standardny vystup
* *int* writeintnl(*int*) - vypise int na standardny vystup a zapise newline
* *int* writestr(*"somestring"*) - vypise string na standardny vystup
* *int* writestrnl(*"somestring"*) - vypise string na standardny vystup a zapise newline
* *int[]* mallocint(*int*) - alokuje pamat na dany pocet intov a vrati pointer na prvy

Pouzivanie externych funkcii
-------------

* ak su funkcie korektne prilinkovane, importuje sa pomocou klucoveho slova **import** nasledovane deklaraciou funkcie plus bodkociarka na konci. priklad:

```
import int[] myfunction(int, int, int[]);
```

Zmeny oproti povodnej specifikacii
-------------

* polia nahradene pointrami na inty
* vyhodena kniznicna funkcia **length(array)**
* zrusenie typu *string*
* vyhodena riadiacia strukutra *while* a operatory *-=* a *+=*
* **return** musi byt stale na konci funkcie

Hello world
-------------

```sh
$ ./build.sh
$ ./compile.sh test/hello tmp/out
$ ./run.sh tmp/out
Hello World!
```

* malo by fungovat aj *./judge.py kuboj hello*

Komplexnejsi priklad
-------------

* povedzme, ze do *src/library.c* pridame nasledovny kod:

```c
int pretty_array_print(int array[], int length) {
  int i;
  printf("[");
  for (i = 0; i < length; i++) {
    if (i != 0) {
      printf(", ");
    }
    printf("%d", array[i]);
  }
  printf("]\n");

  return 0;
}
```

* subor *tmp/in* bude mat nasledovny obsah

```
import int pretty_array_print(int[], int);

function int[] generate_array(int length) {
  var int i;
  var int[] a;
  a = mallocint(length);
 
  i = 0;
  for (i < length; i = i + 1) {
    a[i] = i;
  }

  return a;
}

function int main() {
  var int i;
  i = readint();

  var int[] array;
  array = generate_array(i);
  pretty_array_print(array, i);

  return 0;
}
```

* build, compile, run

```sh
$ ./build.sh 
$ ./compile.sh tmp/in tmp/out
$ ./run.sh tmp/out
9
[0, 1, 2, 3, 4, 5, 6, 7, 8]
```
