%alumno(nroAlumno,nota)
alumno(1,10).
alumno(2,9).
alumno(3,8).
alumno(4,9).
alumno(5,7).
alumno(6,10).
alumno(7,7).


no_max(X):-
    alumno(X,_),
    alumno(Y,_),
    X<Y.

max(X):-
    alumno(X,_),
    not(no_max(X)).

acum(0,0).
acum(NroAlum,Acum):-
    NroAlumAnt is NroAlum-1,
    acum(NroAlumAnt,AcumAnt),
    alumno(NroAlum,Nota),
    Acum is AcumAnt+Nota.
    
prom(X):-
    max(CantAlum),
    acum(CantAlum,Acum),
    X is Acum/CantAlum.




