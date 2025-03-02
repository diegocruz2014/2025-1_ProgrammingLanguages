
-- Comentario de una sola línea
main :: IO ()
main = do
    putStrLn "Hello World"
    putStrLn $ show (5 + 2)
    let a = 5
    let b = 2
    let suma = a + b
    print(suma)
    putStrLn $ show(a - b)
    putStrLn $ show(a / b)
    putStrLn $ show(div 5 2)
    let palabra = "Hola"
    putStrLn $ palabra ++ " mundo!"