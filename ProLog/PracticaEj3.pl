hombre(pedro).
hombre(manuel).
hombre(arturo).
mujer(maría).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría).

niño(X,Y):-
    padre(Y,X).

hijo(X,Y):-
    padre(Y,X),
    hombre(X).

hija(X,Y):-
    padre(Y,X),
    mujer(X).

hermanohermana(X,Y):-
    padre(Z,X),
    padre(Z,Y),
    X\==Y.

hermano(X,Y):-
    padre(Z,X),
    padre(Z,Y),
    hombre(X),
    X\==Y.

hermana(X,Y):-
    padre(Z,X),
    padre(Z,Y),
    mujer(X),
    X\==Y.