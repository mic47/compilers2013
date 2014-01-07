Foxtrot
=============

Foxtrot je programovací jazyk inšpirovaný jazykom C a je možné skompilovať ho do LLVM.

Podporované dátové typy
-------------
* **int** 32-bit integer
* **string** reťazec znakov, inicializácia priamo v kóde sa zapisuje do dvojitých úvodzoviek


Premenné
-------------

Deklarácia:
`var <typ> <názov premennej>;`

Príklady:
* `var int i;`
* `var string s;`

Každá premenná musí byť pred použítím deklarovaná, deklarácia nesmie obsahovat priradenie
do premennej.

Funkcie
-------------

Zápis funkcie:
```
def <typ návratovej hodnoty> <názov>(<typ> <názov argumentu>, ...) {
  return <návratová hodnota>;
}
```

Ak funkcia nič nevracia, typ návratovej hodnoty je void a return nie je potrebné písať.

Built­in funkcie:
* string **readInt**() - číta zo STDIN jedno celé číslo (32-bit integer)
* **print**(string arg) - vypíše na STDOUT arg
* **newline**() - ukončí riadok
* **exit**() - skončí celý program

Polia
-------------

Deklarácia poľa:
```
var <typ>[<veľkosť>, ...] <názov>;
```

Príklady:
```
var int[10] a; 	       # pole o veľkosti 10 uchovávajúce int
var int n;
n = 20;
var int[n] b;          # pole o veľkosti n, kde n bolo nastavené na 20
var int[10, 20, 30] c; # 3­-rozmerné pole o veľkosti 10*20*30
```

Veľkosť poľa je typu _int_, indexácia je možná pomocou hranatých zátvoriek. V prípade
viacrozmerných polí sú jednotlivé indexy oddelené čiarkou.

Cykly a riadenie toku
-------------

Podporovaný je len štandardný while cyklus. Zápis:
```
while (<podmienka>) {
  # telo cyklu
}
```

Riadenie toku umožňuje konštrukt if, zápis:
```
if (<podmienka>) {
  # ak je podmienka pravdivá, riadenie pokračuje tu
}
else {
  # ak podmienka nie je pravdivá, riadenie pokračuje tu
  # časť else je nepovinná
}
```

Operátory
-------------
* `*, /, %`
* `+, -`
* `&&, ||`
* `==, <, >, <=, >=, !=`
* `=`

Komentáre
-------------

Momentálne nie sú podporované.

