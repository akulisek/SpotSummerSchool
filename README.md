SpotSummerSchool 2014 
================

##Úloha 1:
Anagram slova je nové slovo, ktoré vznikne poprehadzovaním písmen pôvodného slova.
Napíš program, ktorý pre zadané slovo a zoznam kanditátov vráti slová, ktoré su anagramom daného slova.
Napríklad pre slovo "listen" a zoznam kandidátov ["enlists", "google", "inlets", "banana"] program vráti zoznam ["inlets"].
Pokús sa algoritmus hľadania anagramov optimalizovať tak, aby bol čo najefektívnejší a vysvetli aké optimalizácie si použil a prečo.

###Riešenie: 
 Anagrams.java
 
Algoritmus funguje na princípe porovnávania počtu výskytov jednotlivých znakov dvoch slov (predpoklad je, že používateľ môže zadať slovo skladajúce sa zo znakov, ktoré patria do ASCII tabuľky). Algoritmus využíva dve jednoduché hashmapy(pole) na ukladanie výskytov jednotlivých znakov slova(kľúč je ASCII hodnota znaku, hodnota je počet výskytov).Najprv používateľ zadá slovo, ku ktorému budeme potenciálne anagramy porovnávať, a potom zadá ľubovoľný počet slov, každé na vlastný riadok, pričom túto množinu slov uzavrie prázdnym riadkom po zadaní posledného slova. Program vyhodnotí slovo po slove, či sa jedná o anagram, alebo nie, ak áno, tak daný anagram rovno vypíše na výstup a pokračuje takto až po posledné zadané slovo z množiny slov.

Časová zložitosť algoritmu je O(N), priestorová zložitosť je O(1), keďže hash mapy budú mať vždy rovnakú veľkosť(256) a do každého volania vstupujú dve slová.
 
##Úloha 2:
Navrhni dátový model pre elektronický obchod, ktorý predáva produkty. Produkty majú názov, popis a cenu. Objednávka obsahuje zoznam zákazníkom vybraných produktov a ich množstvo. Zákazník je identifikovaný emailovou adresou. Obchod ponúka aj zľavy cez zľavové kúpóny, ktoré je možné použiť na nákupy a je vždy vyjadrený percentuálnou hodnotou (napr. 5% zľava). Zľavový kupón je identifikovaný kódom (napr. SALE2014) a môže byť použitý len limitovaný čas a limitovaný počet krát. Zoznam objednávok má slúžiť ako evidencia histórie nákupov pre ekonomické oddelenie. V návrhu počítajte s tým, že ceny produktov sa časom zvyknú meniť.
Nakresli a vysvetli dátový model (tabuľky, prepojenia a stĺpce) pre takýto e-shop.

###Riešenie: 
![](https://dl.dropboxusercontent.com/u/55545989/SpotSummerSchoolESHOP.png)

Obrázok zobrazuje mnou navrhnutý dátový model na základe vyššie uvedenej úlohy.
Atribúty tried majú určený aj dátový typ(pre lepšiu orientáciu v modeli) napísaný veľkými písmenami.
Trieda Order predstavuje objednávku ako požiadavku zákazníka na eshop. Objednať môže zákazník jeden alebo položiek(OrderedItem), každý z nich v rôznej kvantite. Položky sa priamo vzťahujú k produktom, ktoré eshop ponúka. Každý z produktov môže mať počas histórie obchodu niekoľko cien, a aby sme ich čo najlepšie evidovali, namodelovaná bola trieda Price. Tá umožňuje sledovať históriu cien daného produktu.
Na objednávky je taktiež možné uplatniť zľavové kupóny, avšak na jednu objednávku maximálne jeden kupón.
