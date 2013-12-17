compilers2013
=============

Na spustenie testovaca potrebujete python a okrem standardnych
modulov potrebujete aj modul sh, ktory viete nainstalovat
pomocou *sudo pip install sh* 

Na to, aby ste mohli pouzit testovac, vyrobte adresar s menom vasho
projektu (napriklad nazov vasho jazyka, vase meno).

Adresar by mal obsahovat nasledovne subory/skripty:
* build.sh  - skompiluje vas kompilator
* compile.sh <input> <output> - spusti vas kompilator na vstupe input, a vyprodukuje subor output
* run.sh <program> - spusti program
* inputs.in 
