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

<h4> ofNullable() </h4>
Este método verifica se existe um objeto/valor, caso sim, vai retornar um Optional, caso não,
retornará um Optional vazio.

Exemplo:

```
public class ContactDAO {
 public Optional<Contact> searchByName(String name) {
  return Optional.ofNullable(null);
 }
}
```

<a href="https://github.com/inessouza/java/tree/main/8/Optional/src/ex01">Veja mais</a>

<h3> Fontes: </h3>

<ul>
  <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html">Documentação - Oracle - Java 8 - Optional</a></li>
  <li><a href="https://medium.com/@racc.costa/optional-no-java-8-e-no-java-9-7c52c4b797f1">Medium - Optional</a></li>
</ul>
