public class Volumen{
private int espacios;
int max;
int encontrados=0;

public int calcular(int[] arr){
  // poner que reciba arreglo
  max=0;
  for (i=0;i<arr.lenght;i++)
  {
    if(arr[i]>max)
    {
      max=arr[i];
    }
  }
  int[] almacen= new int[max*arr.lenght];
  for (int z=0;i<max;i++)
  {
  for (int i=arr.lenght*z;i<arr.lenght*z+1;i++ ) {
    if(arr[i-arr.lenght*z]>0)
    {
      almacen[i]++;
      arr[i-arr.lenght*z]--;
    }
  }
  }

  for(int i =0 ; i<almacen.lenght;i++)
  {
    for(int j=i+1; j<almacen.lenght;j++)
    {
      if(almacen[i] == almacen[j] && almacen[i]==1)
      {
        encontrados++;
        i=j;
      }
      if((i+1)%arr.lenght)
      {
        i=j
      }
    }
  }
  return encontrados;
}
}




/// intento de hacerlo por capas
  /*
  for (i=0;i<arr.length;i++ ){
    if(arr[i]>0)
    {
      for(j=i+1;j<arr.length;j++)
      {
        if (arr[j]>0 && arr[j]<=arr[i])
        {
          if(encontrados == 0)
          {
            max = (arr[i]>=arr[j])? arr[j]:arr[i];
            econtrados++;
          }
          else if (arr[i]>max and arr[j]>max) {
            //tomar el más pequeño
            max += (arr[i]>=arr[j])? arr[j]-arr[i]:arr[i]-arr[j];

          }
          else if (arr[i]==arr[j]) {
            break;
            i=j;
          }
          encontrados = 0;
        }
        */

// cuando encuentres el final, i=j
// si al buscar, j>=i; paramos la busqueda;
//aunque encuentres dos bloques continuos, el más grande va a llenar de agua;

// si i<i+1 debo intercambiarlos.

            //distancia entre ellos
            //dis = j-i -1 // -1 es necesario. ej, posiciones contiguas 3-2 = 1 (no hay un bloque en medio) pero, si le restamos uno, nos quedará el que necesitamos
            //espacios+= (j-i)*arr[i]

          }

/*
       i=z;
      }
    }
  }
*/
