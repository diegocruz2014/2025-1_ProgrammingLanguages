-- Una función se crea o se declara con la forma:
-- nombreFuncion parametro1 parametro2 parametro3 ... parametroN = cuerpoFuncion
-- Funciones puras: A la(s) entrada(s) siempre le(s) corresponde la misma salida

doble x = x + x

cuadrado x = x * x

sumaDos :: Integer -> Integer -> Integer -- Firma de tipo
sumaDos x y = x + y

-- Estructura condicional
esPar :: Integer -> String
esPar 0 = "El cero es múltiplo de todos los números enteros"
esPar x = 
    if x `mod` 2 == 0 -- Función "mod" escrita de forma infija
        then "El valor ingresado es par"
    else "El valor ingresado es impar"

-- Función de orden superior: Recibe una función como parámetro entrega una función en la salida
sumaDeCuadrados :: Num a => a -> a -> a
sumaDeCuadrados x y = (cuadrado x) + (cuadrado y)

sumaCuadradosAntecesorYSucesor :: Num a => a -> a
sumaCuadradosAntecesorYSucesor x = sumaDeCuadrados (x-1) (x+1)

-- Coincidencia de patrones (Pattern matching)
numeroDeLaSuerte :: Integer -> String
numeroDeLaSuerte 7 = "Adivinaste el num. de la suerte!"
numeroDeLaSuerte 5 = "Este es otro num. de la suerte!"
numeroDeLaSuerte x = "Sigue intentando..."

-- Función recursiva
crearLista :: Integer -> [Integer] -> [Integer]
crearLista x y =
    if x == 0 
        then y
    else
        --crearLista (x-1) ((x-1):y)
        crearLista z (z:y)
        where z = x - 1 -- Optimización de memoria
        
duplicarLista = map (*2)        


main :: IO()
main =  do
    a <- readLn :: IO Integer
    b <- readLn :: IO Integer
    print([0 .. 10])
    print([10, 9 .. -5])
    -- print([0 .. ]) -- Lista infinita
    -- Evaluación perezosa
    print(take 3 [0 .. ])
    print(drop 5 [1 .. 10])
    print(take 3 (drop 5 [0 .. ]))
    print([5, head[], 7] !! 2) 
    putStrLn $ "a = " ++ show a
    putStrLn $ "b = " ++ show b
    putStrLn $ "doble " ++ show a ++ " = " ++ show(doble a)
    putStrLn $ "cuadrado " ++ show a ++ " = " ++ show(cuadrado a)
    putStrLn $ "sumaDos " ++ show a ++ " " ++ show b ++ " = " ++ show(sumaDos a b)
    let num = 0
    putStrLn $ "esPar " ++ show num ++ " = " ++ show(esPar num)
    putStrLn $ "sumaDeCuadrados " ++ show a ++ " " ++ show b ++ " = " ++ show(sumaDeCuadrados a b)
    putStrLn $ "sumaCuadradosAntecesorYSucesor " ++ show a ++ " = " ++ show(sumaCuadradosAntecesorYSucesor a)
    let num = a
    putStrLn ("numeroDeLaSuerte " ++ show(num) ++ " = " ++ show(numeroDeLaSuerte num))
    let lista = []
    putStrLn ("crearLista " ++ show(num) ++ " [] = " ++ show(crearLista num []))
    let lista = [1 .. 5]
    putStrLn ("duplicarLista " ++ show(lista) ++ " = " ++ show(duplicarLista lista))
    