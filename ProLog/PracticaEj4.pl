transporte(roma,20).
transporte(londres,30).
transporte(tunez,10).
alojamiento(roma,hotel,50).
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).


viaje(Ciudad,Semanas,Estancia,Precio):-
    transporte(Ciudad,PrecioTransporte),
    alojamiento(Ciudad,Estancia,PrecioSemanal),
    Precio is PrecioSemanal*Semanas+PrecioTransporte.

viajeEconomico(Ciudad,Semanas,Estancia,Precio,PrecioMax):-
    transporte(Ciudad,PrecioTransporte),
    alojamiento(Ciudad,Estancia,PrecioSemanal),
    Precio is PrecioSemanal*Semanas+PrecioTransporte,
    Precio =< PrecioMax.