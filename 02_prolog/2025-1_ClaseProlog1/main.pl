% Definición de hechos
padre(juan, ana). % Juan es el padre de Ana
padre(juan, luis).
padre(pedro, juan).
padre(juan, pedrito).
padre(roberto, lucia).
padre(roberto, julia).
madre(julia, ana).
madre(julia, luis).
madre(maria, juan).
madre(rigoberta, pedrito).
madre(carmen, julia).
madre(carmen, lucia).


% Definición de reglas
hijo(X, Y) :- padre(Y, X); madre(Y, X).
hermano(X, Y) :- padre(Z, X), padre(Z, Y), madre(W, X), madre(W, Y), X \= Y.
mediohermano(X, Y):- madre(Z, X), madre(Z, Y), padre(W, X), padre(V, Y), X\=Y, W\=V; padre(Z, X), padre(Z, Y), madre(W, X), madre(V, Y), X\=Y, W\=V.
abuelo(X, Y) :-
    (padre(X, Z); madre(X, Z)),
    (padre(Z, Y); madre(Z, Y)).
tia(X, Y) :- hermano(X, Z), padre(Z, Y).
tia(X, Y) :- hermano(X, Z), madre(Z, Y).

% Definición del proceso principal
main:-
        proceso,
        halt.

% Definir un proceso secundario llamado "proceso"
proceso:-
        write('Hijos de Juan: '), nl,
        findall(X, hijo(X, juan), HijosJuan),
        write(HijosJuan), nl, nl,
        write('Hijos de Maria: '), nl,
        findall(X, hijo(X, maria), HijosMaria),
        write(HijosMaria), nl, nl,
        write('Hermanos: '), nl,
        findall((X, Y), hermano(X, Y), Hermanos),
        write(Hermanos), nl, nl,
        write('Medio hermanos: '), nl,
        findall((X,Y), mediohermano(X,Y), MedioHermano),
        write(MedioHermano), nl, nl, 
        write('Tía de Ana, Luis y Pedrio: '), nl,
        findall(X, tia(X, ana), TiasAna),
        findall(X, tia(X, luis), TiasLuis),
        findall(X, tia(X, pedrito), TiasPedrito), 
        write('Ana : '), write(TiasAna), nl,
        write('Luis : '), write(TiasLuis), nl,
        write('Pedrito : '), write(TiasPedrito), nl, nl,
        write('Abuelos de Ana: '), nl,
        findall(X, abuelo(X, ana), AbuelosAna),
        write(AbuelosAna).
        
        

% Ejecución del proceso principal        
:- main.



/*
Ejercicios:
    1. Incluir un hijo de juan o julia llamado "pedrito" y 
       mostrar los medios hermanos.
    2. Incluir una tía de ana, luis y pedrito llamada "lucia"; ella es 
       hermana de julia.
    3. Mostrar los abuelos de ana.
*/