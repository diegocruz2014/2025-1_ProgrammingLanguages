-- Recursividad
-- Función factorial
factorial :: Integer -> Integer
factorial 0 = 1
factorial x = x * factorial (x - 1)

-- Función para crear una lista
crearLista :: Integer -> [Integer] -> [Integer]
crearLista x y =
    if x == 1 -- Disparador
        then y 
    else
        crearLista z (z:y)
        where z = x - 1    

-- Función para filtrar los números pares en una lista
filtrarParesLista :: [Integer] -> [Integer]
filtrarParesLista = filter (\x -> x `mod` 2 == 0) -- Entre paréntesis aparece una función anónima (abstracción o forma lambda)

-- Función para duplicar cada uno de los valores de una lista
duplicarLista :: [Integer] -> [Integer]
duplicarLista = map (*2)

-- Función para incrementar en uno cada uno de los valores de la lista
incrementarLista :: [Integer] -> [Integer]
incrementarLista = map (+1) -- En lugar de (+1) puedo escribir la función "succ"

-- Operador de composición (.) => Combinar funciones en una sola
combinar :: [Integer] -> [Integer]
combinar = incrementarLista . duplicarLista . filtrarParesLista -- Se evalúa de derecha a izquierda

-- Función que recibe un parámetro en la entrada y entrega más de un parámetro en la salida
listaUnValor x = x []

-- Función para crear una lista con un solo parámetro
generarLista = listaUnValor . crearLista -- Se evalúa de izquierda a derecha


main :: IO()
main = do
    a <- readLn :: IO Integer
    putStrLn("a = " ++ show(a))
    let num = a
    putStrLn("factorial " ++ show(num) ++ " = " ++ show(factorial num))
    let lista = crearLista 8 []
    putStrLn("filtrarParesLista " ++ (show lista) ++ " = " ++ show(filtrarParesLista lista))
    putStrLn("duplicarLista " ++ (show lista) ++ " = " ++ show(duplicarLista lista))
    putStrLn("incrementarLista " ++ (show lista) ++ " = " ++ show(incrementarLista lista))
    putStrLn("combinar " ++ (show lista) ++ " = " ++ show(combinar lista))
    putStrLn("generarLista " ++ (show num) ++ " = " ++ show(generarLista num))