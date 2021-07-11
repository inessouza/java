<h2>Prática - Java 8 - Optional</h2>

<h3> Introdução Optional </h3>

<p>
  Optional surgiu na versão 8 do Java com o propósito de verificar se existe um objeto ou não existe um objeto, é um novo conceito para resolver objetos nulos.
</p>

<p> 
  Antes da versão 8 do Java, para resolver objetos nulos era necessário verificar com 'if' ou tratar com 'try/catch'.
</p>

<h4> Exemplo com IF: </h4>

``` 
Address address = null;
if (address != null) {
    System.out.println(address.getAllAdress());
  } else {
    System.out.println("A variável é nula, não referencia um objeto!");
  }
}
```

<h4> Exemplo com Try/Catch: </h4>

```
try {
  System.out.println(address.getAllAdress());
} catch (NullPointerException e) {
  System.out.println(e.getMessage());
}
```
