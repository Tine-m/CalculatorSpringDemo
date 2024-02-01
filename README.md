### Eksempel på lommeregner med HTML og SpringBoot @Rest controller

#### Hvordan kalder man programmet?
<p>Bemærk at <i>index.html</i> automatisk bliver vist, hvis man i URL skriver: </p>
  
```
http://localhost:8080
```
<p>Hvis man skal have vist <i>calculator2.html</i> skal man skrive:</p>

```
http://localhost:8080/calculator2.html
```

<i>calculator2.html</i> viser regnearter i en dropdownliste, som brugeren kan vælge imellem.

#### Endpoints
@RestController har to endpoints:
- <i>/calc</i> der har tre paramtre for hhv. talværdier og regneart
- <i>/calc2</i> der har de samme tre paramtre for hhv. talværdier og regneart i en Map.
 
