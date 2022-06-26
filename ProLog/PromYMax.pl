temperaturas_dia(1, 5,10).%7.5
temperaturas_dia(2, 15,19).%17
temperaturas_dia(3, 10,11).%10.5
temperaturas_dia(4, 20,32).%26
temperaturas_dia(5, 18,27).%22.5
temperaturas_dia(6, 15,21).%18

dia_no_max(X):-
    temperaturas_dia(X,_,_),
    temperaturas_dia(Y,_,_),
    X<Y.

dia_max(X):-
    temperaturas_dia(X,_,_),
    not(dia_no_max(X)).

prom_dia(Dia,Prom):-
    temperaturas_dia(Dia,X,Y),
    Prom is (X+Y)/2.

acum(0,Acum):-
    Acum=0.
acum(Dia,Acum):-
    DiaAnt is Dia-1,
    acum(DiaAnt,AcumAnt),
    prom_dia(Dia,Prom),
    Acum is AcumAnt+Prom.

prom(X):-
    dia_max(CantDias),
    acum(CantDias,Acum),
    X is (Acum/CantDias).
    