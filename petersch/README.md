jazzik
======

Description
-----------

**Jazzik** (pronounced \[[d͡ʒɛziːk](http://en.wikipedia.org/wiki/International_Phonetic_Alphabet)\])
is an imperative structured programming language
with support for integers and integer arrays.
It compiles to LLVM.

Contents
--------

* `specs/` contains original language specification
* `grammar/` contains grammar for **Jazzik** used by ANTLR
* `src/parser/` contains generated ANTLR parser source files
* `src/compiler/` contains compiler source files
* `include/` contains C files compiled and linked to final output
* `examples/` contain example programs

Usage
-----

lli binary must be installed

1. `build.sh` builds parser, remove `-m32` gcc flag for 64-bit llvm build
2. `compile.sh input.jz output.ll` compiles program
3. `run.sh output.ll` runs compiled code

Rozdiely v špecifikácii
-----------------------

Jazyk podporuje iba jednorozmerné polia.
Podporované typy sú `int` a `bool`, kompilujú sa ale na ten istý `i32` typ.
Nie sú podporované operátory `++`, `--`, `?:`, ktoré v pôvodnej špecifikácii neboli,
ale objavili sa v príkladoch.

Pribudol naopak foreach cyklus pre polia.

```
int arr[]
for x in arr {
    write x
}
```

Scope premennej začína na mieste kde je deklarovaná a končí
na konci bloku, v ktorom bola deklarovaná.
Vo vnorených blokoch (`if`, `while`, `for`, `unless`) je možné deklarovať
premennú s rovnakým názvom, ktorá prekryje pôvodnú po koniec tohto bloku.

Scope iteračnej premennej `for` cyklu je po koniec cyklu, dá sa prepisovať
aj prekrývať počas behu cyklu.

```
int i = 47
for i in 1..10 {
    int i = i
    i = 9
}
write i == 47
```

Je možné volať externé funkcie, po zadeklarovaní a prilinkovaní.

```
extern void seed()
extern int rand()
int main() {
    for i in 1..10 {
        write rand()
    }
}
```

Tieto však musia používať iba podporované typy,
teda `int`, 32-bit `bool`, `int*` resp.`int[]`
a vracať `int`, alebo `void`.

Definované `void` funkcie sa kompilujú na int funkcie vracajúce 0,
preto vrátiť hodnotu z `void` funkcie resp. priradiť ju nie je chyba.
Neplatí to ale pre externé funkcie deklarované ako `void`.

Pre fungovanie funkcie `size()` sú polia implementované tak, že prvý prvok poľa
obsahuje jeho dĺžku, preto v externých funkciách treba indexovať od 1.
Polia sa ako argument funkcie posielajú referenciou.

