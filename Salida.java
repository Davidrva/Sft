public class Salida
{
    public static void main(String[] args)
    {
        System.out.println("Hola usuario bienvenido");
        System.out.println("A continuación se muestra una cuenta regresiva");

        for (int i = 5; i >= 1;  i--)
        {
            System.out.println(i);//Se muestra cada valor de i (de 10 al 1)
        }

        System.out.println("Ahora, otra cuenta regresiva");

        for (int i = 5; i >= 1;  i--)
        {
            System.out.print(i);//Se muestra cada valor de i (de 1 a 10)
            System.out.print("hola broster :v");
        }
    }
}
