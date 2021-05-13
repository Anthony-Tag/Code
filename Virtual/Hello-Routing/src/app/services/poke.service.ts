import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import { IPokemon } from './poke';

@Injectable({
  providedIn: 'root'
})
export class PokeService {

  private url = "https://pokeapi.co/api/v2/pokemon/123"; //This url should give us Scyther
  private url2 = "https://pokeapi.co/api/v2/pokemon/"; //This url should give us any pokemon we want 

  constructor(private httpFly: HttpClient) { }

  retrievePokemon(): Observable<string>
  {
    return this.httpFly.get<string>(this.url);
  }

  retrievePokemonTwo(): Observable<IPokemon>
  {
    return this.httpFly.get<IPokemon>(this.url);
  }

  retrievePokemonThree(poke:string): Observable<IPokemon>
  {
    return this.httpFly.get<IPokemon>(this.url2 + poke);
  }
}
