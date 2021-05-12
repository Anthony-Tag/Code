import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http"
import { Observable } from 'rxjs';
import { IPokemon } from './poke';

@Injectable({
  providedIn: 'root'
})
export class PokeService {
  private url = "https://pokeapi.co/api/v2/pokemon/123";
  private url2 = "https://pokeapi.co/api/v2/pokemon/";
  constructor(private httpFly: HttpClient) {

  }
  retrievePokemon(): Observable<string>
  {
    return this.httpFly.get<string>(this.url);
  }

  retrievePokemonTwo(): Observable<IPokemon>
  {
    return this.httpFly.get<IPokemon>(this.url);
  }

  retrievepokemonThree(poke:string): Observable<IPokemon>
  {
    return this.httpFly.get<IPokemon>(this.url2 + poke);
  }
  }

