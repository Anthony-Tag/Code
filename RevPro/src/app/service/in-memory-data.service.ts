import { Injectable } from '@angular/core';
import { Hero } from '../hero';
import { InMemoryDbService, RequestInfo } from 'angular-in-memory-web-api';
import { HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDataService{

  createDB(){
    const heroes=[
      {id:1, name:'Example1'},
      {id:2, name:'Example2'},
      {id:3, name:'Example3'},
      {id:4, name:'Example4'},
      {id:5, name:'Example5'},
      {id:6, name:'Example6'},
    ];

    return heroes;
  }

  getId(heroes:Hero[]):number{
    return heroes.length>0 ? Math.max(...heroes.map(hero=> hero.id))+1: 11;
  }

  constructor() { }


}
