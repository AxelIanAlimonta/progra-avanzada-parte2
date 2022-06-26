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
bebida(vino).
bebida(cerveza).
bebida(agua).




menu(Entrada,PlatoPrincipal,Postre,Bebida):-
	entrada(Entrada),
    (carne(PlatoPrincipal);pescado(PlatoPrincipal)),
    postre(Postre),
    bebida(Bebida).

menuConsome(Entrada,PlatoPrincipal,Postre,Bebida):-
    entrada(Entrada),Entrada==consomé,
    (carne(PlatoPrincipal);pescado(PlatoPrincipal)),
    postre(Postre),
    bebida(Bebida).

menuSinFlan(Entrada,PlatoPrincipal,Postre,Bebida):-
    entrada(Entrada),
	( carne(PlatoPrincipal);pescado(PlatoPrincipal)  ),
    postre(Postre),Postre\==flan,
    bebida(Bebida).