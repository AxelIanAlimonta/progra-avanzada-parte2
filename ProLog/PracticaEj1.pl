entrada(paella).
entrada(gazpacho).
entrada(consomé).
carne(filete_de_cerdo).
carne(pollo_asado).
pescado(trucha).
pescado(bacalao).
postre(flan).
postre(helado).
postre(pastel).



menu(Entrada,PlatoPrincipal,Postre):-
	entrada(Entrada),
    (carne(PlatoPrincipal);pescado(PlatoPrincipal)),
    postre(Postre).

menuConsome(Entrada,PlatoPrincipal,Postre):-
    entrada(Entrada),Entrada==consomé,
    (carne(PlatoPrincipal);pescado(PlatoPrincipal)),
    postre(Postre).

menuSinFlan(Entrada,PlatoPrincipal,Postre):-
    entrada(Entrada),
	( carne(PlatoPrincipal);pescado(PlatoPrincipal)  ),
    postre(Postre),Postre\==flan.

    