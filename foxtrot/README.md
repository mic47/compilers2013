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
`def <typ návratovej hodnoty> <názov>(<typ> <názov argumentu>, ...) {  
  return <návratová hodnota>;  
}`
