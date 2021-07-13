import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { catchError, map, tap} from 'rxjs/operators';

import { Hero } from '../hero';
import { Heros } from '../mock-list';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  private heroesURL = 'api/heroes';
  constructor(
    private http: HttpClient,

  ) { }

  getHeroes(): Observable<Hero[]> {
    return this.http.get<Hero[]>(this.heroesURL).pipe(catchError(this.handleError<Hero[]>('getHeroes', [])));
  }
  getHero(id: number): Observable<Hero> {
    const url=`${this.heroesURL}/${id}`;
    return this.http.get<Hero>(url).pipe(tap(
      _=>console.log(`fetch hero id=${id}`)
    ),catchError(this.handleError<Hero>('getHero id=${id}'))
    );
  }

  deleteHero(id: number): Observable<Hero> {
    const url=`${this.heroesURL}/${id}`;
    return this.http.delete<Hero>(url).pipe(tap(
      _=>console.log(`delete hero id=${id}`)
    ),catchError(this.handleError<Hero>('getHero id=${id}'))
    );
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    }
  }
}
