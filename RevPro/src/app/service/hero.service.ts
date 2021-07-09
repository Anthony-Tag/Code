import { Injectable } from '@angular/core';
import { Observable, of} from 'rxjs';

import { Hero } from '../hero';
import { Heros } from '../mock-list';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  constructor() { }

  getHeroes():Observable<Hero[]>{
    const heroes =of(Heros);
    return heroes;
  }
}
